package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class ExpressionFeatures {
WebDriver driver;

@Given("I have a {int} laptop")
public void i_have_a_laptop(Integer int1) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Cucumberjava\\driver\\chromedriver.exe");
     // Write code here that turns the phrase above into concrete actions
//	driver=new ChromeDriver();
//	driver.get(");
	System.out.println("laptop"+ int1);

}

/*@Given("I have a {double} CGPA")
public void i_have_a_CGPA(Double double1) {
    // Write code here that turns the phrase above into concrete actions
   System.out.printf("float value is:",+ double1);
}*/


@Given("{string} is elder to {string} and {string}")
public void is_elder_to_and(String name, String name2, String name3) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println(name+"is Elder to"+name2+"and"+name3);
}



}
