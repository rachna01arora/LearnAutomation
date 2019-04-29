package learnautomationpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserSession2 {
        
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com/");
		driver.close();

	}

}
