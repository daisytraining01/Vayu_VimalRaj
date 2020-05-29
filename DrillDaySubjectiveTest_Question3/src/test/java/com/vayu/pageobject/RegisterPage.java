package com.vayu.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;

	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;

	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;

	@FindBy(how = How.NAME, using = "userName")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address;

	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;

	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;

	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;

	@FindBy(how = How.XPATH, using = "//select[@name='country']")
	public static WebElement country;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public static WebElement userName;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@name='confirmPassword']")
	public static WebElement confirmPassword;

	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	public static WebElement registerButton;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'sign-in')]")
	public static WebElement signInLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'SIGN-OFF')]")
	public static WebElement signOff;

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}
}
