package learnautomationpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropdownSession5 {
	WebDriver driver;
  @Test
  public void checkbootstrap() {
	 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//button[@class ='btn btn-primary dropdown-toggle']")).click();
	List<WebElement> elements= driver.findElements(By.xpath("//button[@class ='dropdown-menu test']"));
	 /*for(int i=0;i<elements.size();i++){
		 
		 WebElement getelement=elements.get(i);
		 String printelement= getelement.getAttribute("innerHTML");*/
	
		for(WebElement ele: elements){
	              String value= ele.getAttribute("innerHTML");
		 
		 if(value.contentEquals("JavaScript")){
			 ele.click();
			 break;
			 
		 }
		 driver.close();
	 }
	 
	  
  }
}
