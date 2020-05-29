package com.mavericsystems;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkMaveric {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String homePage = "https://maveric-systems.com/";
		String url = "";
		HttpsURLConnection httpsConnObj = null;
		int responseCode = 200;

		WebDriverManager.chromedriver().driverVersion("83.0.4103.61").setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if (!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {
				httpsConnObj = (HttpsURLConnection) (new URL(url).openConnection());

				httpsConnObj.setRequestMethod("HEAD");

				httpsConnObj.connect();

				responseCode = httpsConnObj.getResponseCode();

				if (responseCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();

	}
}
