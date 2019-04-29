package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrower {
	public WebDriver driver1;
	
	public OpenBrower(WebDriver driver){		
		driver1=driver;		
	}
	
	public void startbrowser(String drivername, String driverpath, String URL){
	System.setProperty(drivername, driverpath);
	  driver1=new ChromeDriver();
	  driver1.manage().window().maximize();
	  driver1.get(URL);
	  

}
	
}
