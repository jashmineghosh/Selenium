package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Calender {
//in this prg we are not hard-coding by selecting the xpath of the date
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.name("travel_date")).click();
		
//		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead")).getText().contains("May"))
//		{
//			driver.findElement(By.cssSelector("th[class='next']")).click();
//		}
		driver.findElement(By.xpath("//th[@class='datepicker-switch']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='table-condensed']/thead/tr/th[2]")).click();
		Thread.sleep(3000);
		while(!driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[3]")).getText().contains("2019"))
		{
			driver.findElement(By.xpath("(//table[@class='table-condensed']/thead/tr/th[3])[2]")).click();	
		}
		int yearsCount= driver.findElements(By.xpath("//div[@class='datepicker-years']/table/tbody/tr/td/span")).size();
		for (int i = 0;i<yearsCount;i++)
		{
			String text = ((List<WebElement>) driver.findElements(By.xpath("//div[@class='datepicker-years']/table/tbody/tr/td/span"))).get(i).getText();
		if(text.equalsIgnoreCase("2019"))	
		{
			((List<WebElement>) driver.findElements(By.xpath("//div[@class='datepicker-years']/table/tbody/tr/td/span"))).get(i).click();
			break;
		}
		}
		int monthsCount= driver.findElements(By.xpath("//div[@class='datepicker-months']/table/tbody/tr/td/span")).size();
		for (int i = 0;i<monthsCount;i++)
		{
			String text = ((List<WebElement>) driver.findElements(By.xpath("//div[@class='datepicker-months']/table/tbody/tr/td/span"))).get(i).getText();
		if(text.equalsIgnoreCase("may"))	
		{
			((List<WebElement>) driver.findElements(By.xpath("//div[@class='datepicker-months']/table/tbody/tr/td/span"))).get(i).click();
			break;
		}
		}
		
//		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
//		{
//		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
//		}
		int count = driver.findElements(By.cssSelector(".day")).size();
		//List<WebElement> dates = driver.findElements(By.cssSelector(".day")); //we can either put hte elements in list here or below in code when we use it for traversal, cast it to List<Webelement>
		for (int i = 0;i<count;i++)
		{
			String text = ((List<WebElement>) driver.findElements(By.cssSelector(".day"))).get(i).getText();
		if(text.equalsIgnoreCase("21"))	
		{
			((List<WebElement>) driver.findElements(By.cssSelector(".day"))).get(i).click();
			break;
		}
		}
		
	}

}
