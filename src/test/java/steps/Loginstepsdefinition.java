package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;
import pages.Testbase;

public class Loginstepsdefinition extends Testbase{
    Loginpage loginpage;
	// Given When user is on the techfios page
	
	 @Given( "^When user is on the techfios page$")
	public void  user_is_on_the_techfios_page() {
		 init();
	 }
	 @When ("^user checks set SkyBlue Background button exists$")
	public void user_checks_set_skyblue_background_button_exists() {
		 
}
	 @And  ( "^user clicks on the set skyblue background button$")
	 public void user_clicks_on_the_set_skyblue_background_button() {
		 loginpage=PageFactory.initElements(driver,Loginpage.class);
		 loginpage.clickset_skybue_background();
	 }
	 @Then ("^the background color will change to skyblue$")
	 public void the_background_color_will_change_to_skyblue() {
		 
	 }
	 
	
	 
}




