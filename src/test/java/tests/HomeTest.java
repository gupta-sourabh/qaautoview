package test.java.tests;

import org.testng.annotations.*;

import main.java.base.BasePage;
import main.java.pages.HomePage;

public class HomeTest extends BasePage{
	HomePage homePage;
	
	public HomeTest() {
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		homePage = new HomePage();	
	}
	
	@Test
	public void verifySignIn(){
		homePage.clickOnSignOption();
		System.out.println("Test verifySignIn: " + Thread.currentThread().getId());
	}
	
	@Test
	public void verifyPricing(){
		homePage.clickPricingOption();
		System.out.println("Test verifyPricing: " + Thread.currentThread().getId());
	}
	
	@AfterTest
	public void browserClose() {
		closeBrowser();
	}
}
