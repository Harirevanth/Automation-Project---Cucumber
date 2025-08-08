Feature: Fill the Book A Hotel Page Details 

Background:
Given User is on the adactin login page
When User enters Valid username 
And password
And User clicks on Login Button
Then User should be navigated to the Search Hotel Page
Given User selects the Location in dropdown
And  User selects the hotels in dropdown
And User selects the Room Type in dropdown
And User selects the Number of Rooms in dropdown
And User selects the Check in Date
And User selects the Check out Date
And User selects the Adults per Room in dropdown
And User selects the Children per room in dropdown
And User clicks the Search Button
Then User should be navigated to Select Hotel page
Given User Clicks on Suitable Hotel radioButton
And  User Clicks on Continue Button
Then User should be navigated to Book a Hotel Page

Scenario:Fills the Book A Hotel Details
Given User enters their First Name
And User enters their Last Name
And User enters their Billing Address
And User enters their Credit Card Number
And User selects thier Credit Card Type
And User enters thier Credit Card Expiry Month and Year
And User enters thier Credit Card Cvv Number
And User clicks on BookNow
Then User waits for few Seconds 
Then User Should see the Order Number

Scenario:Validation when mandatory fields are missing
Given User leaves mandatory data empty
And User clicks on BookNow
Then User should see the Error Message there

Scenario: Validation Credit Number should be sixteen digit
Given User enters their First Name
And User enters their Last Name
And User enters their Billing Address
And User enters their Credit Card Number Less than sixteen digit
And User selects thier Credit Card Type
And User enters thier Credit Card Expiry Month and Year
And User enters thier Credit Card Cvv Number
And User clicks on BookNow
Then User waits for few Seconds 
And User should see a Credit Card Number error message
And User re-enters a valid 16-digit Credit Card Number
And User clicks on BookNow
Then User waits for few Seconds 
Then User Should see the Order Number

Scenario: Validation of Search Hotel Buttons
Given User enters their First Name
And User enters their Last Name
And User enters their Billing Address
And User enters their Credit Card Number
And User selects thier Credit Card Type
And User enters thier Credit Card Expiry Month and Year
And User enters thier Credit Card Cvv Number
And User clicks on BookNow
Then User waits for few Seconds 
Then User Should see the Order Number
And User clicks on Search Hotel Button
Then User should be navigated to the Search Hotel Page


Scenario: Validation of logout Buttons
Given User enters their First Name
And User enters their Last Name
And User enters their Billing Address
And User enters their Credit Card Number
And User selects thier Credit Card Type
And User enters thier Credit Card Expiry Month and Year
And User enters thier Credit Card Cvv Number
And User clicks on BookNow
Then User waits for few Seconds 
Then User Should see the Order Number
And User clicks on Logout Button
Then User Should be Logged Out


Scenario: Validation of MyItinery Buttons
Given User enters their First Name
And User enters their Last Name
And User enters their Billing Address
And User enters their Credit Card Number
And User selects thier Credit Card Type
And User enters thier Credit Card Expiry Month and Year
And User enters thier Credit Card Cvv Number
And User clicks on BookNow
Then User waits for few Seconds 
Then User Should see the Order Number
And User clicks on MyItinery Button
Then User should be navigated to Select Hotel page




