package AutoIt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class HandleWindow_basic_auth {

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Basic Auth")).click();
//		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\AutoItScript\\sample.exe");
//	}

	
	 public static void main(String[] args) throws AWTException, InterruptedException {	
		 System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.get("http://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("Basic Auth")).click();	
				
         Robot robot = new Robot();  // Robot class throws AWT Exception	
//         Thread.sleep(2000); // Thread.sleep throws InterruptedException	
         robot.delay(2000);
         robot.keyPress(KeyEvent.VK_A);
         robot.keyRelease(KeyEvent.VK_A);
         robot.keyPress(KeyEvent.VK_D);  
         robot.keyRelease(KeyEvent.VK_D);
         robot.keyPress(KeyEvent.VK_M);  
         robot.keyRelease(KeyEvent.VK_M);
         robot.keyPress(KeyEvent.VK_I);  
         robot.keyRelease(KeyEvent.VK_I);
         robot.keyPress(KeyEvent.VK_N);  
         robot.keyRelease(KeyEvent.VK_N);
         Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
         robot.keyPress(KeyEvent.VK_TAB);	
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_A);
         robot.keyRelease(KeyEvent.VK_A);
         robot.keyPress(KeyEvent.VK_D);  
         robot.keyRelease(KeyEvent.VK_D);
         robot.keyPress(KeyEvent.VK_M);  
         robot.keyRelease(KeyEvent.VK_M);
         robot.keyPress(KeyEvent.VK_I);  
         robot.keyRelease(KeyEvent.VK_I);
         robot.keyPress(KeyEvent.VK_N);  
         robot.keyRelease(KeyEvent.VK_N);
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_ENTER);
//         driver.switchTo().defaultContent();
         driver.switchTo().parentFrame();
              
          // press enter key of keyboard to perform above selected action
         
//        WebElement loc = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
//         WebDriverWait wait = new WebDriverWait(driver, 20);
// 	    wait.until(ExpectedConditions.presenceOfElementLocated((By) loc));
// 	   System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText());
         boolean val = isAlertPresent(driver);
         System.out.println(val);
   }
	 public static boolean isAlertPresent( WebDriver driver) {
//		 WebDriver driver = new FirefoxDriver(); 
   	  boolean presentFlag = false;
   	 
   	  try {
   	 
   	   // Check the presence of alert
   	   Alert alert = driver.switchTo().alert();
   	   // Alert present; set the flag
   	   presentFlag = true;
   	   // if present consume the alert
   	   alert.accept();
   	 
   	  } catch (NoAlertPresentException ex) {
   	   // Alert not present
   	   ex.printStackTrace();
   	  }
   	 
   	  return presentFlag;
   	 
   	 }
}
