/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author CROSBYR
 */
public class MyFormTest {

    private static WebDriver driver;
    private static String baseUrl;

    public MyFormTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("http://itexps.com/simpleform.html");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uname")));
        
        driver.findElement(By.id("uname")).click();
        driver.findElement(By.id("uname")).clear();
        Thread.sleep(5000);
        driver.findElement(By.id("uname")).sendKeys(FileUtil.getData().getUser());
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(FileUtil.getData().getPass());
        driver.findElement(By.id("uemail")).clear();
        driver.findElement(By.id("uemail")).sendKeys(FileUtil.getData().getEmail());
        driver.findElement(By.id("age")).clear();
        driver.findElement(By.id("age")).sendKeys("25");
        driver.findElement(By.xpath("//label[2]/input")).click();
        driver.findElement(By.xpath("//tr[7]/td[2]/label[2]/input")).click();
        driver.findElement(By.id("city")).click();
        Thread.sleep(5000);
        new Select(driver.findElement(By.id("city"))).selectByVisibleText("Schaumburg");
        driver.findElement(By.xpath("//textarea")).click();
        driver.findElement(By.xpath("//textarea")).clear();
        driver.findElement(By.xpath("//textarea")).sendKeys("123 main st tampa fl 33511");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
    }
}
