package com.wordpress;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vayu.action.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WordPress extends Homepage {
	static WebDriver driver;
	static Action actionObj;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().driverVersion("83.0.4103.61").setup();
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--headless"); ChromeDriver driver = new
		 * ChromeDriver(options);
		 */
		driver = new ChromeDriver();
		driver.get("https://wordpress.com/?aff=58022&cid=8348279");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		actionObj = new Action(driver);
	}

	@Test
	public void testExecution() throws InterruptedException, IOException {

		//Logger logger = Logger.getLogger(WordPress.class.getName());
		ExcelWrite excelObj = new ExcelWrite(); 
		actionObj.hover(Products);
		actionObj.Click(Blogs);
		System.out.println("\n***********Image Link in Blogs***********");
		List<String> imgLinks = new ArrayList<String>();
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);

		System.out.println("\n***********Links in Blogs***********");
		List<String> links = new ArrayList<String>();
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		List<String> fileLink = new ArrayList<String>();
		fileLink = actionObj.getText(driver, LinkTag);
		
		imgLinks.clear();
		links.clear();
		driver.navigate().back();

		actionObj.hover(Products);
		actionObj.Click(Websites);
		System.out.println("\n***********Image Link in Websites***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);
		

		System.out.println("\n***********Links in Websites***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);

		imgLinks.clear();
		links.clear();
		driver.navigate().back();

		actionObj.hover(Products);
		actionObj.Click(Domains);
		System.out.println("\n***********Image Link in Domains***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);

		System.out.println("\n***********Links in Domains***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);

		imgLinks.clear();
		links.clear();
		driver.navigate().back();
		
		
		actionObj.hover(Products);
		actionObj.Click(eCommerce);
		System.out.println("\n***********Image Links in eCommerce***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);

		System.out.println("\n***********Links in eCommerce***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);

		imgLinks.clear();
		links.clear();
		driver.navigate().back();

		actionObj.hover(Products);
		actionObj.Click(SelfSolution);
		System.out.println("\n***********Image in SelfSolution***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);

		System.out.println("\n***********Links in SelfSolution***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);
		
		imgLinks.clear();
		links.clear();
		driver.get("https://wordpress.com/?aff=58022&cid=8348279");
		
		// *********************************************************************
		// End of Products
		// *********************************************************************

		actionObj.hover(Features);
		actionObj.Click(Overview);
		System.out.println("\n***********Image in Overview***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);
		


		System.out.println("\n***********Links in Overview***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);

		imgLinks.clear();
		links.clear();
		driver.navigate().back();

		actionObj.hover(Features);
		actionObj.Click(Themes);
		System.out.println("\n***********Image in Themes***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);


		System.out.println("\n***********Links in Themes***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);

		imgLinks.clear();
		links.clear();
		driver.navigate().back();

		actionObj.hover(Features);
		actionObj.Click(Plugins);
		System.out.println("\n***********Image in Plugins***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);
		
		

		System.out.println("\n***********Links in Plugins***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);

		imgLinks.clear();
		links.clear();
		driver.navigate().back();

		actionObj.hover(Features);
		actionObj.Click(GoogleApps);
		System.out.println("\n***********Image in GoogleApps***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);

		System.out.println("\n***********Links in GoogleApps***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);
		
		imgLinks.clear();
		links.clear();
		driver.navigate().back();
		driver.get("https://wordpress.com/?aff=58022&cid=8348279");

		// *********************************************************************
		// End of Features
		// *********************************************************************

		

		actionObj.hover(Resources);
		actionObj.Click(Support);
		System.out.println("\n***********Image in Support***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);
		
		System.out.println("\n***********Links in Support***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);

		imgLinks.clear();
		links.clear();
		driver.navigate().back();

		actionObj.hover(Resources);
		actionObj.Click(News);
		System.out.println("\n***********Image in News***********");
		imgLinks = actionObj.getValue(driver, ImageTag, "src");
		System.out.println(imgLinks);

		System.out.println("\n***********Links in News***********");
		links = actionObj.getValue(driver, LinkTag, "href");
		System.out.println(links);
		fileLink = actionObj.getText(driver, LinkTag);
		
		//call excel with arraylist fileLink
		excelObj.writeFile(fileLink);

		driver.quit();
	}

}
