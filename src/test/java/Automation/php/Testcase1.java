package Automation.php;
import org.testng.annotations.Test;
public class Testcase1 extends BasicCommands
{
	//User registration
		@Test
		public static void userRegistration() throws Exception 
		{
			Launch l = new Launch();
			BasicCommands bc= new BasicCommands();
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
		}	

}
