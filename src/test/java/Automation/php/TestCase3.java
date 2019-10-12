package Automation.php;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase3
{
	static By month= By.xpath("//div[16]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");
	
	
	@Test
	public static void fightSearch() throws Exception{
		
		
		HomePage h1= new HomePage();
		h1.launchPage();
		Launch.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Launch.driver.get(Launch.prop.getProperty("url"));
		h1.flights().click();
		
		FlightSearch f1= new FlightSearch();
		f1.fromClick().click();
		f1.from().sendKeys(Launch.prop.getProperty("fromLocation"));
		Launch.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+Launch.prop.getProperty("fromLocation")+"')]")).click();
		f1.toClick().click();
		f1.to().sendKeys(Launch.prop.getProperty("toCity"));
		Launch.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+Launch.prop.getProperty("toCity")+"')]")).click();
		f1.departureDate().click();
		
		String str = Launch.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(Launch.prop.getProperty("departureMonthYear"))) {
			Launch.driver.findElement(next).click();
			str= Launch.driver.findElement(month).getText();
		}
		
		checkInDate(Launch.prop.getProperty("departureDate"));
		
		f1.guestClick().click();
		f1.adults().click();
		f1.adults().sendKeys(Launch.prop.getProperty("fAdults"));
		int aval = Integer.parseInt(Launch.prop.getProperty("fAdults"));
		Launch.driver.findElement(By.xpath("//select[@id='madult']//option[@value='"+aval+"']")).click();
		
		f1.child().click();
		f1.child().sendKeys(Launch.prop.getProperty("fChild"));
		int cval = Integer.parseInt(Launch.prop.getProperty("fChild"));
		Launch.driver.findElement(By.xpath("//select[@id='mchildren']//option[@value='"+cval+"']")).click();
		
		f1.infantb().click();
		f1.infantb().sendKeys(Launch.prop.getProperty("fInfant"));
		int ival= Integer.parseInt(Launch.prop.getProperty("fInfant"));
		Launch.driver.findElement(By.xpath("//select[@id='minfant']//option[@value='"+ival+"']")).click();
		f1.done().click();
		Thread.sleep(1000);
		
		f1.searchButton().click();
	}

	public static void checkInDate(String date){
		
		String d;
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = Launch.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = Launch.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									Launch.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	}	

}
