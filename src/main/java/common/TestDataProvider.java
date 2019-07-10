package main.java.common;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class TestDataProvider {
	
	@DataProvider
	public static Object[][] DefinitionMediaSearchPUTDataProvider() {
		return new Object[][] {
			{ ExpectedResult.definitionMediaSearchPut,"putData"}
		};
	}
}