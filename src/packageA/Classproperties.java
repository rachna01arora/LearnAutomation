package packageA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 public class Classproperties {
	WebDriver driver;
	public String SURL;
	public String Susernme;
	public String Spassword;
	
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		Properties prop= new Properties();
		try {
			FileInputStream objfile = new FileInputStream(new File("./src/com.objectrepository.demo/config.properties"));	
			//prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
				prop.load(objfile);
				SURL=prop.getProperty("URL");
				Susernme=prop.getProperty("usernme");
				Spassword=prop.getProperty("Spassword");
				
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		}
		catch (IOException e) {			
			e.printStackTrace();
		}	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		driver.get(SURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	}
	


