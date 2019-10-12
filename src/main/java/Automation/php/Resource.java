package Automation.php;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Resource extends Launch{
	By SignUp =By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	By gotit = By.xpath("//button[@id='cookyGotItBtn']");
	By MyAccount =By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By Mobile =By.xpath("//input[@placeholder='Mobile Number']");
	By FirstName =By.xpath("//input[@placeholder='First Name']");
	By LastName =By.xpath("//input[@placeholder='Last Name']");
	By Email = By.xpath("//input[@placeholder='Email']");
	By Password =By.xpath("//input[@placeholder='Password']");
	By ConfirmPassword =By.xpath("//input[@placeholder='Confirm Password']");
	By LogIn =By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	//public static WebDriver driver;
	public void SignUp() throws InterruptedException 
	{
		driver.findElement(gotit).click();
		driver.findElement(SignUp).click();
		//driver.findElement( LogIn).click();
		
	}
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement LastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement Mobile()
	{
		return driver.findElement(Mobile);
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement ConfirmPassword()
	{
		return driver.findElement(ConfirmPassword);
	}
	
	
}
