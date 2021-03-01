package com.khanal.JenkinsProject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JenkinTest {
	String Browser = System.getProperty("Browser");
	@Test
	public void someTest() {
		
		if(Browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
	
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).build().perform();
		//act.clickAndHold(drag).moveToElement(drop).build().perform();
		act.clickAndHold(drag).moveToElement(drop).build().perform();
		//act.dragAndDrop(drag, drop).build().perform();
		assertTrue(true);
		}
		
	}
	@Test
	public void some2Test() {
		assertTrue(true);
		
	}
	@Test
	public void some3Test() {
		assertTrue(true);
		
	}
	@Test
	public void some4Test() {
		assertTrue(true);
		
	}
	@Test
	public void some5Test() {
		assertTrue(true);
		
	}
}
