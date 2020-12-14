package com.TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTest {
	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void gmailTest() throws InterruptedException {
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		System.out.println("Google open successfully");
		driver.findElement(By.partialLinkText("Sign in")).click();
		System.out.println("Successfully clicked on Sign in link");
		Thread.sleep(3000);
	}
	
	@Test
	public void gmailTest1() throws InterruptedException {
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		System.out.println("Google open successfully");
		driver.findElement(By.partialLinkText("Sign in")).click();
		System.out.println("Successfully clicked on Sign in link");
		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Driver closed");
	}

}
