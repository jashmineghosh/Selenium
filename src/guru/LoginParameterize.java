package guru;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPG;
import resources.Base;

public class LoginParameterize extends Base{
public static FileInputStream fis;
public static XSSFWorkbook wb;
public static XSSFSheet ws;
public static XSSFRow rw;
public static XSSFCell cl;

//	@BeforeTest
//	
//	public void begin() throws IOException
//	{
//		
//driver = initializeDriver();
//		driver.get("http://www.demo.guru99.com/V4/");
////		driver.get(url1 + "/V4/"); // no hard coding of url
//
//	}
	
	@Test
	public void loginnavpara() throws IOException {
//		LoginPG log1 = new LoginPG(driver);
		for(int i=1;i<=3;i++)
		{
			driver = initializeDriver();
			driver.get("http://www.demo.guru99.com/V4/");
			LoginPG log1 = new LoginPG(driver);
			
			
				log1.getUserid().sendKeys(getCelldata(i,0));
				log1.getPWD().sendKeys(getCelldata(i,1));
				log1.loginclick().click();
			try {
				driver.switchTo().alert().accept();
			}
			catch(Exception e)
			{
				System.out.println("handled");
			}
		}
		
		
	}
//		@Test
		public static String getCelldata(int row, int col) throws IOException
		{
			fis = new FileInputStream("C:\\jas-hadoop\\selenium\\data_driven_2.xlsx");
			wb = new XSSFWorkbook(fis);
			 ws = wb.getSheet("Sheet1");
			 rw = ws.getRow(row);
			 cl = rw.getCell(col);
			return cl.getStringCellValue();
		}

		 
		@AfterTest
		public void teardown()
		{
			driver.quit();
			driver=null;
		}  
		  
		
	
}

