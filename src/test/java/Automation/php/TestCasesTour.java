package Automation.php;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestCasesTour 
{

	static By month= By.xpath("//div[11]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[11]//div[1]//tr[1]//th[3]");
	static By guests= By.xpath("//select[@id='adults']");
	static By tourType= By.xpath("//select[@id='tourtype']");

	@Test
	public static void tourSearch() throws Exception {
		
		HomePage h1= new HomePage();
		h1.launchPage();
		Launch.driver.get(Launch.prop.getProperty("url"));
		h1.tours().click();
		
		TourSearch t1= new TourSearch();
		t1.city().click();
		
		String city= Launch.prop.getProperty("tourName");
		Launch.driver.findElement(By.xpath("//div[@class='select2-result-label'][contains(text(),'"+city+"')]")).click();
		
		//date
		t1.tourDate().click();
		String str = Launch.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(Launch.prop.getProperty("tourMonthYear"))) {
			Launch.driver.findElement(next).click();
			str= Launch.driver.findElement(month).getText();
		}
		
		tourDate(Launch.prop.getProperty("tourDate"));
		
		//no. of guests
		Select guest= new Select(Launch.driver.findElement(guests));
		guest.selectByVisibleText(Launch.prop.getProperty("tGuests"));
		
		//tour type
		Select tr= new Select(Launch.driver.findElement(tourType));
		tr.selectByValue("187");
		
		t1.searchButton().click();
		Thread.sleep(10000);
		Launch.driver.close();
	}
	
public static void tourDate(String date){
		
		String d;
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = Launch.driver.findElement(By.xpath("//div[11]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = Launch.driver.findElement(By.xpath("//div[11]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									Launch.driver.findElement(By.xpath("//div[11]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
}

}
