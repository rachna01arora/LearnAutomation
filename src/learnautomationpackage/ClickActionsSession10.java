package learnautomationpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickActionsSession10 {
	WebDriver driver;
	  
	@Test
	public void mousehover() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@name='myCountry' and @type='text']")).sendKeys("ind");
		  Actions obj = new Actions(driver);
		  WebElement element=driver.findElement(By.xpath("//input[@value='India']"));
		 
		// use Mouse hover action for that element
		  //obj.moveToElement(element).build().perform();
		  //Thread.sleep(5000);
	      //obj.click(element).build().perform();
	      //driver.close();
	      obj.contextClick(driver.findElement(By.xpath("//input[@value='India']"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  
  }
	@Test
	public void RightClick(){
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();	
		  driver.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");
		 
		  Actions obj = new Actions(driver);
		  
		obj.contextClick(driver.findElement(By.xpath("//a[@href='howto_css_login_form_navbar.asp' and text()='Login Form in Navbar']"))).perform();;
	}
	}
	

