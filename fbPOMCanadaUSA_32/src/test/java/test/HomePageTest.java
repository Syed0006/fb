package test;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
	
	@Test
	public void hpTest() {
		// create an object of HomePage
		// invoke the method of HomePage
		getHomePage();
		hp.clickOnCreateNewAccount();
	}

}
