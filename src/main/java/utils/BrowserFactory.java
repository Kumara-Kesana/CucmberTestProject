package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver driver = null;
	public static Browsers browser;
	static String userDir = System.getProperty("user.dir");
	
	public enum Browsers
	{
		CHROME, FIREFOX
	}
	
	public static WebDriver getDriver()
	{
		switch (browser)
		{
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}
	
	private static void loadProperties() throws FileNotFoundException, IOException
	{
		Properties p;
		try (FileInputStream propFile = new FileInputStream(ApplicationConstants.Application_Properties_File))
		{
			p = new Properties(System.getProperties());
			p.load(propFile);
			System.setProperties(p);
			System.setProperty(ApplicationConstants.Chrome_Driver, userDir+"//drivers//chromedriver.exe");
			System.setProperty(ApplicationConstants.Firefox_Driver, userDir+"//drivers//geckodriver.exe");
		}
	}
	
	static 
	{
		try {
			loadProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if((ApplicationConstants.Empty_String).equals(System.getProperty(ApplicationConstants.Property_Browser_Key)) || System.getProperty(ApplicationConstants.Property_Browser_Key) == null)
		{
			browser = Browsers.FIREFOX;
		}
		else
		{
			browser = Browsers.valueOf(System.getProperty(ApplicationConstants.Property_Browser_Key));
		}
	}
}
