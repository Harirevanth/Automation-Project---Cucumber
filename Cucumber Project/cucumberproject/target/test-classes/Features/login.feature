Feature: Validation of adactin login application

 
Scenario: Validate the login Functionlity with valid datas
Given User is on the adactin login page
When User enters Valid username 
And password
And User clicks on Login Button
Then User should be navigated to the Search Hotel Page

Scenario: Validate the login Functionlity with Invalid username and valid password
Given User is on the adactin login page
When User enters Invalid username 
And User enters Valid password
And User clicks on Login Button
Then An alert message should be displayed

Scenario Outline: Validate the login Functionlity with valid username and Invalid password
Given User is on the adactin login page
When User enters Valid username as "<username>" and InValid password as "<password>"
And User clicks on Login Button
Then An alert message should be displayed

Examples:
|username|password|
|harirevanth|1245|
|harirevanth|124545|