package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateAccountPageModel;

public class CreateAccountPage extends CreateAccountPageModel{
	
	public CreateAccountPage(WebDriver d) {
		super(d);
	}
	
	public void typeFirstName(String firstName) throws InterruptedException {
		
		//Thread.sleep(2000);
		WebElement e = callGetFirstName();
		e.clear();
		e.sendKeys(firstName);
	}
	public void typeLastName(String lastName) {
		
		WebElement e = callGetLastName();
		e.clear();
		e.sendKeys(lastName);
	}
	
	public void typeMobile(String mobile) {
		WebElement e =callGetMobile();
		e.clear();
		e.sendKeys(mobile);
	}
	
	public void typePassword(String password) {
		WebElement e = callGetPassword();
		e.clear();
		e.sendKeys(password);
	}
	
	public void selectYear(String year) {
		WebElement e=callYear();
		Select a=new Select(e);
		a.selectByVisibleText(year);
	}
	
	public void selectMonth(String month) {
		WebElement e=callMonth();
		Select a=new Select(e);
		a.selectByVisibleText(month);
	}
	
	public void selectDay(String day) {
		WebElement e=callDay();
		Select a=new Select(e);
		a.selectByVisibleText(day);
	}
	
	public void clickGender(String gender) {
		WebElement e = callGender(gender);
		e.click();
	}
}
