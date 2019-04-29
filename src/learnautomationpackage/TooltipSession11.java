package learnautomationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TooltipSession11 {
	WebDriver driver;
	
  @Test
  public void verifytooltiptext() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	  driver.findElement(By.xpath("//input[@name='firstName']")).click();
	  Actions obj=new Actions(driver);
	  obj.moveToElement(driver.findElement(By.xpath("//*[text()='You can use letters, numbers & periods']"))).build().perform();
	  
	  
  }
}
