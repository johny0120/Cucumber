package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Cucumberjava\\driver\\chromedriver.exe");
	    // Write code here that turns the phrase above into concrete actions
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("the user enter the valid username and password")
	public void the_user_enter_the_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("clicks on the logim button")
	public void clicks_on_the_logim_button() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("btnLogin")).click();
	}

	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.id("MP_link")).isDisplayed();
		Assert.assertTrue(status);
		}

	}




