package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Readdata {
	WebDriver driver;
	File src;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	int numrow;
	
	public Readdata(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterdata( ) throws IOException{
		
		try {
			src=new File("D:\\Automation\\readfile.xlsx");
			fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(0);
			//numrow = sheet.getRow
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
			String value1=sheet.getRow(1).getCell(0).getStringCellValue();
			String value2=sheet.getRow(1).getCell(1).getStringCellValue();
			//driver.findElement(By.id("user_login")).sendKeys(value1);
			//driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(value2);
			//driver.findElement(By.name("wp-submit")).click();
			
	}

}
