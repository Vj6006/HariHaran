package org.test.SampleProjectTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgSamples {
	
@Test
	
private void tc1(String email, String pass) {


	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	
	WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys(email);
	
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtusername.sendKeys(pass);
	
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	
	
	
}
	

}
