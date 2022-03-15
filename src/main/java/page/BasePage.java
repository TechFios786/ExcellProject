package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;

	
	//Wait Method
		public void waitForElement(WebDriver driver, int waitTime, WebElement Element ) {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.visibilityOf(Element));	
		}
		//Random Number Generator
		public int generateRandonNumber(int bouindaryNumber) {
			Random rand = new Random();
			return rand.nextInt(bouindaryNumber);
			
		}
		public void selectFromDropDown(WebElement element, String visibleText) {
			Select sel = new Select(element);
			sel.selectByVisibleText(visibleText);
			Actions ac = new Actions(driver);
	
		}
}
