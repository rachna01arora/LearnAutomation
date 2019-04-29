package learnautomationpackage;

import library.OpenBrower;
import library.Utilityscreenshot;
import library.loginpom;
import library.wordpress1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class sample {
	WebDriver driver;
	OpenBrower obj1 = new OpenBrower(driver);
  @Test
  public void openbrowser() {
	  
	  obj1.startbrowser("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe","http://demosite.center/wordpress/wp-login.php");
	  Utilityscreenshot.capturescreenshot(driver, "URLEntered");
  }
  @Test

  public void verifywordpresslogin(){
	  loginpom objl=new loginpom(driver);
	  wordpress1 objwordpress=new wordpress1("wordpress");
	//  objwordpress = objwordpress.wordpresslocators();
		objl.logintestcase("admin", "demo123",objwordpress.usernamexpath,objwordpress.passwordxpath, objwordpress.submitxpath );	  
  } 
}
