package Automation.php;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Launch
{
	By MyAccount =By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By SignUp =By.xpath("(//a[contains(text(),'Sign Up')])[2]"); 
	By LogIn =By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
	By hotels = By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By flights = By.xpath("//div[@id='body-section']//li[2]//a[1]");
	By tours = By.xpath("//a[@href='#tours']");
	
	
	void signUp()
	{
		driver.findElement( MyAccount).click();
		driver.findElement(SignUp).click();
	}
	
	void LogIn()
	{
		driver.findElement(MyAccount).click();
		driver.findElement( LogIn).click();;
		
	}
	WebElement hotels()
	{
		return driver.findElement(hotels);
	}
	
	  WebElement flights()
	  {
		  return driver.findElement(flights);
	  }
	  WebElement tours()
	  {
		  return driver.findElement(tours);
	  }

}
