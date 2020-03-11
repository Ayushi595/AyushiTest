package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.Searchflight;

public class Testsearchflight {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AYUSHI\\workspace\\com.rel.jio\\libs\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://www.cleartrip.com/");
	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String ttl=driver.getTitle();
			System.out.println(ttl);
	Searchflight srchflt=new Searchflight();
	srchflt.flightsearch(driver,"Bangalore", "Delhi");
	
	

}

}