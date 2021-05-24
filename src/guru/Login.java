package guru;
/*
import PageObjects.LoginPG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class Login extends Base{
	
	
	@BeforeTest
	
		public void begin() throws IOException
		{
			
	driver = initializeDriver();
			driver.get("http://www.demo.guru99.com/V4/");
//			driver.get(url1 + "/V4/"); // no hard coding of url

		}
		
@Test
public void loginnav() throws IOException
{
	LoginPG log1 = new LoginPG(driver);
	log1.getUserid().sendKeys("mngr131095");
	log1.getPWD().sendKeys("yqysyte");
	log1.loginclick().click();
}


@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
		@Test
		public void validatetitle()
		{
		System.out.println(driver.getTitle());
		String title = "Guru99 Bank Manager HomePage";
		if (driver.getTitle().equals(title))
		{
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
	}

}
*/