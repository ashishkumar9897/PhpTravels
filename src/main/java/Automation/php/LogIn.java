package Automation.php;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogIn extends Launch {

	By email= By.xpath("//input[@placeholder='Email']");
	By password= By.xpath("//input[@placeholder='Password']");
	By login= By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	
	WebElement loginEmail() {
		return driver.findElement(email);
	}
	
	WebElement loginPassword() {
		return driver.findElement(password);
		}
	
	WebElement loginButton() {
		return driver.findElement(login);
	}
}
