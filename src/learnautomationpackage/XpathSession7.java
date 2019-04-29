package learnautomationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathSession7 {
  WebDriver driver;
  
  @Test(priority =0)
  public void startup(){
  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://demosite.center/wordpress/wp-login.php");
  }
	//Relative XPath
	@Test(priority =2)
  public void xpathbasicsyntax() throws InterruptedException {
		//tagname[@attribute-name='value'] // represents search in complete page
		
		driver.findElement(By.xpath("//input[@name='log']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='log' and @id='user_login']"));
		//driver.findElement(By.xpath("//input[@class='input' and @id='user_login' ]"));//2 matching nodes so we will use AND operator
		driver.findElement(By.xpath("//input[@name='pwd' and @id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@type='checkbox' and @id='rememberme']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @id='wp-submit' and @name='wp-submit']")).submit();			
		/*if(driver.findElement(By.id("login_error")).getText().contains("ERR")){
			System.out.println("User would not be able to login due to incorrect username & password");			
		}
		else{
			System.out.println("User has successfully logged in");	
		}*/
		
}
	@Test(priority =1)
	public void xpathmultipleattribute() {
		//tagname[@attribute1='value'][@attribute2='value']
		driver.findElement(By.xpath("//a[@href='https://wordpress.org/'][@title='Powered by WordPress']"));
		String Actualtittle=driver.getTitle();
		System.out.println(Actualtittle);
		String Expectedtitle="Log In ‹ Wordpress Demo Site at Demo.Center — WordPress";
		if(Actualtittle.contentEquals(Actualtittle)){
			System.out.println("Title is correct");
		}
		else{
			System.out.println("Title is incorrect");
		}
		Assert.assertEquals(Actualtittle, Expectedtitle, "It is not matching something is wrong with title");
	}
	@Test(priority=3)
	public void xpathcontains(){
		//tagname[contains(@attribute,'value')]//contains() & text() both are methods
		//*[contains(@attribute,'value')]
		driver.findElement(By.xpath("//a[contains(@href, 'php')][text()='1 Comment']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'comment')][@type='checkbox']")).click();
		if(driver.findElement(By.xpath("//input[contains(@name,'comment')][@type='checkbox']")).isSelected()){
			System.out.println("checkbox is checked");
		}
		else{
			System.out.println("checkbox is not checked");
		}
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@name,'comment')][@type='checkbox']")).isSelected(), "check box is not selected");
	}
	
	@Test(priority=4)
	public void xpathstartwith() throws InterruptedException{
		driver.navigate().back();
	//*[starts-with(@attribute, 'value']
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[starts-with(@class,'wp-menu')][text()='Posts']")).click();
		driver.findElement(By.xpath("//a[@class='page-title-action'][text()='Add New']")).click();	
		driver.findElement(By.xpath("//button[@type='button' and @data-wp-editor-id='content'][text()='Text']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//label[@id='title-prompt-text'][text()='Enter title here']")).sendKeys("Registration");
		driver.findElement(By.xpath("//*[contains(text(),'Media')][@type='button']//following::input[@value='b'][1]")).click();
        driver.findElement(By.xpath("//textarea[@name='content' and @id='content']")).sendKeys("This is registration form");
	}	
	}


