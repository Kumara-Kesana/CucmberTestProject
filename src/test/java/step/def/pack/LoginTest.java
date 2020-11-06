package step.def.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.ApplicationConstants;
import utils.BrowserFactory;
import utils.CommonUtils;

public class LoginTest {
	
	public static WebDriver driver;
	int j = 5000;
	
	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
	    driver = BrowserFactory.getDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to(ApplicationConstants.url);
	    CommonUtils.implicit(driver, 10);
	}

	@When("^I provide the username and password$")
	public void i_provide_the_username_and_password() throws Throwable {
		
		String[] droptext = {"Embark Group", "Embark Pensions", "Rowanmoor", "Embark Platform", "Vested", "Embark's brands"};
		for (String i : droptext)
		{
		Select sel = new Select(driver.findElement(By.id("site-select")));
		sel.selectByVisibleText(i);
		driver.navigate().back();
		Thread.sleep(j);
		}
	    
	}

	@Then("^I will go to next page$")
	public void i_will_go_to_next_page() throws Throwable {
	    driver.close();
	}

}
