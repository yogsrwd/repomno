package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	

	public RegisterPage(WebDriver driver 	) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy (id = "input-firstname")
	WebElement FirstNameField;
	
	public WebElement firstNameField() {
		
		return FirstNameField;
	}
	
	@FindBy (id = "input-lastname")
	WebElement LastName;
	
	public WebElement lastName() {
		
		return LastName;
	}
	
	@FindBy (id = "input-email")
	WebElement emailField;
	
	public WebElement emailField() {
		
		return emailField;
	}
	
	@FindBy (id = "input-telephone")
	WebElement telephoneNumber;
	
	public WebElement telephoneNumber() {
		
		return telephoneNumber;
	}
	
	@FindBy (id = "input-password")
	WebElement passwordField;
	
	public WebElement passwordField() {
		
		return passwordField;
	}
	
	@FindBy (id = "input-confirm")
	WebElement confirmPassword;
	
	public WebElement confirmPassword() {
		
		return confirmPassword;
	}
	
	@FindBy(xpath= "//input[@name='agree']")
	
	WebElement checkBox;
	
	public WebElement  checkBox() {
		
		return checkBox;
	}
	
	@FindBy(xpath= "//input[@value='Continue']")
	
	WebElement done;
	
	public WebElement  done() {
		
		return done;
	}
	
	
	
	
	
	
	
	

}
