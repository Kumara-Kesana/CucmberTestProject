package step.def.pack;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object.repo.IciciRepo;
import utils.ApplicationConstants;
import utils.BrowserFactory;
import utils.CommonUtils;

public class Facebook {

	public static WebDriver driver;
    
	
	@Given("^Iam on facebook homepage$")
	public void iam_on_facebook_homepage() throws Throwable {
	   driver = BrowserFactory.getDriver();
	   driver.manage().window().maximize();
	   CommonUtils.implicit(driver, 2000);
	   driver.navigate().to(ApplicationConstants.urli);
	   CommonUtils.thread(driver, 2000);
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String user, String pass) throws Throwable {
	   
		CommonUtils.click(driver, IciciRepo.popup);
		CommonUtils.click(driver, IciciRepo.LoginButton);
		CommonUtils.click(driver, IciciRepo.dummy);
		CommonUtils.explicitText(driver, IciciRepo.username, 5, user);
		CommonUtils.explicitText(driver, IciciRepo.password, 5, pass);
	}

	@Then("^I will click on login into account$")
	public void i_will_click_on_login_into_account() throws Throwable {
	   CommonUtils.click(driver, IciciRepo.loginintoAccount); 
	}
}
