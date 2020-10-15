package com.lambdatest.Tests;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SingleTest {

	public static WebDriver driver;
	public static String status = "failed";

	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {

		String username = System.getenv("LT_USERNAME");
		String accesskey = System.getenv("LT_ACCESS_KEY");

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platform", "windows 10");
		caps.setCapability("browserName", "chrome");
		caps.setCapability("version", "84.0");
		caps.setCapability("screen_resolution", "1024x768");
		caps.setCapability("build", "GeeksForGeeks Sample");
		caps.setCapability("name", "GeeksForGeeks Sample");
		caps.setCapability("network", true);
		caps.setCapability("visual", true);
		caps.setCapability("video", true);
		caps.setCapability("console", true);

		String gridURL = "http://" + username + ":" + accesskey + "@hub.lambdatest.com/wd/hub";
		try {
			driver = new RemoteWebDriver(new URL(gridURL), caps);
		} catch (Exception e) {
			System.out.println("driver error");
			System.out.println(e.getMessage());
		}
	}

	@Test
	public static void test() throws InterruptedException {

		// Launch the app
		System.out.println("Loading Url");
		Thread.sleep(100);
		driver.get("https://lambdatest.com");
		Thread.sleep(100);

		status = "passed";
		Thread.sleep(150);

		System.out.println("TestFinished");

	}

	@AfterTest
	public static void afterTest() {
		((JavascriptExecutor) driver).executeScript("lambda-status=" + status + "");
		driver.quit();
	}

}