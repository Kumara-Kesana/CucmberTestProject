package step.def.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object.repo.HomepageLocators;
import utils.ApplicationConstants;
import utils.BrowserFactory;
import utils.CommonUtils;

public class Login {
	
	public static WebDriver driver;
	int j = 2000;
	
	@Before("@RegressionPack")
	public void setup()
	{
		 driver = BrowserFactory.getDriver();
		 driver.manage().window().maximize();
	}
	
	@Given("^I am on Home page$")
	public void i_am_on_Home_page() throws Throwable {
	    driver.navigate().to(ApplicationConstants.url);
	    CommonUtils.implicit(driver, 10);
	}

	@When("^I search \"([^\"]*)\"$")
	public void i_search(String drop) throws Throwable {

//		for (int i=1; i<=6; i++)
//		{
//			driver.findElement(By.xpath("//*[@id=\\\"menu-cat-menu-top-2\\\"]/li["+i+"]/a")).click();
//			Thread.sleep(j);
//		}
		
	//	CommonUtils.explicitdrop(driver, drop, HomepageLocators.siteselect);
		
		
	}

	@Then("^I will get that related product displayed$")
	public void i_will_get_that_related_product_displayed() throws Throwable {
		String[] droptext = {"Embark Group", "Embark Pensions", "Rowanmoor", "Embark Platform", "Vested", "Embark's brands"};
		for (String i : droptext)
		{
		Select sel = new Select(driver.findElement(By.id("site-select")));
		sel.selectByVisibleText(i);
		driver.navigate().back();
		Thread.sleep(j);
		}
	}
	
	@After("@RegressionPack")
	public void teardown() throws Throwable
	{
		 Thread.sleep(2000);
		    driver.close();
	}
	

}
