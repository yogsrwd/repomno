package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base {

	public WebDriver driver;

	@Test
	public void testFour() throws IOException {

		System.out.println("testFour from FourTest");

		driver = initializeDriver();

		driver.get("https://omayo.blogspot.com/");

		Assert.assertTrue(false);

	}

	@Test
	public void  testFive() {
		
		System.out.println("testFive ");
	}
	public void closure() {

		driver.close();
	}
}
