package com.vayu.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(how = How.XPATH, using = "//input[@name='userName']")
	public static WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public static WebElement passWord;

	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	public static WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Login Successfully')]")
	public static WebElement succesfullMessage;

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

}
