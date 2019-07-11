package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import main.java.base.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath="//a[text()=\"Today's Deals\"]") WebElement deals;
	@FindBy(xpath="//a[text()='Your Amazon.in']") WebElement sellOption;
	@FindBy(xpath="//div[text()=\"Today's Deals\"]") WebElement dealsDiaplyed;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickOnDealsOption() {
		deals.click();
		dealsDiaplyed.isDisplayed();
		return new HomePage();
	}

}
