package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	

	WebDriver driver;

	public AccountPage(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id= "acctBtnLabel")
	
	WebElement viewAccount;
	
	public WebElement viewAccount() {
		
		return viewAccount;
	}
	
	@FindBy(linkText= "jojo jija")
	
	WebElement successText;
	
	public  WebElement successText() {
		
		return successText;
	}
	
	

}
