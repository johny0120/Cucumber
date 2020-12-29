package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleTest {
	WebDriver driver;

@Given("User is entering google.co.in")

public void user_is_entering_google_co_in() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Cucumberjava\\driver\\chromedriver.exe");

 driver=new ChromeDriver();
driver.get("https://www.google.com/");
}

@When("User is typing the Search term {string}")
public void user_is_typing_the_Search_term(String searchTerm) {
	driver.findElement(By.name("q")).sendKeys(searchTerm);

   
}

@When("enters the retrun key")
public void enters_the_retrun_key() {
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

}
@Then("the usershould see the search results")
public void the_usershould_see_the_search_results() {
	 boolean status = driver.findElement(By.partialLinkText("john")).isDisplayed();


}



}
