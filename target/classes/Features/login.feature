Feature: Free CRM app testing

#Scenario: This is scenario of login
#Given user is already on login page
#When title for login page is Free CRM
#Then user enters "suhag7799" and "Winter@2020"
#Then user click on login button
#Then user is on home page

#Scenario: user is able to create new contact 
#Given user is already on home page
#When user mouse over on contacts link
#Then user clicks on new contact link
#Then user enters first name, last name
#Then user clicks on save button
#Then verify new contact created

Scenario Outline: This is scenario of login
Given user is already on login page
When title for login page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on login button
Then user is on home page


Examples:
	| username | password |
	| suhag7799 | Winter@2020 |
	| patel | Winter@2200 |
	