package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Enter the letters BENG
//Verify if Airport option is displayed in the suggestive box
public class AutoSuggestive {

public static void main(String[] args) throws InterruptedException {
//TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.ksrtc.in");
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
	System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText()); //since element is hidden it will not show using this statement
	//jscript DOM can extract hidden elements, because selenium cannot identify hidden elements - (Ajax implementation)
	//investigate the properties of object if it have any hidden text

	//JavascriptExecutor
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	String script = "return document.getElementById(\"fromPlaceName\").value;";
	String text=(String) js.executeScript(script);
//	System.out.println(text);
	int i = 0;
	while(!text.equalsIgnoreCase("BENGALURU INTERNTION AIrRPRT"))
	{
		i++;
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		text=(String) js.executeScript(script);
		System.out.println(text);
		if(i>5)
		{
//			System.out.println("element not found");
			break;
		
		}
	}
	if(i>5)
	{
		System.out.println("element not found");
	}
	else
		System.out.println("element found");
}
}