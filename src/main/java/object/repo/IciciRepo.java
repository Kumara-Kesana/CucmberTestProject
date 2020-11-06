package object.repo;

import org.openqa.selenium.By;

public class IciciRepo {

	public static By popup = By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/div/p[2]/a");
	public static By LoginButton = By.linkText("LOGIN");
	public static By dummy = By.id("DUMMY1");
	public static By username = By.id("AuthenticationFG.USER_PRINCIPAL");
	public static By password = By.id("AuthenticationFG.ACCESS_CODE");
    public static By loginintoAccount = By.id("VALIDATE_CREDENTIALS1");
}
