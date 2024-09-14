package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinuePage {
	WebDriver driver ;

	public ContinuePage(WebDriver driver ) {
		
	 this.driver = driver ;
	 PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//a[@class = 'btn btn-primary']")
	
	WebElement done2;
	
	public WebElement done2() {
		
		return done2;
		
	}

	
}
