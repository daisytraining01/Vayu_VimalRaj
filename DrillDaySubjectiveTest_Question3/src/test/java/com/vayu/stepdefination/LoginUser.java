package com.vayu.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.vayu.action.ActionClass;
import com.vayu.pageobject.LoginPage;
import com.vayu.pageobject.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUser {
	
	public LoginUser(ActionClass actionObj){
		this.actionObj = actionObj;
		this.driver=actionObj.getDriver();
	}
	 WebDriver driver;
	ActionClass actionObj;
	static LoginPage pageFactory;

	@Given("^User opens the browser$")
	public void user_opens_the_browser() {
		System.out.println("Background!!");
			WebDriverManager.chromedriver().driverVersion("83.0.4103.61").setup();
			driver = new ChromeDriver();
			actionObj.setDriver(driver);
			driver.manage().window().maximize();
			actionObj.implicitWait(2);
		
	}
	@Given("^navigates to the LoginPage$")
	public void navigates_to_the_LoginPage()  {
		driver.get("http://demo.guru99.com/test/newtours/login.php");
	}
	@Given("^User opens the browser and navigates to the LoginPage$")
	public void user_opens_the_browser_and_navigates_to_the_LoginPage() {
		WebDriverManager.chromedriver().driverVersion("83.0.4103.61").setup();
		driver = new ChromeDriver();
		actionObj.setDriver(driver);
		driver.manage().window().maximize();
		actionObj.implicitWait(30);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password) {
		pageFactory = new LoginPage(driver);
		System.out.println(userName + ""+password);
		
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		actionObj.TextInput(pageFactory.username, userName);
		actionObj.TextInput(pageFactory.passWord, password);
		actionObj.Click(pageFactory.submitButton);
	}

	@Then("^User Login Successfully$")
	public void user_Login_Successfully() throws InterruptedException {
		String str = actionObj.GetText(pageFactory.succesfullMessage);
		Assert.assertEquals(str, "Login Successfully", "Login Failed!");
		Thread.sleep(10000);
		
	}
}
