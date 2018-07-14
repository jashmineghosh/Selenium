package basics;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.Request;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import junit.framework.Assert;

public class Demo1 {

	private static final TimeUnit SECONDS = null;
	private static final FirefoxProfile JavaScriptError = null;
	private static final String JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
//		driver.get("https://www.phptravels.net/");
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.xpath("//span[@class='select2-chosen'][contains(text(),'Search by Hotel or City Name')]")));
//		actions.click();
//		actions.sendKeys("kol");
//		actions.build().perform();
//		//driver.findElement(By.xpath("//span[@class='select2-chosen'][contains(text(),'Search by Hotel or City Name')]")).sendKeys("kol");
//		WebDriverWait wait=new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='select2-drop']")));
//		driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li/ul/li[2]")).click();
		
		
//		Select oSelect = new Select(driver.findElement(By.name("adults")));
//		oSelect.selectByIndex(1);
//				
//		Select oSelect1 = new Select(driver.findElement(By.name("child")));
//		oSelect1.selectByValue("2");
//		//Thread.sleep(2000);
//		//oSelect.deselectByValue("2");
//		System.out.println(oSelect.getOptions().size());
		
//		driver.findElement(By.name("checkin")).click();
//		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='switch']")).getText().contains("May"))
//		{
//		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
//		}
//		int count = driver.findElements(By.cssSelector(".day")).size();
//		//List<WebElement> dates = driver.findElements(By.cssSelector(".day")); //we can either put hte elements in list here or below in code when we use it for traversal, cast it to List<Webelement>
//		for (int i = 0;i<count;i++)
//		{
//			String text = ((List<WebElement>) driver.findElements(By.cssSelector(".day"))).get(i).getText();
//		if(text.equalsIgnoreCase("21"))	
//		{
//			((List<WebElement>) driver.findElements(By.cssSelector(".day"))).get(i).click();
//			break;
//		}
//		}
//		
//		driver.findElement(By.name("submit")).click();
		/******************entering invalid credentials, capturing the err msg then click on forgot pasword*************************/
//		driver.get("http://www.phptravels.net/admin/");
//		driver.findElement(By.name("email")).sendKeys("j@j.com");
//		driver.findElement(By.name("password")).sendKeys("pw");
//		System.out.println(driver.findElement(By.cssSelector("ins[class='iCheck-helper']")).isSelected());
//		WebElement val = driver.findElement(By.cssSelector("ins[class='iCheck-helper']"));
//		
//		if(!val.isSelected())
//		{
//			driver.findElement(By.cssSelector("ins[class='iCheck-helper']")).click();
//		}
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert.alert-danger.loading.wow.fadeIn.animated")));
//		System.out.println(driver.findElement(By.cssSelector("div.alert.alert-danger.loading.wow.fadeIn.animated")).getText());
//		driver.findElement(By.xpath("//a[contains(.,'Click Here')]")).click();
//		WebDriverWait wait2=new WebDriverWait(driver, 20);
//		
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-forgot']/span[1]")));
//		System.out.println(driver.findElement(By.xpath("//button[@id='btn-forgot']/span[1]")).getText());

	/**********************************challenging DOM*******************************/
		
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Challenging DOM")).click();
//		driver.findElement(By.xpath("//div[@class='large-2 columns']/a[1]")).click();
//		WebElement table = driver.findElement(By.xpath("//div[@class='large-10 columns']/table"));
//		int colcount = table.findElements(By.xpath("//div[@class='large-10 columns']/table/tbody/tr/td[1]")).size();
//		System.out.println(colcount);
//		int rowcount = table.findElements(By.xpath("//div[@class='large-10 columns']/table/tbody/tr[1]")).size();
//		System.out.println(table.findElements(By.xpath("//div[@class='large-10 columns']/table/tbody/tr[1]")).size());
//		for (int i=0;i<colcount;i++)
//		{
//			for (int j=0;j<rowcount;j++)
//			{
//				System.out.println(table.findElements(By.xpath("//div[@class='large-10 columns']/table/tbody/tr[1]")).get(j).getText());
//			}
//				
//				System.out.println(table.findElements(By.xpath("//div[@class='large-10 columns']/table/tbody/tr/td[1]")).get(i).getText());
//			
//		}
	/*****************Disappearing elements, not working fine********************************/
		
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Disappearing Elements")).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 //To maximize the browser
		//driver.manage().window().maximize();
                //Create an object 'action' of an Actions class
//		 int count = driver.findElements(By.xpath("//a[@href='/gallery/']")).size();
		
//		   
		
//		
		
//		Actions action = new Actions(driver);
//		By locator = By.xpath("//h3[contains(text(),'Disappearing Elements')]");
//                //Wait for the element. Used Explicit wait
//                WebDriverWait wait = new WebDriverWait(driver, 5);
//                wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
//                WebElement rightClickElement=driver.findElement(locator);
//                //contextClick() method to do right click on the element
//                action.contextClick(rightClickElement).build().perform();
//                WebElement elementOpen = driver.findElement(By.linkText("Reload")); /*This will select menu after right click */
//                elementOpen.click();
               
//               boolean val = driver.findElement(By.xpath("//a[@href='/gallery/']")).isDisplayed();
//             while(val!=false) 
//             {
//            	 action.sendKeys(Keys.F5).click().build().perform(); 
//             }
//             System.out.println(driver.findElement(By.xpath("//a[@href='/gallery/']")).isDisplayed()); 
		
             
             /****************************** prgm for dynamic content*/
//             
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Dynamic Content")).click();
//		System.out.println(driver.findElement(By.xpath("(//div[@id='content']/div/div[2])[2]")).getText());
		
		/**************Dynamic controls*/
		
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Dynamic Controls")).click();	
//		int count = driver.findElements(By.id("checkbox")).size();
//		System.out.println(count);
//		driver.findElement(By.id("btn")).click();
//		 WebDriverWait wait = new WebDriverWait(driver, 30);
//		 WebElement ele = driver.findElement(By.id("checkbox"));
//		 wait.until(ExpectedConditions.invisibilityOf(ele));
//		// either by using try catch or by using size logic to verify the element disappeared
////		 try {
////			 
////		 
////		 System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
////		 }
////		 catch (Exception e)
////		 {
////			 System.out.println("caught");
////		 }
//		 int count1 = driver.findElements(By.id("checkbox")).size();
//		if(count1 == 0)
//		{
//			System.out.println("success");
//		}
		
		/********dynamic loading********/
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Dynamic Loading")).click();
//		driver.findElement(By.xpath("//a[@href='/dynamic_loading/1']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		 WebElement ele = driver.findElement(By.xpath("//div[@id='finish']/h4"));
//		wait.until(ExpectedConditions.textToBePresentInElement(ele, "Hello World!"));
//		System.out.println(ele.getText());
//		
		/**get this to work*/
//		driver.findElement(By.xpath("//a[@href='/dynamic_loading/2']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		 WebElement ele = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
//		wait.until(ExpectedConditions.textToBePresentInElement(ele, "Hello World!"));
//		System.out.println(ele.getText());
		/********floating menu********/
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Floating Menu")).click();
//		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)", "");
//		System.out.println(driver.findElement(By.xpath("//a[@href='#home']")).  getText());
		
		/*********************sliding bar*/
		
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Horizontal Slider")).click();
//		Actions action = new Actions(driver);
//		WebElement source = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
//		action.dragAndDropBy(source , 40, 0).build().perform();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"range\"]")).getText());
		
		/********hover over for tool tip*/
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Hovers")).click();
//		Actions action = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//div[@class='example']/div[1]"));
//		action.moveToElement(element).build().perform();
//		WebElement toolTip = driver.findElement(By.xpath("//div[@class='example']/div[1]/div/h5"));
//		String toolTipText = toolTip.getText();
//	    System.out.println(toolTipText);
//	    driver.findElement(By.xpath("//div[@class='example']/div[1]/div/a")).click();
//	    System.out.println(driver.getCurrentUrl());
		
	    /************infinite scroll, little more research*/
//	    
//	    driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Infinite Scroll")).click();
//		 driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
//         JavascriptExecutor jse = (JavascriptExecutor)driver;
//         jse.executeScript("scroll(900, 0)"); //  scroll up
//         jse.executeScript("scroll(0, 200)"); //  scroll down vertically
//         {
//             
//             JavascriptExecutor jse1 = (JavascriptExecutor)driver;
//             jse1.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
//        }
		 
//		this and the action piece of code will scroll sufficiently to find the element mentioned below, is there any other way???
		 
//		 {
//		      for(int i=0;i<25;i++)
//		      {
//		      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); // It will scroll speed
//		      Thread.sleep(1000);
//		      driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN); // wait for 1 second and Scrool
//		     
//		      }
//		      }  
//		 Actions act = new Actions(driver);
//	        for(int i=0;i<=25;i++)
//	       {
//	        Thread.sleep(1000);
//	        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
//	       act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();   // Shourtcut key for Infinite scroll (Ctrl+End)
//	       }
//	        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
//	        {
//	            WebElement element = (WebElement) driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[3]"));
//	            Coordinates coordinate = ((Locatable)element).getCoordinates(); 
//	            System.out.println(coordinate.onPage()); 
//	            coordinate.inViewPort();
//	             } 
		
	    /****JQuery UI Menus******/   
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("JQuery UI Menus")).click();
////		System.out.println(driver.findElement(By.xpath("//ul[@id='menu']/li[1]/a")).isDisplayed()); //element visibility is checked using jscript, as html cannot be trusted here.
//		Boolean value =  (Boolean)((JavascriptExecutor) driver).executeScript("return document.getElementById('ui-id-1').getAttribute('disabled') == false;","");
//		System.out.println(value.toString());
//		System.out.println(driver.findElement(By.xpath("//ul[@id='menu']/li[2]/a")).isEnabled());
//		Actions action = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//ul[@id='menu']/li[2]/a"));
//		action.moveToElement(element).build().perform();
//		Thread.sleep(2000);
//		WebElement element11 = driver.findElement(By.xpath("//*[@id='menu']/li[2]/ul/li[2]/a"));
//		action.moveToElement(element11).click().build().perform();
		
	/***********js alert*/
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("JavaScript Alerts")).click();
//		System.out.println(driver.findElement(By.id("result")).getText());
//		if(driver.findElement(By.id("result")).getText().isEmpty())
//		{
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		System.out.println(driver.findElement(By.id("result")).getText());
//		}
//		else
//		{
//			System.out.println("error");
//						
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
//		System.out.println(driver.findElement(By.id("result")).getText());
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
////		Alert alert1=driver.switchTo().alert();  //do not actually need another alert object
//		driver.switchTo().alert().sendKeys("Helllo");
//		alert.accept();
//		System.out.println(driver.findElement(By.id("result")).getText());
		
		/*********jscript onload error, need more insight*****/
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("JavaScript onload event error")).click();
//		System.out.println(((JavascriptExecutor) driver).executeScript("return window.javascript_errors ")); // this script needs to be inserted on every webpage to capture error, not very good solution
		
		/***********key presses******/
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Key Presses")).click();
//		driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
//		driver.findElement(By.xpath("html/body")).sendKeys(Keys.ALT);
//		String atext = driver.findElement(By.id("result")).getText();
//		String etext = "You entered: ALT";
//		if (atext.equalsIgnoreCase(etext))
//		{
//			System.out.println("success");
//		}
	/****large and deep doms***/
		
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Large & Deep DOM")).click();
//		System.out.println(driver.findElement(By.xpath("//tr[@class='row-1']/td[1]")).getText());
		
	/************nested frame******/	
		
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Nested Frames")).click();
//		 int size = driver.findElements(By.tagName("frame")).size();
//		    System.out.println("Total Frames --" + size); //total num of outer frames
//		 // prints the total number of frames 
//			driver.switchTo().frame(0); // Switching the 1st Outer Frame  
//			size = driver.findElements(By.tagName("frame")).size();
//			System.out.println(size);
//			driver.switchTo().frame(0); // Switching the first frame inside 1st Outer Frame  
//		    System.out.println (driver.findElement(By.xpath("//html/body")).getText());
//		    driver.switchTo().defaultContent();
//		    driver.switchTo().frame(1); // Switching the 2nd outer Frame  
//			size = driver.findElements(By.tagName("frame")).size();
//			System.out.println(size);
//			System.out.println (driver.findElement(By.xpath("//html/body")).getText());
			
			/************notification messages****/
//			driver.get("http://the-internet.herokuapp.com/");
//			driver.findElement(By.linkText("Notification Messages")).click();
//			String actual_msg= driver.findElement(By.xpath("//*[@id='flash']")).getText();
//			String expect = "Action unsuccesful, please try again";
//			
//			if(expect.equals(actual_msg));
//			System.out.println("msg1 recd1..." + actual_msg);
//			driver.findElement(By.linkText("Click here")).click();
//			String actual_msg1= driver.findElement(By.xpath("//*[@id='flash']")).getText();
//			String expect1 = "Action successful";
//			if(expect.equals(actual_msg));
//			System.out.println("msg1 recd2..." + actual_msg1 );
			
			/***research on redirects/status codes**********/
			
	
	/***********basic auth working in autoIt package using robot class/Secure File Download, try in same way*************/
//	
//			
		
			
			/********WYSIWYG********/
//			driver.get("http://the-internet.herokuapp.com/");
//			driver.findElement(By.linkText("WYSIWYG Editor")).click();
//			driver.switchTo().frame("mce_0_ifr");
//			WebElement element = driver.findElement(By.id("tinymce"));
//			System.out.println("Entering something in text input");
//			element.sendKeys(Keys.CONTROL + "a");
//			element.sendKeys("Test text");
			/*****shifting content, try with respect ot another stable obj, below also works thou******/
//			driver.get("http://the-internet.herokuapp.com/");
//			driver.findElement(By.linkText("Shifting Content")).click();
//			driver.findElement(By.xpath("//a[@href='/shifting_content/menu']")).click();
//			driver.findElement(By.xpath("//a[@href='/shifting_content/menu?mode=random&pixel_shift=100']")).click();
//			System.out.println(driver.findElement(By.xpath("//a[@href='/portfolio/']")).getText());
			
	}
		
	
	}
