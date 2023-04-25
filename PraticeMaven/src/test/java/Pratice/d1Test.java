package Pratice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d1Test {
	@Test
	public void sample() {
		WebDriver driver=null;
		String BROWSER = System.getProperty("browser");
	    String URL = System.getProperty("url");

	    
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=WebDriverManager.chromedriver().create();
			
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=WebDriverManager.edgedriver().create();
			
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver=WebDriverManager.firefoxdriver().create(); 
			
		}
		
		else 
		{
			WebDriverManager.chromedriver().create();	
}
//driver.get(URL);
}

	}


