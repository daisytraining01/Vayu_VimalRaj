package com.vayu.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	static WebDriver driver;
	static List<WebElement> imagelinks;
	static List<WebElement> links;

	public Action(WebDriver driver) {
		Action.driver = driver;
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

	public void hover(By locator) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(locator)).build().perform();
	}
	
	public List getText(WebDriver driver, By locator){
		String url;
		List<String> links = new ArrayList<String>();
		for (WebElement ele : driver.findElements(locator)) {
			try {
				url = ele.getText();
				links.add(url);
			} catch (Exception e) {
			}
		}
		return links;
	}



	public List getValue(WebDriver driver, By locator, String Attribute) {
		String url;
		List<String> links = new ArrayList<String>();
		for (WebElement ele : driver.findElements(locator)) {
			try {
				url = ele.getAttribute(Attribute);
				links.add(url);
			} catch (Exception e) {
			}
		}
		return links;
	}

	public void expliciteWait(String str) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(str)));
	}
}
