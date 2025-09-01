package com.base.flipkart;

import org.openqa.selenium.WebElement;

public interface IUtility {
	public void sendText(WebElement ele,String input);
	public void button(WebElement ele);
	public void scrollDown(WebElement ele);
	public void scrollUp(WebElement ele);

	public void sendText(String input,WebElement ele);
	public void sendText(String input,WebElement ele,int i);
	public void byVisibleText(WebElement ele,String input);
	public void byIndex(WebElement ele,int index);
	public void byVisibleValue(WebElement ele,String value);

	public void mouseHoverToElement(WebElement ele);
	public void childWindow();
	public void ss(String name);
	public void dragDrop(WebElement ele1,WebElement ele2);
	public void rightClick(WebElement ele);
	public void button(int i,WebElement ele);
	public void button();
	public void listOptions();

}
