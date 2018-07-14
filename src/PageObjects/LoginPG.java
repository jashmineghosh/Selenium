package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPG {
public WebDriver driver;
By userid = By.name("uid");
By pwd = By.name("password");
By btn = By.xpath("//input[@value = 'LOGIN']");

public LoginPG(WebDriver driver)
{
	this.driver = driver;
}

public WebElement getUserid()
{
	return driver.findElement(userid);
}

public WebElement getPWD()
{
	return driver.findElement(pwd);
}
public WebElement loginclick()
{
	return driver.findElement(btn);
}


}
