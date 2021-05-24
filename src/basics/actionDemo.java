package basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.awt.*;
import java.util.List;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//public class actionDemo {
//
//    public static void main (String[] args) throws InterruptedException, AWTException {
//        // TODO Auto-generated method stub
//        System.setProperty("webdriver.chrome.driver", "I:\\Data\\Selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        //amazon example
//		driver.get("https://www.amazon.com/");
//        driver.manage().window().maximize();
//		driver.get("https://www.amazon.com/s?k=amazonbasics&ref=nb_sb_noss_1"); //synchronization
		//selenium methods

//		System.out.println(driver.getTitle());
//		driver.get("https://www.google.com/?gws_rd=ssl");
//		driver.navigate().back();
//        System.out.println(driver.getTitle());

//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath(".//div[@id='nav-tools']/a[2]/span[2]"))).contextClick().build().perform(); // context click is right click
//ID,xpath,css,classname,linktext,name

//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").click().build().perform();

//        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("amazonbasics").click().build().perform();
//        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();  //clicks on search box

//		driver.findElement(By.className("nav-input nav-progressive-attribute")).click(); //wont work because of space, this was search box

//        driver.findElement(By.xpath("//input[contains(@class,'nav-input')]")).click();
//        driver.findElement(By.className("a-button-input")).click(); //works as no space for classname , clicks on dont change prompt

//        driver.findElement(By.partialLinkText("Shop")).click();  //after typing amazonbasics, clicks on shop now
//        System.out.println(driver.findElement(By.xpath("//*[contains(@class,\"a-size-base\")]")).getText()); //cssSelector doesnt have alternative for contains, xpath is good choice

//        driver.findElement(By.xpath("(//a[@class='a-link-normal'])[1]")).click();//multiple elements located , clicks on ships world wide, after typing amazonbasics

        //*[@id="K7EYprgr67R7RX9O-Uti5A"]/div[2]/a/div .... bad example of id, contains alphanumeric
//        driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click(); //clicking on aria-hidden element, sometimes it wont work, then use JS, or identify a level up, cart icon click after amazon basics

//        driver.findElement(By.xpath("//div[contains(@class,'fluid-image-container')]")).click();  //multiple elements, clicks on first occurrence, amazon basics
//
        //li[contains(@id,'TCL')]
        //li[contains(@id,'TCL')]/parent::ul
        //li[contains(@id,'TCL')]/following-sibling::li[3]
        //*[text()='TCL']
        //div[@id='brandsRefinements']/ul/li // traverse
//        List<WebElement> webElements = driver.findElements(By.xpath("(//ul[contains(@class,'a-vertical a-spacing-medium')])[6]/li"));
//        for(WebElement option : webElements){
//            System.out.println(option.getText());
//        }


        //herokuapp example, static dropdown
//        driver.get("http://the-internet.herokuapp.com/");
//        System.out.println(driver.findElement(By.xpath("//*[text()='Dropdown']")).getAttribute("href"));
//        System.out.println(driver.findElement(By.xpath("//*[text()='Dropdown']")).getTagName());
//        driver.findElement(By.xpath("//*[text()='Dropdown']")).click();
//
//        Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
//        select.selectByIndex(1);
//        select.selectByValue("1");
//        select.selectByVisibleText("Option 1");



        //herokuapp example, checkbox
//        driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();
//        System.out.println(driver.findElement(By.xpath("//form[@id='checkboxes']/input")).isSelected());
//        System.out.println(driver.findElement(By.xpath("//form[@id='checkboxes']/input")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/input")).isDisplayed());

        //herokuapp example, alerts
//        driver.findElement(By.xpath("//*[text()='JavaScript Alerts']")).click();
//        driver.findElement(By.xpath("//div[@class='example']/ul/li/button")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//
//        driver.findElement(By.xpath("(//div[@class='example']/ul/li/button)[2]")).click();
//        driver.switchTo().alert().dismiss();
//
//        driver.findElement(By.xpath("(//div[@class='example']/ul/li/button)[3]")).click();
//        driver.switchTo().alert().sendKeys("selenium");
//        driver.switchTo().alert().accept();


        //synchronization
//        driver.findElement(By.xpath("//div[contains(@class,'a-spacing-medium')]/span//div")).click(); // clicks first element on amazon basics site
//
//        waitForPageLoaded(driver);
//
//        Robot robot = new Robot();
//        for(int i=0;i<=24;i++){
//
//            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//            Thread.sleep(3000);
//
//            i +=1;
//        }
//        driver.findElement(By.xpath("//div[@class='cr-lighthouse-terms']//a")).click();



//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cr-lighthouse-terms']//a")));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement Element = driver.findElement(By.xpath("//div[@class='cr-lighthouse-terms']//a"));
//        js.executeScript("arguments[0].scrollIntoView(true);", Element); // scroll to view
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //verticle scroll

        //example of Fluent Wait
//        Instant start = Instant.parse("2021-10-03T10:15:30.00Z");
//        Instant end = Instant.parse("2021-10-03T10:16:30.00Z");
//
//        Duration duration = Duration.between(start, end);
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(duration)
//                .pollingEvery(duration)
//                .ignoring(NoSuchElementException.class);


//        Thread.sleep(3000);
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-hook='review-title']/span")));
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        System.out.println("+++++"+driver.findElement(By.xpath("//a[@data-hook='review-title']/span")).getText());
//        driver.findElement(By.xpath("//a[@data-hook='review-title']/span")).click();


            //parent and child window

//        driver.manage().window().maximize();
//        driver.get("https://www.salesforce.com/company/careers/workforce-development/");
//        driver.findElement(By.xpath("//div[contains(@class,'btn-container')]/a")).click();
//        Set<String> window = driver.getWindowHandles();
//        System.out.println(window);
//        Iterator<String> it = window.iterator();
//        System.out.println(it.hasNext());
//
//        String parentId = it.next();
//        String childId = it.next();
//        System.out.println(parentId+"        "+childId);
//        driver.switchTo().window(childId);
//        driver.close();
//        /////coding on child win
//        driver.switchTo().defaultContent();
//        ///coding on parent win
////        Thread.sleep(5000);
////        driver.close();
//    }

//    private static void waitForPageLoaded(WebDriver driver) {
////        WebDriver driver = new ChromeDriver();
//        ExpectedCondition<Boolean> expectation = new
//                ExpectedCondition<Boolean>() {
//                    public Boolean apply(WebDriver driver) {
//                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
//                    }
//                };
//        try {
//            Thread.sleep(1000);
//            WebDriverWait wait = new WebDriverWait(driver, 30);
//            wait.until(expectation);
//        } catch (Throwable error) {
//            Assert.fail("Timeout waiting for Page Load Request to complete.");
//        }
//    }
//
//}

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



public class actionDemo {

//srikanth

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "I:\\Data\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        //Example1: Basic_Auth
//        String u = "admin";
//        //Adding username, password with URL
//        String str = "https://" + u + ":" + u + "@"+ "the-internet.herokuapp.com/basic_auth";
//        driver.get(str);
//        // identify and get text after authentication of popup
//        String t = driver.findElement(By.cssSelector("p")).getText();
//        System.out.println("Text is: " + t);
//        Thread.sleep(2000);
//        //Example2:Checkbox
//        driver.get("http://the-internet.herokuapp.com/checkboxes");
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();
//        System.out.print("Congratulation! Checkbox checked and unchecked");
//        //Example3:Add/Remove Elements
//        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
//        //Adding Elements
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        System.out.print("Congratulation! Elements Added");
//        //Removing Elements
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button[3]")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button[2]")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button[1]")).click();
//        System.out.print("Congratulation! Elements Deleted");


        driver.get("http://the-internet.herokuapp.com/drag_and_drop");

        //Element which needs to drag.
        WebElement From=driver.findElement(By.id("column-a"));

        //Element on which need to drop.
        WebElement To=driver.findElement(By.id("column-b"));

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();


}



}