package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		//driver.manage().window().maximize() ;
		//code for dropdown
//		Select s = new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")));
//		s.selectByIndex(1);
//		s.selectByValue("4");
//		s.selectByVisibleText("9");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divAdult']/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//div[@id='divAdult']/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//div[@id='divAdult']/div[2]/span[3]")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//a[@value='DEL']")).click();
//		WebDriverWait wait=new WebDriverWait(driver, 60);
//				
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='PAT'])[2]")));
//		driver.findElement(By.xpath("(//a[@value='PAT'])[2]")).click();

		//code for checking checkboxes
//		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
//
//		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
//
//		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
//	
		//code for radio button
//		driver.get("http://www.echoecho.com/htmlforms10.htm");
//
//		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
//
//		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
//
//		for(int i=0;i<count;i++)
//
//		{
//
//		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
//
//		String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
//
//		if(text.equals("Cheese"))
//
//		{
//
//		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
//		System.out.println("success");
//		break;
//		
//		}
//		System.out.println("success2");
//		}
	}

	
}
