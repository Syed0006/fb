package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CreateAccountPage;
import page.HomePage;

public class HomeStepsCucu {
	
	WebDriver driver=StepBaseCucu.driver;
	HomePage homePage=new HomePage(driver);
	CreateAccountPage createAccountPage;
	
	@Given("I am in home page of {string}")
	public void i_am_in_home_page_of(String string) {
	    driver.get(string); 
	}

	@When("I click on clickOnCreateNewAccount")
	public void i_click_on_click_on_create_new_account() {
		homePage.clickOnCreateNewAccount();
	}

	@When("I enter {string} and {string} and {string} and {string}")
	public void i_enter_and_and_and(String firstName, String lastName, String mobile, String password) throws InterruptedException {
	    createAccountPage=new CreateAccountPage(driver);
	    
	    createAccountPage.typeFirstName(firstName);
	    createAccountPage.typeLastName(lastName);
	    createAccountPage.typeMobile(mobile);
	    createAccountPage.typePassword(password);
	}

	@When("select {string} and {string} and {string}")
	public void select_and_and(String year, String month, String day) {
		createAccountPage.selectYear(year);
		createAccountPage.selectMonth(month);
		createAccountPage.selectDay(day);
	}

	@Then("I click on {string}")
	public void i_click_on(String gender) {
		createAccountPage.clickGender(gender);

	}

}
