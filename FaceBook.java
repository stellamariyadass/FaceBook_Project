package com.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Music\\eclipse.abi\\GitProject\\ChromeDriver139\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("abinaya@gmail.com");
	
	WebElement pass = driver.findElement(By.id("pass"));
	email.sendKeys("abi@12345");
	
	WebElement login = driver.findElement(By.name("login"));
	email.click();
	}
}
