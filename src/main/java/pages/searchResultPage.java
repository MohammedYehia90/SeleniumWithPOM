package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class searchResultPage {

	WebDriver driver;

	public searchResultPage(WebDriver driver) {
		this.driver = driver;
	}


	public void addFirstItemToCart()
	{
		// Hover on first Item to be able to show add cart button
		Actions hover = new Actions(driver);
		WebElement fstItem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
		hover.moveToElement(fstItem).perform();

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		// Add first Item in Cart

		WebElement firstItem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
		firstItem.click();

		// click on continue shopping

		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")));

		// click on the continue shopping button as soon as it is visible
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")).click();


		
	}

	public void addSecondItemToCart() {

		// Hover on second Item to be able to show add cart button
		Actions hover2 = new Actions(driver);
		WebElement scndItem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]"));
		hover2.moveToElement(scndItem).perform();

		// Add second Item in Cart

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement secondItem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
		//WebElement secondItem = driver.findElement(By.cssSelector("a.button ajax_add_to_cart_button.btn btn-default"));
		secondItem.click();


		// Explicit Wait to Get Price of second Item and Click on Continue Shopping button
		WebDriverWait wait2 = new WebDriverWait(driver,30);

		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")));

		// click on the continue Shopping button as soon as it is visible
		driver.findElement(By.xpath("//html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")).click();
		
	
	}
	

	public void openCart() {
		WebElement clickOnCart = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a"));
		clickOnCart.click();
	}


}
