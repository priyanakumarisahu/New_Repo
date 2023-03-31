package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLibrary {
	
	/** this class is a Generic class which is having non static method to perform Data Driven testing 
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	//create non-static method 
	
	public String readDataFromProperty(String key) throws IOException {
		//for read the property file we use fileinputstream
		FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
		
		//call the non static method inside the property file
		Properties p=new Properties();
		
		//property files inside non static method load 
		p.load(fis);
		
		//to get non static method inside property file
	  String value = p.getProperty(key);
	  
	  //return the value
	  return value;
		
		
	}
	/**
	 * this method is a non static to read the data from excel sheet
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDatafromExcelfile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream("./TestData/ActitimeTestdata.xlsx");
		Workbook wb = WorkbookFactory .create(fis1);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
		
		
		
		
		
		
		

}
}
