package learnautomationpackage;

import java.io.IOException;

import library.OpenBrower;
import library.Readdata;
import library.Utilityscreenshot;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DatadrivenFramework {
	WebDriver driver;
	OpenBrower object = new OpenBrower(driver);
	
	@Test(priority=0)
  public void verifyopenbrowser() {
		object.startbrowser("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe","http://demosite.center/wordpress/wp-login.php");  
		Utilityscreenshot.capturescreenshot(driver, "Broseropen");
	}
	@Test(priority=1)
	
	public void datadriven() throws Exception{
		driver=object.driver1;
		Readdata object2=new Readdata(driver);
		object2.enterdata();
		
	}
}
