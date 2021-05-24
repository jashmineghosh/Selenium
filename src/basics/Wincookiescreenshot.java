package basics;
/*
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Wincookiescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/?trk=");
		driver.manage().window().maximize();
//		System.out.println(driver.manage().getCookieNamed("BizoCustomSegments"));
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\image.png"));
		driver.manage().deleteCookieNamed("bscookie");
		Cookie cookie = new Cookie("cokiesample", "12345");
		driver.manage().addCookie(cookie);
//		WindowsUtils.killByName("excel.exe"); // used to kill any windows util,can be used by name or process ID
		Set<Cookie> cookies = driver.manage().getCookies();
		for( Cookie allcookies : cookies)
		{
			System.out.println(allcookies);
		}
	}
	

}
*/