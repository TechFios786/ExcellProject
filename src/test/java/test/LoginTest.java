package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	WebDriver driver;
	ExcelReader exlReader = new ExcelReader("C:\\Users\\abhad\\Selenium2021\\Exl_Project\\testData\\TechFios_LoginData.xlsx");
	String userName = exlReader.getCellData("Logininfo", "Username", 2);
	String password = exlReader.getCellData("Logininfo", "Password", 2);
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.clickSignInButton();
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardheader();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		
		
	}
}
