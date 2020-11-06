package step.def.pack;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object.repo.IciciRepo;
import utils.ApplicationConstants;
import utils.BrowserFactory;
import utils.CommonUtils;

public class IciciTest {
	public static WebDriver driver;
		
	@Given("^I am on the Icici homepage$")
	public void i_am_on_the_Icici_homepage() throws Throwable {
	    driver = BrowserFactory.getDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to(ApplicationConstants.urli);
	    CommonUtils.thread(driver, 2000);
	}

	@When("^I will click on login button$")
	public void i_will_click_on_login_button() throws Throwable {
	   CommonUtils.click(driver, IciciRepo.popup);
	   CommonUtils.implicit(driver, 5);
	}

	@Then("^I can see login details to enter$")
	public void i_can_see_login_details_to_enter() throws Throwable {
	    CommonUtils.click(driver, IciciRepo.LoginButton);
		CommonUtils.implicit(driver, 5);
		CommonUtils.click(driver, IciciRepo.dummy);
		CommonUtils.implicit(driver, 4);
	}

}
