package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseCommon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Base.BaseCommon;

public class Loginsteps  {
	
	WebDriver driver;
	
	@Given("User is on the adactin login page")
	public void userIsOnTheAdactinLoginPage() {
		
		BaseCommon.driver = new ChromeDriver();
			
        BaseCommon.driver.get("https://adactinhotelapp.com/index.php");
        BaseCommon.driver.manage().window().maximize();
   
	}
	
	@When("User enters Valid username")
	public void userEntersValidUsername() {
		
		BaseCommon.driver.findElement(By.id("username")).sendKeys("harirevanth");
	   
	}
	
	@When("User enters Invalid username")
	public void userEntersInvalidUsername() {
		BaseCommon.driver.findElement(By.id("username")).sendKeys("harirevanth1234");
	}
	
	@When("password")
	public void password() {
		
		BaseCommon.driver.findElement(By.id("password")).sendKeys("REVANTH@QQQ");
	   
	}
	
	@When("User enters Valid password")
	public void userEntersValidPassword() {
		BaseCommon.driver.findElement(By.id("password")).sendKeys("REVANTH@QQQ");
	}
	
	@When("User clicks on Login Button")
	public void userClicksOnLoginButton() {
		
		BaseCommon.driver.findElement(By.id("login")).click();
	   
	}
	@Then("User should be navigated to the Search Hotel Page")
	public void userShouldBeNavigatedToTheSearchHotelPage() {
	  
		System.out.println("Searching for hotels...");
		boolean contains = BaseCommon.driver.getTitle().contains("Search Hotel");
		System.out.println("You are in correct page:"+contains);


}
	@Then("An alert message should be displayed")
	public void anAlertMessageShouldBeDisplayed() {
		
		System.out.println("Searching for hotels...");
		boolean contains = BaseCommon.driver.getTitle().contains("Search Hotel");
		System.out.println("You are in correct page:"+contains);
	   
	}
	
	@When("User enters Valid username as {string} and InValid password as {string}")
	public void userEntersValidUsernameAsAndInValidPasswordAs(String s1, String s2) {
		
		BaseCommon.driver.findElement(By.id("username")).sendKeys(s1);
		
		BaseCommon.driver.findElement(By.id("password")).sendKeys(s2);
	    
	}


	
}
