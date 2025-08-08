package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import Base.BaseCommon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchhotelSteps {
	
	@Given("User selects the Location in dropdown")
	public void userSelectsTheLocationInDropdown() {
				
		BaseCommon.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement Location = BaseCommon.driver.findElement(By.xpath("//select[@name='location']"));
		 Select select = new Select(Location);
		 select.selectByIndex(1);
	    
	}
	@Given("User selects the hotels in dropdown")
	public void userSelectsTheHotelsInDropdown() {
		
		
         WebElement Hotel = BaseCommon.driver.findElement(By.xpath("//select[@name='hotels']"));
		 Select Hotels = new Select(Hotel);
		 Hotels.selectByValue("Hotel Cornice");
		
		
	    
	}
	@Given("User selects the Room Type in dropdown")
	public void userSelectsTheRoomTypeInDropdown() {
		
		WebElement Roomtype = BaseCommon.driver.findElement(By.xpath("//select[@name='room_type']"));
	    Select RoomTypes = new Select(Roomtype);
	    RoomTypes.selectByValue("Super Deluxe");	
	   
	}
	@Given("User selects the Number of Rooms in dropdown")
	public void userSelectsTheNumberOfRoomsInDropdown() {
		
		WebElement Roomnumber = BaseCommon.driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select numberofroom = new Select(Roomnumber);
		numberofroom.selectByValue("2");
	    
	}
	@Given("User selects the Check in Date")
	public void userSelectsTheCheckInDate() {
		
		WebElement Checkin = BaseCommon.driver.findElement(By.xpath("//input[@name='datepick_in']"));
		Checkin.clear(); 
		Checkin.sendKeys("08/09/2025");
		
		
	   
	}
	@Given("User selects the Check out Date")
	public void userSelectsTheCheckOutDate() {
		
		WebElement Checkout =BaseCommon.driver.findElement(By.xpath("//input[@name='datepick_out']"));
		Checkout.clear();  
		Checkout.sendKeys("10/09/2025");;
	    
	}
	@Given("User selects the Adults per Room in dropdown")
	public void userSelectsTheAdultsPerRoomInDropdown() {
		
		WebElement Adults = BaseCommon.driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select Adultsperroom = new Select(Adults);
		Adultsperroom.selectByValue("2");
		
	    
	}
	@Given("User selects the Children per room in dropdown")
	public void userSelectsTheChildrenPerRoomInDropdown() {
		
		WebElement childs = BaseCommon.driver.findElement(By.xpath("//select[@name='child_room']"));
		Select childrensperroom = new Select(childs);
		childrensperroom.selectByValue("1");
	  
	}
	@Given("User clicks the Search Button")
	public void userClicksTheSearchButton() {
		
		 WebElement Search =BaseCommon.driver.findElement(By.xpath("//input[@id='Submit']"));
		 Search.click();
	    
	}
	@Then("User should be navigated to Select Hotel page")
	public void userShouldBeNavigatedToSelectHotelPage() {
		
		System.out.println("Select the Hotels...");
		boolean contains = BaseCommon.driver.getTitle().contains("Select Hotel");
		System.out.println("You are in correct page:"+contains);
	    
	}
	
	@Then("User leaves mandatory fields empty")
	public void userLeavesMandatoryFieldsEmpty() {
		
		WebElement checkin = BaseCommon.driver.findElement(By.name("datepick_in"));
	    checkin.clear();

	    WebElement checkout = BaseCommon.driver.findElement(By.name("datepick_out"));
	    checkout.clear();
		
	   
	}
	@Then("Appropriate error message should be displayed")
	public void appropriateErrorMessageShouldBeDisplayed() {
		
		WebElement locationError = BaseCommon.driver.findElement(By.id("location_span"));
		WebElement numofroom = BaseCommon.driver.findElement(By.id("num_room_span"));
	    WebElement checkinError = BaseCommon.driver.findElement(By.id("checkin_span"));
	    WebElement checkoutError = BaseCommon.driver.findElement(By.id("checkout_span"));
	    WebElement adultError = BaseCommon.driver.findElement(By.id("adults_room_span"));

	    // Print the errors (or assert)
	    System.out.println("Location Error: " + locationError.getText());
	    System.out.println("Numofrooms:"+numofroom.getText());
	    System.out.println("Checkin Error: " + checkinError.getText());
	    System.out.println("Checkout Error: " + checkoutError.getText());
	    System.out.println("Adults Error: " + adultError.getText());

	   
	}

}
