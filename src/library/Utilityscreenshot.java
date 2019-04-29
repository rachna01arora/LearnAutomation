package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utilityscreenshot {
	WebDriver driver;
	public static void capturescreenshot(WebDriver driver, String screenshotname){
		try {
			//you cannot create object of any interface you have to type cast with webdriver reference so that you can create object
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			//it will take screenshot and keep in buffer or memory
			FileUtils.copyFile(source, new File("./screenshots/"+screenshotname+".png"));
			//.means it will look for current package and then single slash for folder
		} catch (Exception e) {
			System.out.println("There is exception"+ e.getMessage());
  }
		}
}


