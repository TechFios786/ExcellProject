package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//h5[normalize-space()='Add Contact']") 
	WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement ADD_CONTACT_FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']") WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']") WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-country-container\"]") WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement SUBMIT_ELEMENT;
	
	
	public void verifyAddContantPage() {
		
		//waitForElement(driver, 6, ADD_CONTACT_HEADER_ELEMENT);
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(),"Add Contact", "wrong page");
		
	}
	public void insertFullName(String fullName) {
		int generateNum = generateRandonNumber(9999);
		
		ADD_CONTACT_FULLNAME_ELEMENT.sendKeys(fullName + generateNum);
	}

	public void insertcompanyDropDown(String company) {
		//since its a drop down we need to use the Class "select"
		
		selectFromDropDown(COMPANY_NAME_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandonNumber(999)+email);
		
		
	}
	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone);
	}
	
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}
	public void insertCity (String city) {
		CITY_ELEMENT.sendKeys(city);
	}

	public void insertState(String state) {
		STATE_ELEMENT.sendKeys(state);
	}
	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}
	public void insertCountry(String country) throws InterruptedException {
		Thread.sleep(3000);
		selectFromDropDown(COUNTRY_ELEMENT, country);
		
	}
	public void clickSubmitButton() {
		SUBMIT_ELEMENT.click();
	}
}
