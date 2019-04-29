package learnautomationpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import library.Utilityscreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturescreenshotSession8 {
	WebDriver driver;
	
	@Test(priority =0)
	  public void startup() throws Exception{
		
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demosite.center/wordpress/wp-login.php");
	  Utilityscreenshot.capturescreenshot(driver, "URLopened");
	  driver.findElement(By.xpath("//input[@name='log']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='pwd' and @id='user_pass']")).sendKeys("demo123");
	  driver.findElement(By.xpath("//input[@type='submit' and @id='wp-submit' and @name='wp-submit']")).submit();
	  Utilityscreenshot.capturescreenshot(driver, "loggedin");	
	}	
	
	@Test
  public void Screenhot() throws Exception {		
		
  }
}
