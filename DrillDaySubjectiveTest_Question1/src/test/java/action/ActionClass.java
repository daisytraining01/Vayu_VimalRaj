package action;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {
	static WebDriver driver;

	public ActionClass(WebDriver driver) {
		this.driver = driver;
	}

	public void Click(By locator) {
		driver.findElement(locator).click();
	}

	public void TextInput(By locator, String str) {
		driver.findElement(locator).sendKeys(str);
	}

	public String GetText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void DropDown(By locator) {
		WebElement dropdown = driver.findElement(locator);
		Select list = new Select(dropdown);
		List<WebElement> dropdown_list = list.getOptions();
		for (int i = 0; i < dropdown_list.size(); i++) {
			String dropdown_value = dropdown_list.get(i).getText();
			System.out.println("List of countries in drop down are:");
			System.out.println(dropdown_value);
		}

	}

	public void selectDropdowValue(By locator, String str) {
		Select dropDown = new Select(driver.findElement(locator));
		dropDown.selectByVisibleText(str);
	}

	public static void takeScreenShot() throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_hh_mm_ss");
		// Move image file to new destination
		File DestFile = new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/"+dateFormat.format(new Date()) + ".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}