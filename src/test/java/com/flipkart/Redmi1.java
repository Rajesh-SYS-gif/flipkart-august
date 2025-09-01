package com.flipkart;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import javax.swing.text.Utilities;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.flipkart.Utility;
import com.objectRepository.flipkart.redmiObjectRepository;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Redmi1 extends Utility {
	redmiObjectRepository r;
	
	@Given("Launch the application flipkart {string}")
	public void launch_the_application_flipkart(String string) {
		Utility.browserlaunch(string);
		r=new redmiObjectRepository(driver);
		
	}


@Then("Validate the users landed on home page")
public void validate_the_users_landed_on_home_page() {

		String title=Utility.driver.getTitle();
		if(title.contains("flipkart"))
		{
			System.out.println("user landed on home page");
		}
		else
		{
  			System.err.println("user not landed on home page");
}}

@When("User should enter the redmi on search box")
public void user_should_enter_the_redmi_on_search_box() {
	//WebElement element1 = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
              r.getElement1().sendKeys("redmi");
}

@When("User clicks on search")
public void user_clicks_on_search( ) {
 //  WebElement element2 = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
r.getElement2().click();
}
@When("Sort by {string}")
public void sort_by(String string) {
	WebElement element = driver.findElement(By.xpath("//div[text()='"+string+"']"));
element.click();
}
@When("Sort by price low to high")
public void sort_by_price_low_to_high() {
	driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();

	}


@When("user selects a brand from the menu with one dim list")
public void user_selects_a_brand_from_the_menu_with_one_dim_list(DataTable dataTable) {
List<String> list = dataTable.asList();  
 String text =list.get(0);
 
   WebElement menuoption = driver.findElement(By.xpath("//div[text()='"+text+"']"));
   menuoption.click();
}
@When("user selects a brand from the menu with one dim map")
public void user_selects_a_brand_from_the_menu_with_one_dim_map(DataTable dataTable) {
  Map<String, String> map = dataTable.asMap(String.class,String.class);
 String text = map.get("value3");
 WebElement element = driver.findElement(By.xpath("//div[text()='"+text+"']"));
 element.click();
}

@Then("Sort by price high to low")
public void sort_by_price_high_to_low() {
   // driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
   r.getElement3().click();
   System.out.println("hi");
   
}
@Then("Sort by newest first")
public void sort_by_newest_first() {
   //driver.findElement(By.xpath("//div[text()='Newest First']")).click();
   r.getElement4().click();

//@When("User clicks on redmi phone")
//public void user_clicks_on_redmi_phone() {
//	System.out.println("hi");
//}
}
}