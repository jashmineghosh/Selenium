package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserinvokeChr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click(); //xpath with parent child traverse, when nothing is unique to be identified for an element, we use this feature
//			driver.get("https://www.guru99.com/");
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getPageSource());
//			System.out.println(driver.getCurrentUrl());
//			driver.close();
		driver.get("http://www.qaclickacademy.com/");
		//driver.findElement(By.xpath("//body[@id='homepage']/header/div/div/nav/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Home')]/../following-sibling::li[3]")).click();
	//	driver.findElement(By.linkText("Interview Guide")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).getText());
		//System.out.println(driver.findElement(By.cssSelector("li[id='tablist1-tab1']/following-sibling::li[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul")).getAttribute("role"));
	}

}
