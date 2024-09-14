package fdpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Oracle {
	
	WebDriver driver;
	
	
	

	
	
	
@Test
 public void loginAtOracle() {
	 
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

	 
	 
	 driver.get("https://www.oracle.com/in/");
	 
	 driver.findElement(By.id("acctBtnLabel")).click();
	 
	 
 }
	
	
	

}



