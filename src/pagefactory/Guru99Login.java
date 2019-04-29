package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99Login {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement user99GuruName;

	@FindBy(name="password")
	WebElement password99Guru;
	
	@FindBy(className="barone")
	WebElement titleText;
   
	@FindBy(className="btnLogin")
	WebElement login;
    

    public Guru99Login(WebDriver driver){

        this.driver = driver;

    }

    public void setUserName(String strUserName){

    	user99GuruName.sendKeys(strUserName);

    }

    public void setPassword(String strPassword){

    	password99Guru.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

            login.click();

    }

    //Get the title of Login Page

    public String getLoginTitle(){

     return    titleText.getText();

    }

    public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();        
    }


}
