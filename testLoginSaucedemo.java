import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class testLoginSaucedemo {
    @Test public void login() { // TODO Auto-generated method stub 
  System.setProperty("webdriver.chrome.driver", "path of driver"); 
  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
  driver.get("https://www.saucedemo.com/"); 

  WebElement username=driver.findElement(By.id("username")); 
  WebElement password=driver.findElement(By.id("password")); 
  WebElement login=driver.findElement(By.id("login-button")); 
  username.sendKeys("standard_user"); password.sendKeys("secret_sauce"); 
  login.click(); String actualUrl="https://www.saucedemo.com/inventory.html"; 
  String expectedUrl= driver.getCurrentUrl(); 
  Assert.assertEquals(expectedUrl,actualUrl); } 
}