package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Framemisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int fnum = findframenum(driver,By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		driver.switchTo().frame(fnum);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		driver.switchTo().defaultContent();
		int fnum1 = findframenum(driver,By.xpath("//div[@id='recaptcha-verify-button']"));
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='recaptcha-verify-button']")));
		driver.switchTo().frame(fnum1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		
	}
// if there is alert case, put alert code in try block, catch block will have some statements like alert handled
	//so even if alert does not appear then it skips the try/catch and resumes execution
	public static  int findframenum(WebDriver driver,By by)
	{
		
		int fcount = driver.findElements(By.tagName("iframe")).size();
		int i;
		for ( i = 0; i< fcount;i++)
		{
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			
			if (count>0)
			{
				driver.findElement(by);
				break;
			}
			else
			{
				System.out.println("continue");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
}
