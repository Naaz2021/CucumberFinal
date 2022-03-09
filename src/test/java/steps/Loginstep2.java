package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;
import pages.Testbase;

public class Loginstep2 extends Testbase{
	Loginpage loginpage;
	
	@Given( "^when user is on techfios page$")
	public void user_is_on_the_techfios_page() {
		init();
	}
	@When ("^user checks set white background button exists$")
	public void user_checks_set_white_background_button_exists() {
		
	}
	@And( "^user clicks on the set white background button$")
	public void user_clicks_set_white_background_button_exists() {
     loginpage=PageFactory.initElements(driver,Loginpage.class);
     loginpage.clickset_white_background();
	}
	@Then ("^the background color will change to white$")
	public void background_color_will_change_to_white() {
		
	}
	/*@After
	 public void teardown() {
	    	driver.close();
	    	driver.quit();
	    }*/
}
