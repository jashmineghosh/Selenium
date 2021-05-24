package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		int sum = 0;
//		System.setProperty("webdriver.chrome.driver", "C:\\jas-hadoop\\selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19284/tit-vs-war-1st-semi-final-momentum-one-day-cup-2017-18");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size());
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size());
		for (int i=0;i<count-2;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger=  Integer.parseInt(value);
			sum=sum+valueinteger;
		}
	
	System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	String Extras= table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int extrasValue=Integer.parseInt(Extras);
	int TotalSumValue=sum+extrasValue;
	System.out.println(TotalSumValue);
	String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	int ActualTotalVAlue=Integer.parseInt(ActualTotal);
	if(ActualTotalVAlue==TotalSumValue)
	{
	System.out.println("Count Matches");
	}
	else
	{
	System.out.println("count fails");
	}
	}

	
}
