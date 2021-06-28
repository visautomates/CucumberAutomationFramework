package stepdefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilites.BaseClass;
import static org.junit.Assert.*;

import org.openqa.selenium.By;



public class EbayAdvanceSearch_Steps extends BaseClass {

	@Given("I am on advance search page")
	public void i_am_on_advance_search_page() {
		
		EbayHome_Steps obj = new EbayHome_Steps();
		obj.i_am_on_ebay_home_page();
		obj.i_click_on_advance_search_link();
		
	}

	@When("I click on ebay logo")
	public void i_click_on_ebay_logo() {
	    
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/']")).click();
		
	}

	@Then("I am navigated to ebay login page")
	public void i_am_navigated_to_ebay_login_page() {
		String pageurl = driver.getCurrentUrl();
		String expectedurl = "https://www.ebay.com/";
		if(!pageurl.equals(expectedurl)) {
			fail("page url not matched");
		}
		driver.close();
	}

}
