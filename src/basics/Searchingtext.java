package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Searchingtext {

	static String text1 = "won't";
	static String url = "http://the-internet.herokuapp.com/";
//	static WebDriver driver = new ChromeDriver();
	static WebElement Whole ;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
		try{
			driver.get(url);
			driver.findElement(By.linkText("Typos")).click();
			Thread.sleep(3000);
		Whole=	driver.findElement(By.xpath("//div[@id='content']/div/p[2]"));
		System.out.println("Whole Text :::::::::::::::::++>" +Whole.getText());
		if(Whole.getText().contains(text1)){
			System.out.println("It is working...");
		}
		else {
			System.out.println("unsuccess");
		}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
