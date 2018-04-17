package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserinvokeFFAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basic methods of webdriver
		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//	driver.get("https://www.guru99.com/");
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getPageSource());
//	System.out.println(driver.getCurrentUrl());
//	driver.close();
	
//handling alert
driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
	
	}

}
