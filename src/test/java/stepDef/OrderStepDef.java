package stepDef;

import baseclass.Testbase;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDef extends Testbase {

	@Given("User is in home page")
	public void user_is_in_home_page() {
	    initialize();
	}
	@When("user search an item {string}")
	public void user_search_an_item(String strItem) {
	  //  homePage = new Homepage();
	  //  homePage.searchItem("strItem");
	}
	@Then("item should display")
	public void item_should_display() {
	 //   itemPage=new itemPage();
	 //   Assert.asserTrue(itemPage.isitemListed());
	}
	
	@Given("Item must display")
	public void item_must_display() {
	   
	}
	@When("we add item")
	public void we_add_item() {
	//	itemPage.viewItemDetail();
	//	itemPage.addItem();
	    
	}
	@Then("Item should be added to cart")
	public void item_should_be_added_to_cart() {
	   
	}
}
