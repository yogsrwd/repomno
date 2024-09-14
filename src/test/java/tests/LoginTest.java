package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	
	Logger log;
	
	

	WebDriver driver;

	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String Expected) throws IOException, InterruptedException {
		
		

		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		log.debug("Clicked on My view Account ");

		landingPage.myAccountLogin().click();
		log.debug("Clicked on sign in  option");


		LoginPage loginPage = new LoginPage(driver);

		loginPage.emailField().sendKeys(email);
		
		loginPage.next1().click();
		log.debug("Email addressed got entered");
		
		Thread.sleep(2000);

		loginPage.passwordField().sendKeys(password);
		loginPage.next2().click();
		log.debug("password  got entered");

		log.debug("Clicked on login button");

		

		AccountPage accountPage = new AccountPage(driver);
		
		
		
		accountPage.viewAccount().click();
		
		Thread.sleep(3000);
		
		


		String actualResult;

		try {

			accountPage.successText().isDisplayed();
			actualResult = "successfull";
			log.info("Login Test got passed");

			

		} catch (Exception e) {

			actualResult = "failure";
			log.error("Login Test got failed");


		}

		Assert.assertEquals(actualResult, Expected);

	}

	@AfterMethod
	public void closure() {
		
			driver.close();
			log.debug("Browser got closed");

			
			
		}

	
	@BeforeMethod
	public void openBrowser() throws IOException {
		
		log = LogManager.getLogger(LoginTest.class.getName());

		driver = initializeDriver();
		log.debug("Browser got launched");


		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");

		
		
	}

	@DataProvider
	public Object[][] getLoginData() {

		Object[][] data = { { "onlybhailog1@gmail.com", "9898@Rr123", "successfull" } ,{"invalidemail@example.com", "wrongpassword", "failure"}};
		return data;

	}

}
