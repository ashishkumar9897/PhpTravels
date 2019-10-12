package Automation.php;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TourSearch  extends Launch 
{
	By searchClick= By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	By selectCity= By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	By date= By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	By guests= By.xpath("//select[@id='adults']");
	By search= By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	
	WebElement city() {
		return driver.findElement(searchClick);
	}
	
	WebElement selectCity() {
		return driver.findElement(selectCity);
	}
	
	WebElement tourDate() {
		return driver.findElement(date);
	}
	
	WebElement guest() {
		return driver.findElement(guests);
	}
	
	WebElement searchButton() {
		return driver.findElement(search);
	}

}
