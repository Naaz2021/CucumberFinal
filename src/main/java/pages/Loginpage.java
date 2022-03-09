package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	WebDriver driver; 
	
	 public Loginpage(WebDriver driver) {
	  this.driver = driver;
	 }
	 
	 @FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[1]")WebElement Set_SkyBlue_Background;
	 

		public void clickset_skybue_background() {
			Set_SkyBlue_Background.click();
		}
	 
	@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/button[2]")WebElement Set_White_Background;
	
	public void clickset_white_background() {
		Set_White_Background.click();
	}
}
