package stepdefinition;


import static org.junit.Assert.*;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilites.BaseClass;

public class EbayHome_Steps extends BaseClass {

	@Given("I am on Ebay home page")
	public void i_am_on_ebay_home_page() {

		Driverintiate();
		driver.get("https://www.ebay.com/");

	}

	@When("I click on Advance search Link")
	public void i_click_on_advance_search_link() {
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/sch/ebayadvsearch']")).click();
	}

	@Then("I navigate to Advance search Page")
	public void i_navigate_to_advance_search_page() {
		String ExpectedpageTitle = "eBay Search: Advanced Search";
		String actualTitle = driver.getTitle();
		if (!ExpectedpageTitle.equals(actualTitle)) {
			fail("Page titles does not match");

		}
		driver.close();
	}
	@When("I am searching item in search box")
	public void i_am_searching_item_in_search_box() {
	    
		driver.findElement(By.id("gh-ac")).sendKeys("iphone 11");
		driver.findElement(By.id("gh-btn")).click();
	}

	@Then("Item is isplayed with results")
	public void item_is_isplayed_with_results() {
	  
		String result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']//span")).getText();
		int resultv = Integer.parseInt(result);
		if(!(resultv>=50)) 
		{
			fail("result less than 50");	
		}
		driver.quit();
	}

	

}
