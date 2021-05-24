package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class childWinexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/SignUp?hl=en");
		System.out.println(driver.getTitle());
		WebElement learn = driver.findElement(By.linkText("Learn more"));
			//driver.findElement(By.linkText("Learn more")).click();
			WebDriverWait wait=new WebDriverWait(driver, 30);
			
			wait.until(ExpectedConditions.visibilityOf(learn));
			System.out.println("Before clicking no of windows available: " + driver.getWindowHandles().size());
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(learn.isDisplayed()) 
			{
				learn.click();
			Set<String>ids = driver.getWindowHandles();
			
			Iterator<String> it= ids.iterator();
			it.hasNext();
			String parentid = it.next();
			String childid = it.next();
			driver.switchTo().window(childid);
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			WebElement privacy =  driver.findElement(By.partialLinkText("Privacy"));
			WebDriverWait wait2=new WebDriverWait(driver, 30);
			
			wait.until(ExpectedConditions.visibilityOf(privacy));
			if(privacy.isDisplayed())
			{
				driver.findElement(By.partialLinkText("Privacy")).click();
			
			Set<String>ids1 = driver.getWindowHandles();
			
			Iterator<String> it1= ids1.iterator();
			it1.hasNext();
			String parentid1 = it1.next();
			String childid1 = it1.next();
			String childid2 = it1.next();
			driver.switchTo().window(childid2);
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().window(parentid1);
			System.out.println(driver.getCurrentUrl());
			}
			}
			
	}

}
