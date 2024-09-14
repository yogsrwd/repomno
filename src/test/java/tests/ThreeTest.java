package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest  extends Base{
	
	WebDriver driver;  

	
@Test	
public void threeTest() throws IOException  {


System.out.println("threeTest from TestThree");

driver = initializeDriver();

driver.get("https://omayo.blogspot.com/");


}
}
