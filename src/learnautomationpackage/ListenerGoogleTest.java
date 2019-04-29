package learnautomationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Listeners(library.ListenersDemo.class)

public class ListenerGoogleTest {
	WebDriver driver;
	
	@Test(groups={"smoke"})
	public void verifygoogle() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		 System.out.println("Title is"+" "+driver.getTitle());
  }
	@Test(groups={"Regression"})
	public void opengmail(){
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
	   // driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8982112290");
	   // driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
}
