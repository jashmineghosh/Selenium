package basics;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("glbfooter"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());
		int count1 = footer.findElements(By.tagName("a")).size();
		int i;
		String Beforeclicking = null;
		String Afterclicking ;
		//this portion we print all links on home page till we get site map, then click on site map, also we validate the navigation happened successfully
		for( i =0;i<count1;i++)
		{
			System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
			if(footer.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{System.out.println(driver.getTitle());
			Beforeclicking = driver.getTitle();
				footer.findElements(By.tagName("a")).get(i).click();
				break;
			}
		
		}
		System.out.println(driver.getTitle());
		Afterclicking= driver.getTitle();
		if(Beforeclicking!=Afterclicking)
		{
			if(driver.getPageSource().contains("sitemap"))
		
				System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		//this portion we print all links on home page, then we click on site map, we count all links on that site map page
//		for( i =0;i<count1;i++)
//			{
//				System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
//			}
//		System.out.println(driver.getTitle());
//		for( int ii =0;ii<count1;ii++)
//		{
//				if(footer.findElements(By.tagName("a")).get(ii).getText().contains("Site map"))
//				{
//					footer.findElements(By.tagName("a")).get(ii).click();
//					System.out.println(driver.getTitle());
//					break;
//				}
//			
//		}
//		System.out.println(driver.findElements(By.tagName("a")).size());		
//		
	}
//public void abc() {
//	System.out.println("hi");
	
}

