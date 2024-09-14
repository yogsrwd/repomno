package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest  extends Base {
	
	WebDriver driver; 
	
@Test	
public void testTwo() throws IOException {
	
	System.out.println("testTwo from TestTwo");
	
	driver = initializeDriver();
	
	driver.get("https://omayo.blogspot.com/");
	
	
}
}
