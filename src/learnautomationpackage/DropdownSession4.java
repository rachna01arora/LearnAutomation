package learnautomationpackage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownSession4 {
	WebDriver driver;
	private WebElement ele;
	
	@BeforeTest
	public void setup(ITestContext ctx) {
	TestRunner runner = (TestRunner) ctx;
	runner.setOutputDirectory("D:/Automation/");
	}
	
  @Test(priority =0)
  public void Dropdowngmail() {
	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
	  @Test(priority =1)
	  public void Verifybirthdate() throws InterruptedException{
	  WebElement birthdate = driver.findElement(By.name("birthday_day"));
	  Thread.sleep(3000);
	  Select sel1 = new Select(birthdate);
	  sel1.selectByIndex(1);
	  String birthdateverify = driver.findElement(By.name("birthday_day")).getAttribute("value");
	  Assert.assertEquals(birthdateverify, "1", "If values does not match it should fail");
	  }
	  @Test (priority =2)
	  public void Verifybirthmonth(){
	  WebElement birthmonth = driver.findElement(By.name("birthday_month"));
	  Select sel2 = new Select(birthmonth);
	  sel2.selectByValue("3");
	  //String birthmontheverify = driver.findElement(By.name("birthday_month")).getText();
	  //Assert.assertTrue(birthmontheverify.contains("Mar"), "If birthmonthverify does not match it should fail");
	 
	  WebElement selected_value=sel2.getFirstSelectedOption();
	  Assert.assertEquals(selected_value.getText(), "Mar");
	  
	  
	  }
	  @Test (priority =3)
	  public void Verifybirthyear(){
	  WebElement birthyear = (WebElement) driver.findElement(By.name("birthday_year"));
	  Select sel3 = new Select(birthyear);
	  List<WebElement> birthyearelement = sel3.getOptions();
	  
	  int monthlist = birthyearelement.size();
	  System.out.println(monthlist);
	  
	  for(WebElement ele: birthyearelement){
	 String Allvalues = ele.getText();
	 System.out.println("values are :" + Allvalues);
	   
	  }
	  //sel3.selectByVisibleText("1991");	
	  //String birthyearverify = driver.findElement(By.name("birthday_year")).getAttribute("value");
	  //Assert.assertEquals(birthyearverify, "1991", "If values does not match it should fail");
	  driver.close();
	  }	  
		  
		  
  }

