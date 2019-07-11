package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.base.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath="//a[text()='Sign Up']") WebElement signUpOption;
	@FindBy(xpath="//a[text()='Pricing']") WebElement pricingOption;
	@FindBy(xpath="//span[text()='Log In']") WebElement loginButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickOnSignOption() {
		signUpOption.click();
		return new HomePage();
	}
	
	public HomePage clickPricingOption() {
		pricingOption.click();
		return new HomePage();
	}
}
