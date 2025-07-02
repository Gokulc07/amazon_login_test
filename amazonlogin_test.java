package seleniumtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class AppTest {

    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        

    }
   @Test
    public void loginTest() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.com");
      driver.findElement(By.xpath("//a[text()='Your Account']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Sign in']")).click();
      WebElement inp=driver.findElement(By.xpath("//input[@type='email']"));
      inp.sendKeys("lukogc2004@gmail.com");
      //driver.findElement(By.xpath("//input[@type='a-button-input]")).click();
      inp.sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      WebElement pas=driver.findElement(By.xpath("//input[@type='password']"));
      pas.sendKeys("gokulc07");
      //driver.findElement(By.xpath("//input[@type='submit]")).click();
      pas.sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      System.out.println("Amazon login successful")















    //   driver.findElement(By.xpath("//label[text()='Music']")).click(); 
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}


     
