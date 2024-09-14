package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver  driver; 
	
	public LoginPage(WebDriver driver ) {
		
		this.driver = driver;
		

		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(id = "idcs-signin-basic-signin-form-username")
	
	WebElement emailField;
	
	public WebElement emailField() {
		
		return emailField;
		
		
	}
	
	@FindBy (id = "idcs-auth-pwd-input|input")
	
	WebElement passwordField;
	
	public WebElement passwordField() {
		
		return passwordField;
	}
	
	@FindBy(id = "ui-id-3")
	WebElement next1;
	
	public WebElement next1() {
		
		return  next1;  
	}
	
	@FindBy(id = "ui-id-2")
	WebElement next2;
	
	public WebElement next2() {
		
		return  next2;  
	}
	
	
	
	

}
