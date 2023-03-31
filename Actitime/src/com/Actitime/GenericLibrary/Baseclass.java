package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.Homepage;
import com.Actitime.pom.LoginPage;
import com.Actitime.pom.Taskpage;

public class Baseclass {
//	static {
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//	}
	//we use every methods thats why we mention Global area 
	public static  WebDriver driver;
	FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("Database connected successfully",true );
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("Datatabase disconnected successfully",true );
	}
	@BeforeClass
	public void launchbrowser() throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//call the non-static method
		
		
		String URL = f.readDataFromProperty("url");
		driver.get(URL);
		
		
		Reporter.log("browser launched",true);
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		
	Reporter.log("browser closed",true);
	}

@BeforeMethod
public void login() throws IOException, InterruptedException {
	Thread.sleep(2000);
	String un = f.readDataFromProperty("username");
	String pwd = f.readDataFromProperty("password");
	
	//click on login page(username,password,click)
	
	LoginPage lp=new LoginPage(driver);
	lp.getUntbx().sendKeys(un);
	lp.getPwtbx().sendKeys(pwd);
	lp.getLgbtn().click();
	
	Reporter.log("logged in successfully",true);
}
@AfterMethod
public void logout() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("logged out",true);
}
	

}
