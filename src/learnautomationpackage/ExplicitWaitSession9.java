package learnautomationpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitSession9 {
	WebDriver driver;
  @Test
  public void ExplicitWait() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demosite.center/wordpress/wp-login.php");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  try{
	  WebDriverWait wait =new WebDriverWait(driver,20);
	  WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
	  boolean value=element.isDisplayed();
	  Assert.assertEquals(value, true,"Element is not visible");
	  }
	  catch(NoSuchElementException e){
		  System.out.println(e.getMessage());
  }
  }
  }
  
  

