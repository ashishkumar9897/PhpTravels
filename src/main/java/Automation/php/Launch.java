package Automation.php;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch
{

	public static WebDriver driver;
	public static Properties prop = new Properties ();
	
		
		public void launchPage() throws Exception
		{
		
			FileInputStream fls= new FileInputStream("C:\\Eclips Workspace\\PhpTravelsTesting\\src\\main\\java\\Files\\base.properties");
			prop.load(fls);
			System.setProperty("webdriver.chrome.driver", "C:\\project 001\\browser drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   
		   
		   
		   
		}
	}


