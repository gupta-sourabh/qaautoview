package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.base.BasePage;

public class HomePage extends BasePage {
	@FindBy(id="sourabh") WebElement username;	
	@FindBy(id="sourabh") WebElement password;
	@FindBy(id="sourabh") WebElement goLogo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
/*	public boolean validateGoogleLogo() {
		return goLogo.isDisplayed();
	}*/
}
