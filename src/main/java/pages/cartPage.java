package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.testng.Assert;

public class cartPage {
	
	WebDriver driver;
	
	double fstItemPrice, sndItemPrice;

	public cartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setFirstItemPrice(double x) {
		fstItemPrice = x;
	}
	
	
	public void validateTotalItemPrice() {
		
		//Get price of first Item
		WebElement fstPrice = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[4]/span/span[1]"));
		double firstItemPrice = Double.parseDouble(fstPrice.getText().substring(1));
		
		//Get Price of second Item
		WebElement secondPrice = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[4]/span/span"));
		double secondItemPrice = Double.parseDouble(secondPrice.getText().substring(1));
		
		// Calaculate Total price 
		double total = firstItemPrice+ secondItemPrice + 2;
		String TotalPrice = "$" + total;

		WebElement totalPrice = driver.findElement(By.xpath("//*[@id=\"total_price\"]"));

		Assert.assertEquals(TotalPrice, totalPrice.getText());
		//Assert.assertEquals(totalPrice.getText(), "$81.97");

		
	}



}
