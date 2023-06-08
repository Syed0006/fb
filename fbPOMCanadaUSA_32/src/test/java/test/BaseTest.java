package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreateAccountPage;
import page.HomePage;

public class BaseTest {
	
	static WebDriver driver;
	static HomePage hp;
	static CreateAccountPage cap;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/syedahmed/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public void getHomePage() {
		hp=new HomePage(driver);
	}
	public void getCreateAccountPage() {
		cap=new CreateAccountPage(driver);
	}

}
