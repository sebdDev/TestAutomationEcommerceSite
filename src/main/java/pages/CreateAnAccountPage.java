package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAnAccountPage extends BasePage {

	WebDriver driver;
	
	public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']") WebElement Mr_RadioButton;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']") WebElement FirstName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']") WebElement LastName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']") WebElement Password_Field;
	@FindBy(how = How.XPATH, using = "//select[@id='days']") WebElement Day_Selection;
	@FindBy(how = How.XPATH, using = "//select[@id='months']") WebElement Month_Selection;
	@FindBy(how = How.XPATH, using = "//select[@id='years']") WebElement Year_Selection;
	@FindBy(how = How.XPATH, using = "//input[@id='newsletter']") WebElement Newsletter_CheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='optin']") WebElement SpecialOffer_CheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='firstname']") WebElement Address_FirstName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='lastname']") WebElement Address_LastName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='company']") WebElement Address_Company_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='address1']") WebElement Address1_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='address2']") WebElement Address2_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement City_Field;
	@FindBy(how = How.XPATH, using = "//select[@id='id_state']") WebElement State_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='postcode']") WebElement ZipCode_Field;
	@FindBy(how = How.XPATH, using = "//select[@id='id_country']") WebElement Country_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']") WebElement CellPhone_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='alias']") WebElement AliasAddress_Field;
	@FindBy(how = How.XPATH, using = "//button[@id='submitAccount']") WebElement Register_Button;
	@FindBy(how = How.XPATH, using = "//div[@id=\"center_column\"]/div/p") WebElement ErrorAlertForMandatoryFields;
	
	public void clickMrRadioButton() {
		Mr_RadioButton.click();
	}
	
	public void fillFirstNameField(String FirstName) {
		FirstName_Field.sendKeys(FirstName);
	}
	
	public void fillLastNameField(String LastName) {
		LastName_Field.sendKeys(LastName);
	}
	
	public void fillPasswordField(String Password) {
		Password_Field.sendKeys(Password);
	}
	
	public void selectDaySelection(String day) {
		
		SelectFromDropdownByValue(Day_Selection, RemoveDecimalPoint(day));
	}
	
	public void selectMonthSelection(String month) {
		SelectFromDropdownByValue(Month_Selection, month);
	}
	
	public void selectYearSelection(String year) {
		SelectFromDropdownByValue(Year_Selection, RemoveDecimalPoint(year));
	}
	
	public void clickNewsletterCheckBox() {
		Newsletter_CheckBox.click();
	}
	
	public void click_SpecialOffer_CheckBox() {
		SpecialOffer_CheckBox.click();
	}
	
	public void fillAddressFirstNameField(String aFirstName) {
		Address_FirstName_Field.sendKeys(aFirstName);
	}
	
	public void fillAddressLastNameField(String aLastName) {
		Address_LastName_Field.sendKeys(aLastName);
	}
	
	public void fill_Address_Company_Field(String Company) {
		Address_Company_Field.sendKeys(Company);
	}

	public void fillAddress1Field(String Address) {
		Address1_Field.sendKeys(Address);
	}

	public void fillCityField(String City) {
		City_Field.sendKeys(City);
	}

	public void selectStateField(String State) {
		SelectFromDropdownByVisibleText(State_Field, State);
	}

	public void fillZipCodeField(String ZipCode) {
		ZipCode_Field.sendKeys(RemoveDecimalPoint(ZipCode));
	}

	public void selectCountryField(String Country) {
		SelectFromDropdownByVisibleText(Country_Field, Country);
	}

	public void fill_CellPhone_Field() {
		CellPhone_Field.sendKeys(phoneNumberGenerator());
	}
	
	public void fillAliasAddressField(String alias) {
		AliasAddress_Field.clear();
		AliasAddress_Field.sendKeys(alias);
	}

	public void clickRegisterButton() {
		Register_Button.click();
	}

	public void verifyErrorAlertForMandatoryFields() {
		
		if(ErrorAlertForMandatoryFields.isDisplayed() == true) {
			System.out.println("Success! Error Alert For Mandatory Fields is displayed");
		}else {
			System.out.println("Failure, Error Alert For Mandatory Fields is not displayed");
		}
	}
}
