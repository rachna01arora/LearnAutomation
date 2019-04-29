package learnautomationpackage;
import library.Utilityscreenshot;
import library.loginpom;
import library.OpenBrower;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WordpressloginPOM {
	WebDriver driver;
	OpenBrower obj1 = new OpenBrower(driver);
	
  
	@Test(priority=0)
  public void Verifybrowseropen() {
	  
	  obj1.startbrowser("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe","http://demosite.center/wordpress/wp-login.php");
	  Utilityscreenshot.capturescreenshot(driver, "URLEntered");
  }
  @Test(priority=1)
	 public void Verifyvalidlogin() {
	  driver= obj1.driver1;
	  loginpom obj2 = new loginpom(driver);
	  //obj2.logintestcase("admin","demo123");
	  //obj2.posttestcase("HelloAll");
	  Utilityscreenshot.capturescreenshot(driver, "Wordpressloggedinsuccess");	
	  
  }
  
	  
}

