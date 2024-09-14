package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount2 {
	WebDriver driver ;

	public MyAccount2(WebDriver driver ) {
		
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(linkText = "Edit your account information")
	
	WebElement successTextreg;
	
	public WebElement successTextreg() {
		
		return successTextreg;
		
	}

	
}