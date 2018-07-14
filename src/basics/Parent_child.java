package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.actitime.com/download");
		//div[@class ='header__container']/child::nav
		//div[@class ='header__container']/child::nav/child::ul
		//div[@class ='header__container']/child::nav/child::ul/child::li[3]
		//a[contains(text(),'Features')]
		//a[contains(text(),'Features')]/parent::*/following-sibling::li[1]/a
		//a[contains(text(),'Clients')]
		//a[contains(text(),'Clients')]/parent::*/preceding-sibling::li[2]/a
		
//		driver.get("https://book.spicejet.com/Register.aspx");
//		select[name$='RegisterView$DropDownListTitle']
//		(//select[starts-with(@name,'CONTROLGROUPREGISTERVIEW')])[1]  - using xpath, ends-with not working
		
		driver.get("https://www.seleniumhq.org/download/");
		//*[@id="nav"]/li/ul/li[2]/a        or    //*[@id="nav"]/li/ul/child::li[2]/a
//		*[id="nav"]>li>ul>:nth-child(2)>a   above xpath is written in css format
		//*[@id='mainContent']/h3[2]   this is absolute path, below is relative path for same object
		//*[@id='mainContent']//h3[contains(text(),'The Internet Explorer Driver Server')]   here we are using 2 relative path, observe //
	}

}
