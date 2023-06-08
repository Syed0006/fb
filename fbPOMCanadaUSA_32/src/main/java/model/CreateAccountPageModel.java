package model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPageModel extends BaseModel{

	public CreateAccountPageModel(WebDriver d) {
		super(d);
	}
	
	public WebElement callGetFirstName() {
		
		By locator = By.xpath("//input[@name='firstname']");
		WebDriverWait wait = new WebDriverWait(driver, 15);		// time
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));	// condition
		WebElement e = driver.findElement(locator);
		return e;
	}
	
	public WebElement callGetLastName() {
		WebElement e = driver.findElement(By.xpath("//input[@name='lastname']"));
		return e;
	}
	
	public WebElement callGetMobile() {
		WebElement e = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		return e;
	}
	
	public WebElement callGetPassword() {
		WebElement e = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		return e;
	}
	
	public WebElement callYear() {
		WebElement e = driver.findElement(By.xpath("//select[@id='year']"));
		return e;
	}
	
	public WebElement callMonth() {
		WebElement e = driver.findElement(By.xpath("//select[@id='month']"));
		return e;
	}
	
	public WebElement callDay() {
		WebElement e = driver.findElement(By.xpath("//select[@id='day']"));
		return e;
	}
	
	public WebElement callGender(String gender) {
		WebElement e;
		String path = "//label[text()='"+gender+"']/following-sibling::input";
		e=driver.findElement(By.xpath(path));
		return e;
	}
	
	String path = "//label[text()='Male']/following-sibling::input";

	
}
