package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	
	public static void click(final WebDriver driver, By locator)
	{
		driver.findElement(locator).click();
	}
	
	public static void explicitText(final WebDriver driver, By locator, int i, String texts)
	{
		WebDriverWait text = new WebDriverWait(driver, i);
		text.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(texts);
	}
	
	public static void implicit(final WebDriver driver, int i)
	{
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}
	
	public static void explicitdrop (final WebDriver driver, String tt, By locator)
	{
		Select selects = new Select(driver.findElement(locator));
		selects.selectByVisibleText(tt);
	}
	
	public static void thread(final WebDriver driver, int i) throws InterruptedException
	{
		Thread.sleep(i);
	}
}
