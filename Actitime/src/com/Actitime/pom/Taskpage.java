package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
	
	//Decleration
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement Newcust;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcust;
	
	//Initialization
	
		public Taskpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	
		}
		
		//Utilization


		public WebElement getAddNewbtn() {
			return addNewbtn;
		}

		public WebElement getNewcust() {
			return Newcust;
		}

		public WebElement getCustname() {
			return custname;
		}

		public WebElement getCustdesp() {
			return custdesp;
		}

		public WebElement getCreatecust() {
			return createcust;
		}
		
		
	
	
	

}
