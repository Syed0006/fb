package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class CreatePageTest extends BaseTest{
	
	@Test(dataProvider = "dp")
	public void createAccountPageTest(String firstName, String lastName, String mobile, String password, 
			String year, String month, String day, String gender) throws InterruptedException {
		
		getCreateAccountPage();
		cap.typeFirstName(firstName);
		cap.typeLastName(lastName);
		cap.typeMobile(mobile);
		cap.typePassword(password);
		cap.selectYear(year);
		cap.selectMonth(month);
		cap.selectDay(day);
		cap.clickGender(gender);
		
	}
	
	@DataProvider(name="dp")
	public Object[][] dataFeeder() throws IOException{
		
		Object[][] t;
		
		String fileLocation	= "data/fb.xlsx";
		String sheetName = "Sheet5";
		
		ExcelReader aaa=new ExcelReader(fileLocation, sheetName);
		t= aaa.excelToArray();	
		
		return t;
	}

}
