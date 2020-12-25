Feature: Free CRM app contacts testing
Scenario Outline: This is scenario of Contact Page

Given user is already on login page
When title for login page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on login button
Then user is on home page
Then user move to new contact page
Then user enters "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
	| username | password | firstname | lastname | position |
	| suhag7799 | Winter@2020 | James | Bond | Hero |
	| suhag7799 | Winter@2020 | Lila | Ler | Heroine |