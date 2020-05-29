package pageobjectmodel;

import org.openqa.selenium.By;

public class NewTourRegisterPage {
	
	public static final By firstName = By.name("firstName");
	public static final By lastName = By.name("lastName");
	public static final By phone = By.name("phone");
	public static final By email = By.name("userName");
	public static final By address = By.name("address1");
	public static final By city = By.name("city");
	public static final By state = By.name("state");
	public static final By postalCode = By.name("postalCode");
	public static final By country = By.xpath("//select[@name='country']");
	public static final By userName = By.xpath("//input[@id='email']");
	public static final By password = By.xpath("//input[@name='password']");
	public static final By confirmPassword = By.xpath("//input[@name='confirmPassword']");
	public static final By registerButton = By.xpath("//input[@name='submit']");
	public static final By signInLink = By.xpath("//a[contains(text(),'sign-in')]");
	

}
