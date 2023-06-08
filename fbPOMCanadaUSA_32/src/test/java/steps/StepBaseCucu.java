package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import page.HomePage;

public class StepBaseCucu {
	
	static WebDriver driver;
	HomePage homepage;
	
	@Before("@fb")							// cucumber @Before tag
	public void setUp() {
		driver = getDriver("Chrome");
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
	}
	
	public WebDriver getDriver (String browser) {
		
		if (driver==null) {
			if (browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/syedahmed/Downloads/chromedriver");
				driver=new ChromeDriver();
			}
		}
		return driver;
	}
	

}
