package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {

		// this is just constructor

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "acctBtnLabel")

	WebElement myAccountDropdown;

	@FindBy(xpath = "//a[@class='u30darkcta']")

	WebElement myAccountLogin;

public  WebElement myAccountDropdown() {
	
	return myAccountDropdown;
}


public  WebElement myAccountLogin() {
	
	return myAccountLogin;
}

}
