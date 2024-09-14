package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingRegister {

	WebDriver driver;

	public LandingRegister(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")

	WebElement myAccountDropdown;

	@FindBy(xpath = "//a[text()='Register']")

	WebElement myAccountRegister;

public  WebElement myAccountDropdown() {
	
	return myAccountDropdown;
}


public  WebElement myAccountRegister() {
	
	return myAccountRegister;
}

}
