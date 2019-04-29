package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wordpress1 {
	WebDriver driver;
	public By usernamexpath;
    public By passwordxpath;
	public By submitxpath;
	
	public wordpress1 wordpresslocators(){
		wordpress1 objwordpress1=new wordpress1("");
		objwordpress1.usernamexpath =By.id("user_login");
		objwordpress1.passwordxpath= By.xpath("//input[@id='user_pass']");
		objwordpress1.submitxpath =By.name("wp-submit");
	
		return objwordpress1;
}
	public wordpress1(String type){
		switch (type){
		case "wordpress":
		usernamexpath =By.id("user_login");
		passwordxpath= By.xpath("//input[@id='user_pass']");
		submitxpath =By.name("wp-submit");
		break;
		case "gmail":
			usernamexpath =By.id("user_login");
			passwordxpath= By.xpath("//input[@id='user_pass']");
			submitxpath =By.name("wp-submit");
			break;
		}
	}
	
}


