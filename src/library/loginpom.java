/**
 * 
 */
package library;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginpom  {
	WebDriver driver;
    
	//By is one class name it will return By only therefore we are using By keyword before username	
//we have created constructor it name should be same as class name which is used to intialize the driver
	//reference to webdriver
	public loginpom(WebDriver driver){
			this.driver=driver;	
	}	
	public void logintestcase(String user, String pass, By usernamexpath, By passwordxpath, By submitxpath){
		By userx =By.id("user_login");
		driver.findElement(By.id("user_login")).sendKeys(user);
		driver.findElement(userx).sendKeys(user);
		driver.findElement(usernamexpath).sendKeys(user);
		
		driver.findElement(passwordxpath).sendKeys(pass);
		driver.findElement(submitxpath).click();
	}
	//public void posttestcase(String description){
		//driver.findElement(By.xpath("//div[text()='Posts']")).click();
		//driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
		//driver.findElement(By.xpath("//label[@for='title']")).sendKeys(description);
		
		
	
}
