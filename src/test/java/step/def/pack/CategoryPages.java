package step.def.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object.repo.CategoryRepo;
import utils.ApplicationConstants;
import utils.BrowserFactory;
import utils.CommonUtils;

public class CategoryPages {
	public static WebDriver driver;
	
	@Before("@Category")
	public void setup()
	{
		driver = BrowserFactory.getDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to(ApplicationConstants.urlr);
	}

@Given("^I will click on Roman Logo$")
public void i_will_click_on_Roman_Logo() throws Throwable {
		CommonUtils.click(driver, CategoryRepo.logo);
        }
@When("^I will click on each menu on headerbar$")
public void i_will_click_on_each_menu_on_headerbar() throws Throwable {
 for(int i=1;i<=7;i++) {
	 driver.findElement(By.xpath("//*[@id=\"menu2\"]/ul/li["+i+"]/a")).click();
	 CommonUtils.thread(driver, 2000);
 }
}

@Then("^I will go to each category pages$")
public void i_will_go_to_each_category_pages() throws Throwable {
    
}


@After("@Category")
public void tardown()
{
	driver.close();
}

}
