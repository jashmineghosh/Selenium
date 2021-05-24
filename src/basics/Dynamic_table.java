package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Dynamic_table {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws ParseException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(rows +" " + cols);*/
		
		/* to get a dynamic element and click on it
		String expected = "Jubilant Industries";
//		String actual = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr]")).getText();
		for(int i = 1;i<=rows; i++)
		{
			
			if(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+i+"]")).getText().equals(expected)) {
				driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+i+"]")).click();
				break;
			}
		}
	*/
		/* relative to a particular element, get the corresponding col data
		String expected = "Ortin Laborator.";
		for(int i = 1;i<=rows; i++)
		{
			
			if(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[1]")).getText().equals(expected)) {
//				System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[3]")).getText());
				System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[1]/following-sibling::td[2]")).getText());
				break;
			}
		}*/
/*		 getting max of a col and print sorted col
		double m,r =0;
	ArrayList array = new ArrayList();
	for(int i = 0;i<rows; i++)
	{
		NumberFormat f =NumberFormat.getNumberInstance(); 
		
	String max = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[4]")).getText();
	
	Number num = f.parse(max);
    max = num.toString();
    m = Double.parseDouble(max);
	array.add(m);
    Collections.sort(array);
    
	if(m>r)
	{
		r=m;
	}
	}
	System.out.println("max price is "+ r);
	System.out.println(array);
	*/
		/* print all data from dynamic table
		for(int i = 1;i<=rows; i++)
		{
			for(int j = 1;j<=cols; j++) {
			
			System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println(" ");
		}
	*/	
/*		 in here a continue button appears which is a clickable image after we enter junk in email, it can be handled using js, verifying ischecked and zoom
	driver.get("http://my.monsterindia.com/create_account.html");
	driver.findElement(By.name("email")).sendKeys("dfgfghdfhdf@gmail.com");
	driver.findElement(By.id("passwd_id")).click();
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//img[@ src='//media.monsterindia.com/monster_2012/btn_continued.jpg']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", element);
	boolean isChecked = driver.findElement(By.id("other_cat_907_check")).isSelected();
	System.out.println(isChecked);
//	js.executeScript("document.body.style.zoom='40%'"); // generally used when taking screenshot
	System.out.println(js.executeScript("return document.title").toString());
	System.out.println(js.executeScript("return document.domain").toString());
	System.out.println(js.executeScript("return document.URL").toString());
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
//	WebElement element1 = driver.findElement(By.xpath("//a[@title='All Jobs']"));
//	js.executeScript("arguments[0].scrollIntoView(true);", element1);
//	js.executeScript("scroll(0, 200)"); //  scroll down vertically
 //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	*/
/*		 check open or collapse state , same way we can check for radio button also
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		String open_col1 = driver.findElement(By.xpath("(//div[@class='accordian_item']/div/h3[1])[4]")).getCssValue("background-image");
		 System.out.println("before clicking on collapse link " +open_col1);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 200)"); 
//       Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='accordian_item']/div/h3/span[1])[1]")).click();
		 String open_col = driver.findElement(By.xpath("(//div[@class='accordian_item']/div/h3/span[1])[1]")).getCssValue("background-image");
		 System.out.println("after clicking collapse link "+open_col);
		 if(open_col.contains("blueuparrow.png"))
			{
				 System.out.println("open");
				 
			}
			else
			{
				System.out.println("collapse");
			}
		 
//		 String open_col = driver.findElement(By.xpath("//div[@class='accordian_item']/div/h3")).getAttribute(("class");
//		if(open_col.contains("clearfix open active"))
//		{
//			 System.out.println("open");
//			 
//		}
//		else
//		{
//			System.out.println("collapse");
//		}
		*/
		
		 
		 
		 
		/* keyboard operations
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		WebElement elem = driver.findElement(By.xpath("//div[@class='navigation']/ul/li[2]/following-sibling::li[3]/div/a"));
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).click(elem).keyUp(Keys.SHIFT).build().perform();
//		a.keyDown(fname,Keys.SHIFT).click(elem).keyUp(dnme,Keys.SHIFT).build().perform(); another way to use key events
		Set<String> it = driver.getWindowHandles();
		Iterator<String> its = it.iterator();
		String child=null;
				String parent = null;
		
			its.next();
			 parent = its.next();
			child  = its.next();
			driver.switchTo().window(child);
			Thread.sleep(3000);
			driver.findElement(By.id("btn-disclaimer-proceed1")).click();
			driver.switchTo().defaultContent();
			*/
			/*iframe validation
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
			Actions a = new Actions(driver);
			WebElement source = driver.findElement(By.cssSelector("#draggable"));
			WebElement target = driver.findElement(By.cssSelector("#droppable"));
			a.dragAndDrop(source, target).build().perform();
			if(target.getText().equalsIgnoreCase("Dropped!"))
			{
				System.out.print("success");
			}
			else
				System.out.print("fail");
				*/
		/*verify text appearing in website
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		 List<WebElement> texts = driver.findElements(By.xpath("//div[@class='accordian_item']/div/h3/span[1]"));
		 ArrayList actual = new ArrayList();
		Iterator<WebElement> it = texts.iterator();
		
		 while(it.hasNext())
		 {
			 actual.add(it.next().getText());
		 }
		 System.out.println(actual);
		 ArrayList expected = new ArrayList(); 
		 expected.add("What�s NetBanking all about?");
		 expected.add("How to register for NetBanking?");
		 expected.add("Forgot your IPIN (password)?");
		 expected.add("Third Party Transfer");
		 expected.add("What is Secure Access?");
		 expected.add("Insurance on NetBanking");
		 expected.add("Virtual Keyboard");
//		 expected.add("Have questions?");
		 System.out.println(expected);
		 if(actual.equals(expected)) {
			 System.out.println("pass");
			  }
		 else
			 System.out.println("fail");
			 */
	/*filter the items and get the list after validating the on selection criteria
	driver.get("https://www.olx.in");
	driver.findElement(By.xpath("//a[contains(@href,'vehicles') and @id='cat-5']/span")).click();
	driver.findElement(By.cssSelector("a[data-id='84']>:first-child")).click();
	String open_col = driver.findElement(By.xpath("//*[@id='param_model']")).getAttribute(("class"));
	if(open_col.contains("disabled"))
	{
		 System.out.println("it is disabled, nothing selected");
		 
	}
	else
	{
		System.out.println("model is selected");
	}
	
	  driver.findElement(By.xpath("//*[@id='param_subcat']/div[2]/a/span[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='param_subcat']/div[2]/ul/li[3]/a")).click();
	  Thread.sleep(3000);
//      Actions act = new Actions(driver);
//      act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).click().build().perform(); //press down key two times to select 3
  	
	List<WebElement> list = driver.findElements(By.xpath("//table[@id='promotedAd']/tbody/tr/td/table/tbody/tr/td[2]/h3/a/span"));
	Iterator<WebElement> listItr = list.iterator();
	while(listItr.hasNext())
	{
		String text = listItr.next().getText();
		System.out.println(text);
		if(text.toLowerCase().contains("hyundai"))
		{
			System.out.println("success");
		}
		else
			System.out.println("fail");
	}
	List<WebElement> list1 = driver.findElements(By.xpath("//table[@id='offers_table']/tbody/tr/td/table/tbody/tr/td[2]/h3/a/span"));
	Iterator<WebElement> listItr1 = list1.iterator();
	while(listItr1.hasNext())
	{
		String text1 = listItr1.next().getText();
		System.out.println(text1);
		if(text1.toLowerCase().contains("hyundai"))
		{
			System.out.println("success");
		}
		else
			System.out.println("fail");
	}*/
	/* work on mailbox, add/delete stuff
		driver.get("https://www.sharklasers.com/inbox");
		driver.findElement(By.id("inbox-id")).click();
//		driver.findElement(By.xpath("//span[@id='inbox-id']/input")).sendKeys("test");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value=\"test\"", driver.findElement(By.xpath("//span[@id='inbox-id']/input")));
		driver.findElement(By.xpath("(//*[contains(text(),'Set')])[2]")).click();
		Thread.sleep(6000);
//		driver.findElement(By.xpath("//*[contains(text(),'ezqigrhak@dgmexcq.biz ')]/preceding-sibling::td/input")).click();
//		driver.findElement(By.id("del_button")).click();
//		Thread.sleep(6000);
		int all = driver.findElements(By.xpath("//tbody[@id='email_list']/tr/td/input")).size();
		for(int i=1;i<=all; i++)
		{
			driver.findElement(By.xpath("//tbody[@id='email_list']/tr["+i+"]/td/input")).click();
		}
		driver.findElement(By.id("del_button")).click();
		*/
		/* print the prices displayed and print the largest value
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li/div/div[2]/div[1]/span[1]"));
		 ArrayList array = new ArrayList();
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext())
		{
			String actData = it.next().getText();
			if(actData.contains("$"))
			{
			String num = actData.substring(1);
			double numD = Double.parseDouble(num);
			int price = (int) numD;
			array.add(price);
			
			}
		}
		System.out.println(array);
		Object max = Collections.max(array);
		
		System.out.println(max);
	
		
		driver.quit();*/
		
		
		
	}

}
