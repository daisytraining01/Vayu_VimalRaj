package com.vayu.action;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	 WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}



	public void LauchBrowser(){
		WebDriverManager.chromedriver().driverVersion("83.0.4103.61").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		implicitWait(2);
	}

	public void Click(WebElement webElement) {
		webElement.click();
	}

	public void TextInput(WebElement webElement, String str) {
		webElement.sendKeys(str);
	}

	public String GetText(WebElement webElement) {
		return webElement.getText();
	}

	public void DropDown(WebElement webElement) {
		WebElement dropdown = webElement;
		Select list = new Select(dropdown);
		List<WebElement> dropdown_list = list.getOptions();
		for (int i = 0; i < dropdown_list.size(); i++) {
			String dropdown_value = dropdown_list.get(i).getText();
			System.out.println("List of countries in drop down are:");
			System.out.println(dropdown_value);
		}

	}

	public void selectDropdowValue(WebElement webElement, String str) {
		Select dropDown = new Select(webElement);
		dropDown.selectByVisibleText(str);
	}

	public void takeScreenShot() throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_hh_mm_ss");
		// Move image file to new destination
		File DestFile = new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/"
				+ dateFormat.format(new Date()) + ".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void terminate() {
		driver.quit();
	}

	public void implicitWait(int timeSec) {
		driver.manage().timeouts().implicitlyWait(timeSec, TimeUnit.SECONDS);
	}

	public void explicitWait(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

}
