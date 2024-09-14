package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.ContinuePage;
import pageobjects.LandingRegister;
import pageobjects.MyAccount2;
import pageobjects.RegisterPage;
import resources.Base;

public class RegisterTest extends Base {

	WebDriver driver;

	@Test
	public void register() {

		LandingRegister landingRegister = new LandingRegister(driver);
		landingRegister.myAccountDropdown().click();
		landingRegister.myAccountRegister().click();

		RegisterPage registerPage = new RegisterPage(driver);

		registerPage.firstNameField().sendKeys(prop.getProperty("firstname"));
		registerPage.lastName().sendKeys(prop.getProperty("lastname"));
		registerPage.emailField().sendKeys(prop.getProperty("email"));
		registerPage.telephoneNumber().sendKeys(prop.getProperty("telephone"));
		registerPage.passwordField().sendKeys(prop.getProperty("password"));
		registerPage.confirmPassword().sendKeys(prop.getProperty("password"));
		registerPage.checkBox().click();
		registerPage.done().click();

		ContinuePage continuePage = new ContinuePage(driver);

		continuePage.done2().click();

		MyAccount2 myAccount2 = new MyAccount2(driver);

		if (myAccount2.successTextreg().isDisplayed())

		{

			System.out.println("account created succesfully");

		}

	}

	@BeforeMethod
	public void openBrowser() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));

	}
	@AfterMethod
	public void closure() {
		
		driver.close();
	}
}
