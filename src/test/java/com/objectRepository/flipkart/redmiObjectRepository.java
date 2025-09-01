package com.objectRepository.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.flipkart.Utility;

public class redmiObjectRepository extends Utility {

	public redmiObjectRepository(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@class='Pke_EE']")
	private WebElement element1;
	
	@FindBy(xpath="//button[@class='_2iLD__']")
	private WebElement element2;
	
	@FindBy(xpath="//div[text()='Price -- High to Low']")
	private WebElement element3;
	
	@FindBy(xpath="//div[text()='Newest First']")
	private WebElement element4;

	public WebElement getElement1() {
		return element1;
	}

	public WebElement getElement2() {
		return element2;
	}

	public WebElement getElement3() {
		return element3;
	}

	public WebElement getElement4() {
		return element4;
	}
	
	
}
