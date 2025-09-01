package com.flipkart;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redmi2 {
	
	
//	static WebDriver driver;
//	@When("Sort by {string}")
//	public void sort_by(String string) {
//		WebElement element = driver.findElement(By.xpath("//div[text()='"+string+"']"));
//	element.click();
//	}
	@When("User clicks on redmi phone")
	public void user_clicks_on_redmi_phone() {
		System.out.println("hi");
	}
}
