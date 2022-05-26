package stepDefs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStepDefs {
	WebDriver driver;
	
	@Given("User is on Login Page")
	
	  public void user_is_on_login_page() {
	  WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
	  driver.manage().deleteAllCookies(); driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/login");
	 
	}
	//Get values as maps
	@When("User enters Login Credentials")
	public void user_enters_login_credentials(DataTable dataTable) {
		List<Map<String, String>> user = dataTable.asMaps();
		String strUser= user.get(0).get("username");
		String strPwd=user.get(0).get("password");
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.className("radius")).click();
	    
	}
	
	@Then("User should be navigated to Home page")
	public void user_should_be_navigated_to_home_page() 
	{
	   
	boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	Assert.assertTrue(isValid);
	 
	}

}

