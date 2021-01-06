package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchFacebook {
	WebDriver driver;
	


	@Given("user enters the facebook.com")
	public void user_enters_the_facebook_com() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\git\\Cucumber\\Cucumberjava\\driver\\chromedriver.exe");
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    }

	@When("user is typing the user name {string}")
	public void user_is_typing_the_user_name(String userName) {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("email")).sendKeys(userName);
	}

	@When("user is typing the password {string}")
	public void user_is_typing_the_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys(password);
	
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("login")).click();
	}

	@Then("user should see the login sucessfull")
	public void user_should_see_the_login_sucessfull() {
	    // Write code here that turns the phrase above into concrete actions
	/*	boolean status = driver.findElement(By.partialLinkText("messi john")).isDisplayed();
		Assert.assertTrue(status);
*/	

	}



}
