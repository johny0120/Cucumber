package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExamples {
	WebDriver driver;
	

@Given("Proced to the page")
public void proced_to_the_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Cucumberjava\\driver\\chromedriver.exe");
    // Write code here that turns the phrase above into concrete actions
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("User enters{string} and {string}")
public void user_enters_and(String UserName, String Password) {
	
	driver.findElement(By.id("txtUsername")).sendKeys(UserName);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	
   
}

@When("Clicked button")
public void clicked_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("btnLogin")).click();
}





}
