package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage {

	WebDriver driver;
	
	public signInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void insertExistingEmailAddress(String email) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement emailTxtField = driver.findElement(By.id("email"));
		emailTxtField.sendKeys(email);

	}
	
	public void insertPassword(String Password) {
		WebElement passwordTxtField = driver.findElement(By.id("passwd"));
		passwordTxtField.sendKeys(Password);

	}
	
	//Click on SigIn button
	public void clickOnSigninBtn() {
		WebElement SigninBtn = driver.findElement(By.id("SubmitLogin"));
		SigninBtn.click();

	}
}
