package learnautomationpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Readexcel {
	WebDriver driver;
	
	public static void main (String [] args){
	
		
		File src = new File("./data/datasheet.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheetAt(0);
		
		for (int i=0; i<sh.getLastRowNum(); i++){
			XSSFRow rowno=sh.getRow(i);
			for (int j=0; j<i; j++){
			String username1=rowno.getCell(j).getStringCellValue();
			System.out.println(username1);
		}
		}} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
}

