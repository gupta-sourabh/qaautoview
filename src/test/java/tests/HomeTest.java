package test.java.tests;

import org.testng.annotations.*;
import main.java.base.BasePage;
import main.java.pages.HomePage;

public class HomeTest extends BasePage{
	HomePage homePage;
	
	@BeforeMethod
	public void setUp(){
		openApplication();
		homePage = new HomePage();
	}
	
	@Test
	public void verifyDeals(){
		homePage.clickOnDealsOption();
		System.out.println("Test verifySignIn: " + Thread.currentThread().getId());
	}
	
	@Test
	public void verifySell(){
		homePage.clickOnDealsOption();
		System.out.println("Test verifyPricing: " + Thread.currentThread().getId());
	}

	@AfterTest
	public void browserClose() {
		closeBrowser();
	}
}
