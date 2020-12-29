package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class DataTableWithoutHeader {
	WebDriver driver;


@Given("You are on the ;ogin page")
public void you_are_on_the_ogin_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Cucumberjava\\driver\\chromedriver.exe");

    // Write code here that turns the phrase above into concrete actions
 driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
	
}
@When("You enter the login credintials")
public void you_enter_the_login_credintials(DataTable dataTable) {
	
	List<String> credentials = dataTable.asList(String.class);
	String username = credentials.get(0);
	String password = credentials.get(1);
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
    

    
}

@When("Clicks the login button")
public void clicks_the_login_button() {
	driver.findElement(By.id("btnLogin")).click();
}

    




}
