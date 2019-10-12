package Automation.php;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FlightSearch extends Launch
{
	By fromClick= By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
	By from= By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
	By toClick= By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
	By to= By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
	By departureDate= By.xpath("//input[@id='departure']");
	By guestsClick= By.xpath("//input[@name='totalManualPassenger']");
	By adults= By.xpath("//select[@id='madult']");
	By child= By.xpath("//select[@id='mchildren']");
	By infant= By.xpath("//select[@id='minfant']");
	By done= By.xpath("//button[@id='sumManualPassenger']");
	By oneWay= By.xpath("//div[@class='tab-content shad RTL_shad search-form']//div[1]//div[1]//div[1]//ins[1]");
	By search= By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
	
	WebElement fromClick(){
		return driver.findElement(fromClick);
	}
	
	WebElement from(){
		return driver.findElement(from);
	}
	
	WebElement toClick() {
		return driver.findElement(toClick);
	}
	
	WebElement to() {
		return driver.findElement(to);
	}
	
	WebElement departureDate() {
		return driver.findElement(departureDate);
	}
	
	WebElement guestClick() {
		return driver.findElement(guestsClick);
	}
	
	WebElement adults() {
		return driver.findElement(adults);
	}
	
	WebElement child() {
		return driver.findElement(child);
	}
	
	WebElement infantb() {
		return driver.findElement(infant);
	}
	
	WebElement done() {
		return driver.findElement(done);
	}
	
	WebElement oneWay() {
		return driver.findElement(oneWay);
	}
	
	WebElement searchButton() {
		return driver.findElement(search);
	}
	
	

}
