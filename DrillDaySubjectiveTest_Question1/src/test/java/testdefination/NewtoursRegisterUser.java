package testdefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import action.ActionClass;
import helperclass.ExcelReadNewUserRegister;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmodel.NewTourRegisterPage;

public class NewtoursRegisterUser extends NewTourRegisterPage{
	static WebDriver driver;
	static ExcelReadNewUserRegister excelObj;
	static ActionClass actionObj;
	
	@BeforeMethod
	public void setupTest() {
	WebDriverManager.chromedriver().driverVersion("83.0.4103.61").setup();
	driver = new ChromeDriver();
	excelObj = new ExcelReadNewUserRegister();
	actionObj =new ActionClass(driver);
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
    //Implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testExecution() throws Exception{
		
		excelObj.readExcel(driver, "NewTours.xlsx", "Register",1);
		
		//Print all the values in the Country drop down to the console 
		actionObj.DropDown(country);
		
		actionObj.selectDropdowValue(country, "INDIA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actionObj.Click(registerButton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String str = actionObj.GetText(signInLink);
		ActionClass.takeScreenShot();
		Assert.assertEquals(str, "sign-in", "Registeration Failed!");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}
