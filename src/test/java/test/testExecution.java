package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.cartPage;
import pages.homePage;
import pages.myAccountPage;
import pages.searchResultPage;
import pages.signInPage;

public class testExecution {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome = new ChromeDriver();
		
		chrome.navigate().to("http://automationpractice.com");
		
		chrome.manage().window().maximize();
		
		// Click on SignIn btn
		homePage home = new homePage(chrome);
		home.clickOnSignInBtn();
		
		// Signin with existing user email and password
		signInPage logIn = new signInPage(chrome);
		logIn.insertExistingEmailAddress("buford.beer@yahoo.com");
		logIn.insertPassword("0304335");
		logIn.clickOnSigninBtn();
		
		// Search for "dress"
		myAccountPage accPage = new myAccountPage(chrome);
		accPage.searchForProduct();
		
		// Add Product to cart
		searchResultPage searchResult = new searchResultPage(chrome);
		searchResult.addFirstItemToCart();
		searchResult.addSecondItemToCart();
		searchResult.openCart();
		
		// Validate Total Item Price
		cartPage cartValidation = new cartPage(chrome);
		cartValidation.validateTotalItemPrice();
		
		// Close the chrome
		tearDown(chrome);
	}
	
	
	public static void tearDown(WebDriver fireFoxdriver) {
		fireFoxdriver.quit();
	}

}
