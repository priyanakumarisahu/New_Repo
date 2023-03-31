package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.Taskpage;

public class TaskTest extends Baseclass {
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
		Homepage hp=new Homepage(driver);
		hp.getTasklnk().click();
		
		Taskpage tp=new Taskpage(driver);
		tp.getAddNewbtn().click();
		
		tp.getNewcust().click();
		
		FileLibrary f=new FileLibrary();
		String name = f.readDatafromExcelfile("Sheet1", 4, 1);
		tp.getCustname().sendKeys(name);
		String desp = f.readDatafromExcelfile("Sheet1", 4, 2);
		tp.getCustdesp().sendKeys(desp);
		tp.getCreatecust().click();
		
		
	
}
}
