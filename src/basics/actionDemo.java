package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//WebElement move = driver.findElement(By.xpath(".//div[@id='nav-tools']/a[2]/span[2]")); //use this to make script more readable
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(".//div[@id='nav-tools']/a[2]/span[2]"))).contextClick().build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").click().build().perform();
	}

}
