package basics;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Formmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Is displayed is used when particular object is in code base but it is in visible mode or not

		driver.get("http://www.makemytrip.com/");

		System.out.println(" Before clikcing on Multi city Radio button");

		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());

//		System.out.println(driver.findElement(By.xpath("//span[@class='ch__loginIcon']")).isEnabled());
//
//		System.out.println(" After clikcing on Multi city Radio button");
//		driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
//		
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();;
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='js-filterOptins']/div/div/div/div/table/tbody/tr[3]/td[3]")));
		System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());
		driver.findElement(By.xpath("//div[@id='js-filterOptins']/div/div/div/div/table/tbody/tr[3]/td[3]")).click();
		
				
//		driver.findElement(By.xpath("//input[@id='hp-widget__paxCounter_pot']")).click();
//		driver.findElement(By.xpath("//ul[@id='js-adult_counter']//li[contains(text(),'3')]")).click();
//		/*int i=0;
//
//		while(i<5)
		
//
//		{
//
//		driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();
//
//		i++;
//
//		} old code*/
//
//		//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
//
//		//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());
//
//		Thread.sleep(3000L);
//
//		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Discover Hot Deals')]")).getText());
//
////		//If you want to validate the object which is present in web page or code base
//
//		int count=driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();
//
//		if (count==0)
//
//		{
//
//		System.out.println("verified");
//
//		}
	}

}
