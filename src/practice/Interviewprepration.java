package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Interviewprepration {
  WebDriver driver;
	@Test
  public void interviewallpractice() {
		//1.open chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		//2. Remove or disable developer addon
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver= new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		
  }
}
