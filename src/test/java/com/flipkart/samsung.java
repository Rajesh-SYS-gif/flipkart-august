package com.flipkart;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class samsung {
static WebDriver driver;
@Given("Launch the application flipkart.com {string}")
public void launch_the_application_flipkart_com(String string) {
	 WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get(string);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
}

@Then("Validate the users landed on home page only")
public void validate_the_users_landed_on_home_page_only() {
	String title=driver.getTitle();
	if(title.contains("flipkart"))
	{
		System.out.println("user landed on home page");
	}
	else
	{
			System.err.println("user not landed on home page");
}
}

@When("User should enter the samsung on search box")
public void user_should_enter_the_samsung_on_search_box() {
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("samsung");
}

@When("User clicks on search button")
public void user_clicks_on_search_button() {
	 driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	
}

@When("Sort by price low to high in samsung page")
public void sort_by_price_low_to_high_in_samsung_page() {
	driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();

}

@When("user select a brand from the menu with one dim map")
public void user_select_a_brand_from_the_menu_with_one_dim_map(DataTable dataTable) {
	 Map<String, String> map = dataTable.asMap(String.class,String.class);
	 String text = map.get("value3");
	 WebElement element = driver.findElement(By.xpath("//a[text()='"+text+"']"));
	 element.click();
}
}