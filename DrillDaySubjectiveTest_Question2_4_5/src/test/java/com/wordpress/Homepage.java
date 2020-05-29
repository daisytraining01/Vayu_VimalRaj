package com.wordpress;

import org.openqa.selenium.By;

public class Homepage {

	public static final By Products = By.xpath("//button[contains(text(),'Products')]");
	public static final By Blogs = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Blogs')]");
	public static final By Websites = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Websites')]");
	public static final By Domains = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Domains')]");
	public static final By eCommerce = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'eCommerce')]");
	public static final By SelfSolution = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Hosted Solutions')]");
	public static final By Enterprise = By.xpath("//a[@class='x-dropdown-link x-link x-external-link']");

	public static final By Features = By.xpath("//button[contains(text(),'Features')]");
	public static final By Overview = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Overview')]");
	public static final By Themes = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Themes')]");
	public static final By Plugins = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Plugins')]");
	public static final By GoogleApps = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Google Apps')]");
	
	public static final By Resources = By.xpath("//button[contains(text(),'Resources')]");
	public static final By Support = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Support')]");
	public static final By News = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'News')]");
	public static final By ExpertTips = By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Expert Tips')]");
	
	public static final By LinkTag = By.tagName("a");
	public static final By ImageTag = By.tagName("img");
	
}
