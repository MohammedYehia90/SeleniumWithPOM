package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myAccountPage {

	WebDriver driver;

	public myAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSignOut() {
		WebElement signoutBtn = driver.findElement(By.cssSelector("a.logout"));
		signoutBtn.click();
	}

	public void searchForProduct() {
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("dress");
		
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
		searchBtn.click();	
	}
}
