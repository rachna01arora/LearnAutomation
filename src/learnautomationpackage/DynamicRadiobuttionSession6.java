package learnautomationpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicRadiobuttionSession6 {
	WebDriver driver;
  @Test
  public void Dynamicradiobutton() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.dyn-web.com/tutorials/forms/examples/pizza.php");
	  //we have created our own xpath which will return 3 matching nodes list name=size and type=radio using findElements
	  
	 List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio' and @name='size']"));
	
	  for(int i=0; i<radio.size(); i++){
		  
		 WebElement radio_count =radio.get(i);
		 String valuecount= radio_count.getAttribute("value");
		 System.out.println("valuecounts of all radio button are"+""+ valuecount);
		 
		 Thread.sleep(2000);
		 
		 if(valuecount.contains("12")){
			 radio_count.click();
			 break;
					 
		 }
		Assert.assertTrue(valuecount.contentEquals("12"), "It has not selected correct radio button Large");
		 
		// Thread.sleep(5000);
		// driver.close();
	  }
	  
  }
}
