package com.uitest.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GoolgeSearchTest {
	static WebDriver d ;

	public GoolgeSearchTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@BeforeTest
	@Parameters({ "BROWSER" })
	public void setUp(String BROWSER) throws InterruptedException {
		System.out.println("Run test with Browser: " + BROWSER);
		 
		if (BROWSER.equals("CH")) {
			System.out.println("Creating Chrome driver ...");
			System.setProperty("webdriver.chrome.driver", "C:/CopyWorkLaptop/Automation/webdrivers/chromedriver.exe");// only																									// driver
			d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// d.get("https://www.google.com/");
		 }
		 else if (BROWSER.equals("FFox")) {
				System.out.println("Creating FFox driver ...");
				System.setProperty("webdriver.gecko.driver", "C:/CopyWorkLaptop/Automation/webdrivers/geckodriver.exe");
			    d= new FirefoxDriver();
			 
		 }else  {
			 System.out.println("TO DO: create driver for given  brower"); 
		 }
		
	}
	
	
	@AfterClass
	public void teardownCloseDriver() {
		if(d != null) {
			d.close();
			d = null;
		}
	}
	
	
	@Test
	public void searchEnterInputAndEnterKeyTest1() throws InterruptedException {
		d.get("https://www.google.com/");
		WebElement e = d.findElement(By.xpath("//input[@name='q']"));
		e.sendKeys("selenium");
		e.sendKeys(Keys.RETURN);
		//d.findElement(By.xpath("//body"));
		//WebElement btn = d.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		//btn.click();
		Thread.sleep(2000);
	}
	
	

	@Test
	public void searchEnterInputAndClickSearchButtonTest2() throws InterruptedException {
		d.get("https://www.google.com/");
		WebElement e = d.findElement(By.xpath("//input[@name='q']"));
		e.sendKeys("selenium");
		e.sendKeys(Keys.RETURN);
		//d.findElement(By.xpath("//body"));
		//WebElement btn = d.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		//btn.click();
		
		Thread.sleep(2000);
		
	}
	
	
	

}
