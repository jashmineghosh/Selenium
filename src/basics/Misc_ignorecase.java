package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Misc_ignorecase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.guru99.com/");
//		String locator = "//a[" + ignoreCaseEqualsXPath("text()","learn sap sd") + "]";
//		driver.findElement(By.xpath(locator)).click();
//		
//		try {
//			
//		WebDriverWait wait=new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
//		}
//		finally{
//		System.out.println("frame viewed");
//		Thread.sleep(7000);
//		}
//		driver.switchTo().defaultContent();
				
//		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'What should I know?')]")).getText());
//		System.out.println(driver.findElement(By.xpath("//div[@itemprop='articleBody']/p")).getText());
//		System.out.println(driver.findElement(By.xpath("//a[contains(@href,'master-by-t')]")).getText());
//		driver.findElement(By.xpath("//span[@class='fa fa-hand-o-right']/following-sibling::a")).click();
//		driver.navigate().back();
//		driver.navigate().back();
//		List <WebElement> dateBox1 = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='g-content g-particle']"));
//		//Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
//        for (WebElement webElement1 : dateBox1) {
//            System.out.println(webElement1.getText());
//        }     
		//Search All elements in 'Popular course' section 
				//with the help of ancestor of the anchor whose text is 'SELENIUM'
		
//		List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='Selenium']]/ancestor::div[@class='g-block box4 size-17']/following-sibling::div"));
		//Print all the which are sibling of the element named as 'SELENIUM' in 'Popular course'

//        for (WebElement webElement : dateBox) {
//            System.out.println(webElement.getText());
//        }
     
//		driver.close();
		/*******************/
		driver.get("http://www.qaclickacademy.com/index.php");
		driver.findElement(By.cssSelector("ul > li:nth-of-type(5)")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerlink = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerlink.findElements(By.tagName("a")).size());
		WebElement footer1 = footerlink.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int col = footer1.findElements(By.tagName("a")).size();
		for(int i = 0 ; i<col;i++)
		{
			String clickonlink= 	Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer1.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	driver.quit();
	}
//	value - String value to check, i.e. 'Cancel'
//    * @return String formatted section of XPath to match string ignoring case
//    *         in the format: translate(attribute, 'ABC...', 'abc...') = 'value')
//	 public static String ignoreCaseEqualsXPath(String attribute, String value) {
//	    	
//	    	return "translate(" + attribute + 
//	    		   ", 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '" +
//	    		   value.toLowerCase() + "'";
//	}



}
