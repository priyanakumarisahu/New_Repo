package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Decleration
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement lgbtn;
	
	
	



//Initialization
//here we use webdriver driver to avoid staleElementReferenceException:
	//It’s one of selenium Exception , whenever webdriver try to identify an element , 
//	element was available in GUI, but at time of performing an action on the elements element was not recognized due to  page got refreshed or elements may become old or element not attached to page in such case we get  staleElementReferenceException

	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//utilization

public WebElement getUntbx() {
	return untbx;
}

public WebElement getPwtbx() {
	return pwtbx;
}

public WebElement getLgbtn() {
	return lgbtn;
}
}
