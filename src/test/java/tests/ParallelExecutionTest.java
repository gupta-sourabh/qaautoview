package test.java.tests;

import org.testng.annotations.*;

import main.java.base.BasePage;
import main.java.pages.ParallelExecutionPage;

public class ParallelExecutionTest extends BasePage{

	ParallelExecutionPage parallelExecutionPage;

	@Test
	public void executeSessionOne() {
		new ParallelExecutionPage().enterUsername("Sourabh");
	}

	@Test
	public void executeSessionTwo() {
		new ParallelExecutionPage().enterUsername("Anand");
	}

	@Test
	public void executeSessionThree() {
		new ParallelExecutionPage().enterUsername("Ritu");
	}

	@AfterMethod
	public void quitBrowser() {
		parallelExecutionPage.quitBrowser();
	}
}
