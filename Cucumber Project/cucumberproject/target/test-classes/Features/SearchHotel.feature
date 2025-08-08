Feature: Full the adactin SearchHotel page as per your needs

Background:
Given User is on the adactin login page
When User enters Valid username 
And password
And User clicks on Login Button
Then User should be navigated to the Search Hotel Page

Scenario: Full the Form
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

Scenario: Validation when mandatory fields are missing
Given User is on the adactin login page
When User enters Valid username 
And password
And User clicks on Login Button
Then User should be navigated to the Search Hotel Page
And User leaves mandatory fields empty
And User clicks the Search Button
Then Appropriate error message should be displayed