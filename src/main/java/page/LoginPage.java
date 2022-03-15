package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements List
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USER_NAME_ELEMENTS;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEMETN;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_ELEMENT;

	// Intecractable Methods
	
	public void insertUserName(String userName) {
		USER_NAME_ELEMENTS.sendKeys(userName);
	}
	public void insertPassword(String password) {
		PASSWORD_ELEMETN.sendKeys(password);
	}
	public void clickSignInButton() {
		SIGNIN_ELEMENT.click();
	}
	

}
