package step.def.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CommonUtils;

public class Dropdown {
	
	private WebDriver driver;
	String browser = "Firefox";
	String userDir = System.getProperty("user.dir");
	String urls = "https://jqueryui.com/";
	
	@Before("@Dropdown")
	public void setup()
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", userDir+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", userDir+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	@Given("^Iam in facebook home page$")
	public void iam_in_facebook_home_page() throws Throwable 
	{
	    driver.manage().window().maximize();	
	    driver.navigate().to(urls);
	    CommonUtils.thread(driver, 2000);
	}

	@When("^I have given \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_have_given_and(String arg1, String arg2) throws Throwable 
	{
		// CSS Selector using nth child
	    for (int i=1; i<=4; i++)
	    {
	    	driver.findElement(By.cssSelector("#sidebar > aside:nth-child(1) > ul > li:nth-child( " +i+ ") > a")).click();
	    	 CommonUtils.thread(driver, 2000);
	    	 driver.navigate().back();
	    	 driver.navigate().refresh();
	    }
	}

	@Then("^I will login into my facebook account$")
	public void i_will_login_into_my_facebook_account() throws Throwable 
	{
		// XPath Selector using nth child
		for (int i=1; i<=4; i++)
	    {
	    	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li["+i+"]/a")).click();
	    	 CommonUtils.thread(driver, 2000);
	    	 driver.navigate().back();
	    	 driver.navigate().refresh();
	    }
	}
	
	@After("@Dropdown")
	public void teardown()
	{
		driver.close();
	}

}
