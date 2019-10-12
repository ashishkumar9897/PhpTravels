package Automation.php;

import org.testng.annotations.Test;

public class LogInTest 
{
	

	@Test
	public static void Login() throws Exception 
	{
		Launch l = new Launch();
		BasicCommands bc= new BasicCommands();
		//Launch l =new Launch();
		//HomePage h1= new HomePage();
		l.launchPage();
		Launch.driver.get(Launch.prop.getProperty("url"));
		bc.signUp();
		
		Resource r1= new Resource();
		r1.FirstName().sendKeys(Launch.prop.getProperty("FirstName"));
		r1.LastName().sendKeys(Launch.prop.getProperty("LastName"));
		r1.Mobile().sendKeys(Launch.prop.getProperty("Mobile"));
		r1.Email().sendKeys(Launch.prop.getProperty("Email"));
		r1.Password().sendKeys(Launch.prop.getProperty("password"));
		r1.ConfirmPassword().sendKeys(Launch.prop.getProperty("ConfirmPassword"));
		r1.SignUp();
		//bc.signUp();
		Launch.driver.get(Launch.prop.getProperty("url"));
		HomePage h= new HomePage();
		h.LogIn();
		LogIn l1= new LogIn();
		l1.loginEmail().sendKeys(Launch.prop.getProperty("Email"));
		l1.loginPassword().sendKeys(Launch.prop.getProperty("password"));
		l1.loginButton().click();
		
	
	}	


}
