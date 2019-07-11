package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ParallelExecutionPage {
	WebDriver driver;
	
	@FindBy(id = "uid")	WebElement username;

	public void enterUsername(String username) {
		// Second session of WebDriver
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys(username);
	}

	public void quitBrowser() {
		driver.quit();
	}
}
