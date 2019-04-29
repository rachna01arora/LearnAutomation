package learnautomationpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataExcel {

	public static void main(String[] args) throws Exception {
		
		
			try {
				File src = new File("D:\\Automation\\readfile.xlsx");
				FileInputStream  fis = new FileInputStream(src);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet= wb.getSheetAt(0);
				
				String value1= sheet.getRow(0).getCell(0).getStringCellValue();
				String value2= sheet.getRow(0).getCell(1).getStringCellValue();
				String value3= sheet.getRow(1).getCell(0).getStringCellValue();
				String value4= sheet.getRow(1).getCell(1).getStringCellValue();
				
				//int value5= (int)sheet.getRow(2).getCell(0).getNumericCellValue();
				
				System.out.println(value1+" "+value2);
				System.out.println(value3+" "+value4);
				
				
					
					
				
			} 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}

}
