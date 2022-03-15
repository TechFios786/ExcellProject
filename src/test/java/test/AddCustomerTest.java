package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	WebDriver driver;
	
	ExcelReader exlReader 	= new ExcelReader("C:\\Users\\abhad\\Selenium2021\\Exl_Project\\testData\\TechFios_LoginData.xlsx");
	String userName 		= exlReader.getCellData("Logininfo", "Username", 2);
	String password 		= exlReader.getCellData("Logininfo", "Password", 2); 
	String fullName 		= exlReader.getCellData("AddContactInfo", "FullName", 2);
	String companyName 		= exlReader.getCellData("AddContactInfo", "CompanyName", 2);
	String email 			= exlReader.getCellData("AddContactInfo", "Email", 2);
	String phone 			= exlReader.getCellData("AddContactInfo", "Phone", 2);
	String address 			= exlReader.getCellData("AddContactInfo", "Address", 2);
	String city 			= exlReader.getCellData("AddContactInfo", "City", 2);
	String state 			= exlReader.getCellData("AddContactInfo", "State", 2);
	String zip 				= exlReader.getCellData("AddContactInfo", "ZipCode", 2);
	String country 			= exlReader.getCellData("AddContactInfo", "Country", 2);
	
	
	
	@Test
	public void validUserShouldBeAbleToCreateCustomer() throws InterruptedException {
		driver= BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardheader();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContantPage();
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.insertcompanyDropDown(companyName);
		addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhone(phone);
		addCustomerPage.insertAddress(address);
		addCustomerPage.insertCity(city);
		addCustomerPage.insertState(state);
		addCustomerPage.insertZip(zip);
		addCustomerPage.insertCountry(country);
		addCustomerPage.clickSubmitButton();
		
	}
	

}
