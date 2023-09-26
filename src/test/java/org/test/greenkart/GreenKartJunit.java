package org.test.greenkart;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.SortingFocusTraversalPolicy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GreenKartJunit {
public static WebDriver driver;
	@BeforeClass
	public static void BeforeClass() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@AfterClass
	public static void AfterClass() {
		
		driver.close();
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("Starting......"+d);
		
	}
	@After
	public void after() {

		Date d=new Date();
		System.out.println("ending........"+d);
	}
	
	@Test
	public void Test1() {

		WebElement ser = driver.findElement(By.xpath("//input[@type='search']"));
		ser.sendKeys("Onion");
		WebElement add = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		add.click();
		WebElement card = driver.findElement(By.xpath("//img[@alt='Cart']"));
		card.click();
		WebElement proceed = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		proceed.click();
		WebElement place = driver.findElement(By.xpath("//button[text()='Place Order']"));
		place.click();
		WebElement country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select s=new Select(country);
		s.selectByIndex(5);
		WebElement confirm = driver.findElement(By.xpath("//input[@type='checkbox']"));
		confirm.click();
		WebElement last = driver.findElement(By.xpath("//button[text()='Proceed']"));
		last.click();

		

	}
	
	@Test
	public void Test2() {
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebElement ser = driver.findElement(By.xpath("//input[@type='search']"));
		ser.sendKeys("Onion");
		String val = ser.getAttribute("value");
		Assert.assertEquals("cucumber", val);
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("rahul");
		Assert.assertTrue("verifyUrl", contains);	
	}
	@Test
	public void test3() {

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("rahul");
		Assert.assertTrue("verifyUrl", contains);	
		
		
		
	}
		
}
