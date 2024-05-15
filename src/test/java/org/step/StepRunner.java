package org.step;

import java.awt.AWTException;
import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepRunner extends BaseClass{
	PojoClass p;
	
	@Given("To lanuch flipkart in chrome browser and search product")
	public void to_lanuch_flipkart_in_chrome_browser_and_search_product() throws IOException, AWTException {
		browserLaunching("Chrome");
		urlLaunch(getTestDataFromPropertyFile("url"));
		waitForWebElement();
		p = new PojoClass();
		passValue(p.getSearchBox(), getTestDataFromPropertyFile("product"));
		enterKey();
	}

	
	@When("To select product and add into the cart")
	public void to_select_product_and_add_into_the_cart() {
		p = new PojoClass();
		driver.navigate().refresh();
		clickElement(p.getProduct().get(0));
		switchToWindow(1);
		clickElement(p.getAddToCart());	  
	}

	@When("To place order and login into flipkart application")
	public void to_place_order_and_login_into_flipkart_application() throws AWTException, IOException {
		p = new PojoClass();
		Assert.assertTrue("Wrong Product", p.getProductCheck().getText().contains("product"));
		clickElement(p.getPlaceOrder());
		passValue(p.getCusEmail(), getTestDataFromPropertyFile("email"));
		clickElement(p.getContinueBtn());		
	}

	@When("To select the deliver address and doing payment")
	public void to_select_the_deliver_address_and_doing_payment() throws IOException {
	 
		passValue(p.getCustoName(), getTestDataFromPropertyFile("name"));
		passValue(p.getCusEmail(), getTestDataFromPropertyFile("email"));
		passValue(p.getCusPinCode(), getTestDataFromPropertyFile("pincode"));
		passValue(p.getLocality(), getTestDataFromPropertyFile("locality"));
		passValue(p.getAddress(), getTestDataFromPropertyFile("address"));
		passValue(p.getDeliverycity(), getTestDataFromPropertyFile("city"));
		selectStateOption(p.getStateDd(), getTestDataFromPropertyFile("state"));
		clickElement(p.getSelectHome());
		clickElement(p.getSaveAddress());
	}
	
	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() throws InterruptedException {

		closeTheBrowser();
	}

	

}
