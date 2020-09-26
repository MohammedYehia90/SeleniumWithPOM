package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//click on Sigin button
	
	public void clickOnSignInBtn() {
		WebElement siginBtn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
		siginBtn.click();
	}

}
