package com.base.flipkart;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.gherkin.Argument;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility implements IUtility {
	public static WebDriver driver;
	public static Actions action;
	public static Wait wait;
	public static JavascriptExecutor js;
	
	
	public static void browserlaunch(String string) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(string);
		action=new Actions(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
	}

	@Override
	public void sendText(WebElement ele, String input) {
		ele.sendKeys(input);
		
	}

	@Override
	public void button(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scrollDown(WebElement ele) {
	//	js.executeScript(Argument, null);
		
	}

	@Override
	public void scrollUp(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendText(String input, WebElement ele) {
		
		
	}

	@Override
	public void sendText(String input, WebElement ele, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void byVisibleText(WebElement ele, String input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void byIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void byVisibleValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseHoverToElement(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ss(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragDrop(WebElement ele1, WebElement ele2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rightClick(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void button(int i, WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listOptions() {
		// TODO Auto-generated method stub
		
	}

}
