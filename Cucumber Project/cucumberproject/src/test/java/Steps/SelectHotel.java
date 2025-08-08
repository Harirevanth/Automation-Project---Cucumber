package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseCommon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SelectHotel {
	
	@Given("User Clicks on Suitable Hotel radioButton")
	public void userClicksOnSuitableHotelRadioButton() {
		
		BaseCommon.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement HotelSelectRadio = BaseCommon.driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		HotelSelectRadio.click();
	   
	}
	@Given("User Clicks on Continue Button")
	public void userClicksOnContinueButton() {
		
		 WebElement HotelSelectcontinue = BaseCommon.driver.findElement(By.xpath("//input[@id='continue']"));
		 HotelSelectcontinue.click();
	   
	}
	@Then("User should be navigated to Book a Hotel Page")
	public void userShouldBeNavigatedToBookAHotelPage() {
		
		System.out.println("Book A Hotel.");
		boolean contains = BaseCommon.driver.getTitle().contains("Book A Hotel");
		System.out.println("You are in correct page:"+contains);
	    
	}
	
	@Given("User leaves the Hotel radioButton unselected")
	public void userLeavesTheHotelRadioButtonUnselected() {
		
		WebElement HotelSelectcontinue = BaseCommon.driver.findElement(By.xpath("//input[@id='continue']"));
		 HotelSelectcontinue.click();
	  
	}
	@Then("User should see the Error Message")
	public void userShouldSeeTheErrorMessage() {
		
		WebElement HotelerrorMessage = BaseCommon.driver.findElement(By.id("radiobutton_span"));
		System.out.println("User Need to Select the Hotel or Cancel:"+ HotelerrorMessage.getText());
	   
	}
	@Then("User Clicks on Cancel Button")
	public void userClicksOnCancelButton() {
		
		WebElement HotelCancel = BaseCommon.driver.findElement(By.id("cancel"));
		HotelCancel.click();
	    
	}

}
