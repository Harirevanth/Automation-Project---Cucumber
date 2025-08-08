Feature: Selects the suitable hotel 

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

Scenario: User Selects the Hotel
Given User Clicks on Suitable Hotel radioButton
And  User Clicks on Continue Button
Then User should be navigated to Book a Hotel Page

Scenario: Validation when mandatory radioButton is unclicked
Given User leaves the Hotel radioButton unselected
Given User Clicks on Continue Button
Then User should see the Error Message
And  User Clicks on Cancel Button
Then User should be navigated to Select Hotel page



