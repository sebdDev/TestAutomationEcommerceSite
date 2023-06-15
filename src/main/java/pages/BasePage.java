package pages;

import java.security.SecureRandom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	 SecureRandom rand = new SecureRandom();

	public int randomNumberGenerator() {
		return rand.nextInt(1100);
		
		 
	}

	public int dateNumberGenerator() {
		return rand.nextInt(32);
		
	}

	public String phoneNumberGenerator() {
		int areaCode = rand.nextInt(1100);
		int firstThree = rand.nextInt(1100);
		int lastfour = rand.nextInt(11000);
		return areaCode + " " + firstThree + " " + lastfour;
	}

	public void selectFromDropdownByVisibleText(WebElement element, String input) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(input);
	}

	public void selectFromDropdownByValue(WebElement element, String input) {
		Select dropdown = new Select(element);
		dropdown.selectByValue(input);
	}

	public String removeDecimalPoint(String str) {
		return str.substring(0, str.length() - 2);
	}

	public double convertStringToDouble(WebElement element) {
		
		return Double.parseDouble(element.getText().substring(1));
	}

	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
