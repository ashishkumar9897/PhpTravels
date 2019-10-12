package Automation.php;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class HotelSearch extends Launch
{
	By searchButtonClick= By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	By searchButton= By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	By checkIn= By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	By guests= By.xpath("//input[@id='htravellersInput']");
	By adults= By.xpath("//input[@id='hadultInput']");
	By child= By.xpath("//input[@id='hchildInput']");
	By search= By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");
	
	
	public WebElement searchButton() {
		driver.findElement(searchButtonClick).click();
		return driver.findElement(searchButton);
	}
	
	public WebElement checkIn() {
		return driver.findElement(checkIn);
	}
	
	public WebElement guests() {
		return driver.findElement(guests);
	}
	
	public WebElement adults(){
		return driver.findElement(adults);
	}
	
	public WebElement child() {
		return driver.findElement(child);
	}
	
	public WebElement hotelSearchButton(){
		return driver.findElement(search);
	}

}
