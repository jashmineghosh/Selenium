package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFFacebok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//	driver.get("https://www.facebook.com/");
//	//driver.findElement(By.id("email")).sendKeys("jas");
//	driver.findElement(By.cssSelector(".inputtext")).sendKeys("jas"); //alternative way of writing css is tagname.class name/.class name/tagname#id/#id
//	driver.findElement(By.id("pass")).sendKeys("123");
//	driver.findElement(By.linkText("Forgotten account?")).click();
//	//driver.findElement(By.xpath("//*[@id='u_0_2']")).click();// dont use alphanumeric values as it may chnage
//	driver.findElement(By.id("loginbutton")).click();
//		//driver.findElement(By.xpath("//a[@class='mlm _58ms']")).click();// space in class name gives error
//	

//salesforce site
//	driver.get("https://login.salesforce.com/?locale=in");
//	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc");
//	driver.findElement(By.cssSelector("#username")).sendKeys("abc");
//	driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("123");
//	driver.findElement(By.id("Login")).click();
//	System.out.println(driver.findElement(By.cssSelector("div[id='error']")).isDisplayed());
//	driver.findElement(By.cssSelector("div[id='error']")).getText();
//	driver.quit();
//	
	//rediff site
//	driver.get("http://www.rediff.com/");
//	driver.findElement(By.linkText("Sign in")).click();
//	driver.findElement(By.cssSelector("#login1")).sendKeys("abc");
//	driver.findElement(By.name("passwd")).sendKeys("abc");
//	//driver.findElement(By.cssSelector("input[name*='proc']")).click(); // regex using css
//	driver.findElement(By.xpath("//input[contains(@name,'proc')]")).click(); //regex using xpath
//	
		driver.get("https://www.google.co.in/");
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath("//div[@id='sb_ifc0']/div/input")).sendKeys("hello"); //have used parent ot child traversal
		driver.findElement(By.xpath("//button[@id='_fZl']/span")).click();
		
	}

}
