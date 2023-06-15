package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPage {
	
	WebDriver driver;
	
	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//div[@id='centercolumn']/p[2]/a[1]")WebElement proceedToCheckoutButton;
	@FindBy(how = How.XPATH, using = "//div[@id='centercolumn']/form/p/button")WebElement proceedToCheckoutButtonAddressPage;
	@FindBy(how = How.XPATH, using = "//form[@id='form']/p/button")WebElement proceedToCheckoutButtonShippingPage;
	@FindBy(how = How.XPATH, using = "//input[@id='cgv']")WebElement checkBoxAgreeToTermsShippingPage;
	@FindBy(how = How.XPATH, using = "//a[@class='bankwire']")WebElement payByBankWirePaymentPage;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'I confirm my order')]")WebElement iConfirmMyOrderPaymentPage;
	@FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")WebElement myAccountButton;
	@FindBy(how = How.XPATH, using = "//p[@class='cheque-indent']/strong[@class='dark']")WebElement orderConfirmation;
	//@FindBy(how = How.XPATH, using = "//div[@class='box']/[6]")WebElement OrderReferenceText;
	
	//InteractiveMethods
	public void clickProceedToCheckout() {
		proceedToCheckoutButton.click();
	}

	public void clickProceedToCheckoutAddressPage() {
		proceedToCheckoutButtonAddressPage.click();
	}

	public void clickProceedToCheckoutShippingPage() {
		proceedToCheckoutButtonShippingPage.click();
	}

	public void clickCheckBoxAgreeToTermsShippingPage() {
		checkBoxAgreeToTermsShippingPage.click();
	}

	public void clickPayByBankWirePaymentPage() {
		payByBankWirePaymentPage.click();
	}

	public void clickIConfirmMyOrderPage() {
		iConfirmMyOrderPaymentPage.click();
	}
	
	public void clickMyAccountButton() {
		myAccountButton.click();
	}
	
	public void assertOrderConfirmation() {
		
		if(orderConfirmation.getText().contains("complete")) {
			System.out.println("Order Verified");
		}else {
			System.out.println("Order not completed");
		}
		
	}
	
	/*
	 * public String GetOrderReferenceText() { String SubStr =
	 * OrderReferenceText.getText(); String OrderRefnum = SubStr.substring(45,
	 * 53); return OrderRefnum; }
	 */
	

}
