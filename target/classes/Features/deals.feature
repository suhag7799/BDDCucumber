Feature: Deal Data creation

Scenario: Free CRM create a deal scenario
Given user is already on login page
When title for login page is Free CRM
Then user enters username and password
| suhag7799 | Winter@2020 |
Then user click on login button
Then user is on home page
Then user move to new deal page
Then user enters deal details title and amount
| ThanksGiving | 200 | 50 | 10 | 
Then Close the browser