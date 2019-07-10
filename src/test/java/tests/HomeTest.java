package test.java.tests;

import org.testng.annotations.*;

import main.java.base.BasePage;
import main.java.pages.HomePage;

public class HomeTest extends BasePage{
	HomePage homePage;
	
	public HomeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
//		homePage.validateGoogleLogo();
	}
}
