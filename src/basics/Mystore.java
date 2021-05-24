package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mystore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		WebElement button = driver.findElement((By.cssSelector("[class='bx-controls-direction'] [class='bx-prev']")));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("var clicks = 0; while (clicks < 2) {arguments[0].click(); clicks++;}", button);
		Thread.sleep(3000);
//		driver.findElement((By.xpath("//img[contains(@src,'modules/homeslider/images/sample')]"))).click();
		driver.findElement((By.xpath("//div[@id='homepage-slider']"))).click();
		
//		WebDriverWait  Wait = new WebDriverWait(driver,100);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"homeslider\"]/li[2]/a/img")));
//
//		WebElement ele = driver.findElement(By.xpath("//*[@id=\"homeslider\"]/li[2]/a/img"));
//		ele.click();
		driver.navigate().back();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[title='Women']"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 60); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='T-shirts'])[1]")));  // until this submenu is found
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
		a.moveToElement(driver.findElement(By.xpath("//img[contains(@title,'Faded Short')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		
		
	}

	
}
