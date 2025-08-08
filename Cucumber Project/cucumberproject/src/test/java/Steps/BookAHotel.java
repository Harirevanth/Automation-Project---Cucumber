package Steps;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Base.BaseCommon;

public class BookAHotel {
	
	@Given("User enters their First Name")
	public void userEntersTheirFirstName() {
		
       WebElement name = BaseCommon.driver.findElement(By.xpath("//input[@name='first_name']"));
       name.sendKeys("John");
	   
	}
	@Given("User enters their Last Name")
	public void userEntersTheirLastName() {
	  WebElement lastname = BaseCommon.driver.findElement(By.xpath("//input[@name='last_name']"));
	  lastname.sendKeys("kumar");
	   
	}
	@Given("User enters their Billing Address")
	public void userEntersTheirBillingAddress() {
		WebElement address = BaseCommon.driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("T Nagar,Chennai");
	   
	}
	@Given("User enters their Credit Card Number")
	public void userEntersTheirCreditCardNumber() {
		WebElement ccnumber = BaseCommon.driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnumber.sendKeys("1245788978451201");
	  
	}
	@Given("User selects thier Credit Card Type")
	public void userSelectsThierCreditCardType() {
	 WebElement cctype = BaseCommon.driver.findElement(By.xpath("//select[@name='cc_type']"));
	 Select selectType = new Select(cctype);
	 selectType.selectByValue("AMEX");	
	   
	}
	@Given("User enters thier Credit Card Expiry Month and Year")
	public void userEntersThierCreditCardExpiryMonthAndYear() {
		WebElement ccexp = BaseCommon.driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select ccexpmonth = new Select(ccexp);
		ccexpmonth.selectByIndex(9);
			
		WebElement ccexpyear =BaseCommon. driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select ccyear = new Select(ccexpyear);
		ccyear.selectByIndex(10);
	  
	}
	@Given("User enters thier Credit Card Cvv Number")
	public void userEntersThierCreditCardCvvNumber() {
	  WebElement cvv = BaseCommon.driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	  cvv.sendKeys("124");
	 
	}
	@Given("User clicks on BookNow")
	public void userClicksOnBookNow() {
	  WebElement Booknow = BaseCommon.driver.findElement(By.id("book_now"));
	  Booknow.click();
	  
	}
	@Then("User waits for few Seconds")
	public void userWaitsForFewSeconds() {
		BaseCommon.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	   
	}
	@Then("User Should see the Order Number")
	public void userShouldSeeTheOrderNumber() {
		
		WebElement Ordernumber = BaseCommon.driver.findElement(By.id("order_no"));
		@Nullable
		String Bookingnumber = Ordernumber.getAttribute("value");
		System.out.println("Room Booking Number is:"+Bookingnumber);
	   
	}
	
	@Given("User leaves mandatory data empty")
	public void userLeavesMandatoryDataEmpty() {
		 WebElement Booknow = BaseCommon.driver.findElement(By.id("book_now"));
		  Booknow.click();
		  
	   	}

    @Then("User should see the Error Message there")
	public void userShouldSeeTheErrorMessageThere() {
    	    
    	WebElement FirstnameError = BaseCommon.driver.findElement(By.id("first_name_span"));
    	System.out.println(FirstnameError.getText());
    	
    	WebElement LastnameError = BaseCommon.driver.findElement(By.id("last_name_span"));
    	System.out.println(LastnameError.getText());
    	
    	WebElement AddressError = BaseCommon.driver.findElement(By.id("address_span"));
    	System.out.println(AddressError.getText());
    	
    	WebElement cctype = BaseCommon.driver.findElement(By.id("cc_type_span"));
    	System.out.println(cctype.getText()); 
    	
    	WebElement ccexpiry = BaseCommon.driver.findElement(By.id("cc_expiry_span"));
    	System.out.println(ccexpiry.getText());
    	
    	WebElement cccvv = BaseCommon.driver.findElement(By.id("cc_cvv_span"));
    	System.out.println(cccvv.getText());
    	
    	
    }
    
    @Given("User enters their Credit Card Number Less than sixteen digit")
    public void userEntersTheirCreditCardNumberLessThanSixteenDigit() {
    	
    	WebElement ccnumber = BaseCommon.driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnumber.sendKeys("1245788978451");
    	
    	
        
    }
    @Then("User should see a Credit Card Number error message")
    public void userShouldSeeACreditCardNumberErrorMessage() {
    	
    	WebElement ccnum = BaseCommon.driver.findElement(By.id("cc_num_span"));
    	System.out.println(ccnum.getText());
       
    }
    @Then("User re-enters a valid {int}-digit Credit Card Number")
    public void userReEntersAValidDigitCreditCardNumber(Integer int1) {
    	
    	WebElement ccnumber = BaseCommon.driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnumber.sendKeys("1245788978451201");
       
    	
    }
    
    @Then("User clicks on Search Hotel Button")
    public void userClicksOnSearchHotelButton() {
    	WebElement searchhotelbtn = BaseCommon.driver.findElement(By.id("search_hotel"));
		searchhotelbtn.click();
    }
    
    @Then("User clicks on Logout Button")
    public void userClicksOnLogoutButton() {
    	WebElement logoutbtn = BaseCommon.driver.findElement(By.id("logout"));
		logoutbtn.click();
    }
    @Then("User Should be Logged Out")
    public void userShouldBeLoggedOut() {
        System.out.println("You are Logged Out");
    }
    
    @Then("User clicks on MyItinery Button")
    public void userClicksOnMyItineryButton() {
    	WebElement Itinerarybtn = BaseCommon.driver.findElement(By.id("my_itinerary"));
		Itinerarybtn.click();
    }


}
