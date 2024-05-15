package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PojoClass extends BaseClass {
	
	public PojoClass() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	private WebElement searchBox;


	public WebElement getSearchBox() {
		return searchBox;
	}
	
    @FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement continueButton;
	
	@FindBy(xpath="//span[text()='Signup']")
	private WebElement signUpButton;
	
	@FindBy(xpath="//form//child::label[text()='Name']")
	private WebElement CustoName;
	
	@FindBy(xpath="//form//child::label[contains(text(),'10')]")
	private WebElement CustContact;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement cusEmail;
	
	@FindBy(xpath="//form//child::label[text()='Pincode']")
	private WebElement cusPinCode;
	
	@FindBy(xpath="//form//child::label[text()='Locality']")
	private WebElement DeliveryPlace;
	
	@FindBy(xpath="//form//child::label[contains(text(),'Address')]")
	private WebElement Deliveryaddress;
	
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement placeOrderButton;
	
	@FindBy(xpath="//form//child::label[contains(text(),'Town')]")
	private WebElement Deliverycity;
	
	@FindBy(tagName="select")
	private WebElement State;
	
	@FindBy(xpath="//span[contains(text(),'All day')]")
	private WebElement selectHome;
	
	@FindBy(xpath="//button[text()='Save and Deliver Here']")
	private WebElement saveAddress;
	
	@FindBy(xpath="//div[contains(text(),'Laptop')]")
	private WebElement orderSummary;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement sumContinue;
	
	@FindBy(xpath="//button[text()='Accept & Continue']")
	private WebElement accept;

	@FindBy(xpath="//div[@id='container']//child::a[contains(text(), 'iPhone')]")
	private WebElement productCheck;
	
	@FindBy(xpath="//div[@class='yKfJKb row']")
	private List<WebElement> product;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCart;
	
		
	public WebElement getProductCheck() {
		return productCheck;
	}

	public WebElement getCustoName() {
		return CustoName;
	}

	public WebElement getCusPinCode() {
		return cusPinCode;
	}

	public WebElement getLocality() {
		return DeliveryPlace;
	}

	public WebElement getAddress() {
		return Deliveryaddress;
	}

	public WebElement getDeliverycity() {
		return Deliverycity;
	}

	public WebElement getStateDd() {
		return State;
	}

	public WebElement getSelectHome() {
		return selectHome;
	}

	public WebElement getSaveAddress() {
		return saveAddress;
	}

	public WebElement getOrderSummary() {
		return orderSummary;
	}


	public WebElement getSignUp() {
		return signUpButton;
	}
	
	public List<WebElement> getProduct() {
		return product;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	public WebElement getSumContinue() {
		return sumContinue;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getPlaceOrder() {
		return placeOrderButton;
	}

	public WebElement getCusEmail() {
		return cusEmail;
	}

	public WebElement getContinueBtn() {
		return continueButton;
	}

	

}
