package Automation.php;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase2 
{
	static By month= By.xpath("//div[14]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[14]//div[1]//tr[1]//th[3]");
	static By month1= By.xpath("//div[15]//div[1]//tr[1]//th[2]");
	static By next1=By.xpath("//div[15]//div[1]//tr[1]//th[3]");

	//Hotel search
	@Test
	public static void hotelSearch() throws Exception {
	
		HomePage hp= new HomePage();
		hp.launchPage();
		
		Launch.driver.get(Launch.prop.getProperty("url"));
		hp.hotels().click();
		
		HotelSearch hs= new HotelSearch();
		
		//hotel or city name
		hs.searchButton().sendKeys(Launch.prop.getProperty("SearchElement"));
		Launch.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+Launch.prop.getProperty("SearchElement")+"')]")).click();
		
		
		//check in
		hs.checkIn().click();
		String str = Launch.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(Launch.prop.getProperty("checkInMonthYear"))) {
			Launch.driver.findElement(next).click();
			str= Launch.driver.findElement(month).getText();
		}
		
		checkInDate(Launch.prop.getProperty("checkInDate"));
		
		//check out
        String str1 = Launch.driver.findElement(month1).getText();
		
		while(!str1.equalsIgnoreCase(Launch.prop.getProperty("checkOutMonthYear"))) {
			Launch.driver.findElement(next1).click();
			str1= Launch.driver.findElement(month1).getText();
		}
		
		checkOutDate(Launch.prop.getProperty("checkInDate"));
		
		hs.guests().click();
		hs.adults().clear();
		hs.child().clear();
		hs.adults().sendKeys(Launch.prop.getProperty("adults"));
		hs.child().sendKeys(Launch.prop.getProperty("child"));
		hs.hotelSearchButton().click();
	}
	
	public static void checkInDate(String date){
		
		String d;
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = Launch.driver.findElement(By.xpath("//div[14]//tr["+i+"]//td["+j+"]")).getText();
				if(d.equals(date))
					Launch.driver.findElement(By.xpath("//div[14]//tr["+i+"]//td["+j+"]")).click();
			}
		}
	}
	
	
public static void checkOutDate(String date){
		
		String d;
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = Launch.driver.findElement(By.xpath("//div[15]//tr["+i+"]//td["+j+"]")).getText();
				if(d.equals(date))
					Launch.driver.findElement(By.xpath("//div[15]//tr["+i+"]//td["+j+"]")).click();
			}
		}
	}
	
	
}
