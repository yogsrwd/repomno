package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class Login extends Base  {
	LandingPage landingPage;
	LoginPage loginPage;
	AccountPage accountPage;
	
	WebDriver driver;
	
	  @Given("Open any Browser")
	    public void open_any_browser() throws IOException {
		  
		  driver  = initializeDriver();
		  
		  
	    }

	    @And("Navigate to Login page")
	    public void navigate_to_login_page() throws InterruptedException {
	    	
			driver.get(prop.getProperty("url"));
			
			 landingPage = new LandingPage(driver);
			landingPage.myAccountDropdown().click();

			landingPage.myAccountLogin().click();


			

			
			
	    }

	    @When("User enters username as {string} and password as {string} into the fields")
	    public void user_enters_username_and_password(String email, String password) throws InterruptedException {
	    	
	    	 loginPage = new LoginPage(driver);

			loginPage.emailField().sendKeys(email);
			
			loginPage.next1().click();
			

			Thread.sleep(2000);

			loginPage.passwordField().sendKeys(password);
			
			Thread.sleep(2000);
			
	    	//loginPage.next2().click();	  


			
			



	    }

	    @And("User clicks on Login button")
	    public void user_clicks_on_login_button() {
	    	
	    	loginPage = new LoginPage(driver);
	    	
	    	loginPage.next2().click(); 
	    	
	    }

	    @Then("Verify user is able to successfully login")
	    public void verify_user_is_able_to_successfully_login() {
	    	
			 accountPage = new AccountPage(driver);
			 accountPage.viewAccount().click();
			 
			 
			 Assert.assertTrue(accountPage.successText().isDisplayed());

	    }
	    
	    @After 
	    public void closeBrowser () {
	    	
	    	driver.close();
	    }
	    
	    

}
