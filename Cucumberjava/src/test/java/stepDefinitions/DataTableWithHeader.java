package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DataTableWithHeader {
	WebDriver driver;
	
	
	
	@Given("Go to Login page")
	public void go_to_Login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Cucumberjava\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	    	}

	@When("enter the below credentials")
	public void enter_the_below_credentials(DataTable dataTable) {
		List<Map<String, String>> keyvaluepair = dataTable.asMaps(String.class, String.class);
		
		String username= keyvaluepair.get(0).get("UserName");
		String password = keyvaluepair.get(0).get("password");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	   
	}
	@When("Click login button")
	public void click_login_button() {
		driver.findElement(By.id("btnLogin")).click();
		
	}




}
