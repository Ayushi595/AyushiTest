package Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import STD_LIB.LoadTime;



public class Searchflight {



	public  void flightsearch(WebDriver driver,String start,String destination){
		
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).sendKeys(start);
		//driver.findElement(By.xpath("//*[@id=FromTag]")).sendKeys(start);
		driver.findElement(By.id("ToTag")).sendKeys(destination);
		//driver.findElement(By.xpath("//*[@id=ToTag]")).sendKeys(destination);
		driver.findElement(By.className("depart_date")).sendKeys("Sun, 10 Mar, 2020");
		//driver.findElement(By.className("return_date")).sendKeys("Sun, 8 Mar, 2020");
		driver.findElement(By.id("SearchBtn")).click();
		LoadTime loadtime=new LoadTime();
		loadtime.starttime();
		//**applying wait  for page load on condition**//
		(new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
		    public Boolean apply(WebDriver d) {
		        return d.findElement(By.className("booking")).isDisplayed();
		    }
		});
		
		//**fetching page load end time**// 
		loadtime.endtime();

		
		//**fetching page load  time**//
		double totaltime=(double)loadtime.totaltime();
		System.out.println(totaltime);
		
		//**Selecting the one stop fight**//
		driver.findElement(By.xpath("//*[@id=flightForm]/section[2]/div[4]/div[1]/nav/ul/li[1]/div/label/table/tbody[1]/tr[1]/th[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=flightForm]/section[2]/div[4]/div[1]/nav/ul/li[3]/div/label/table/tbody[1]/tr[1]/th[1]/input")).click();
		
		//**Booking button**//
		driver.findElement(By.className("booking")).click();
		
		
	}
	
}
