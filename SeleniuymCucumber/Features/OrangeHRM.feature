Feature: Login
Scenario: Logo Verification on homepage
Given Browser is launched
When User enters the url
Then User verifies the logo on the homepage
And Browser is closed

Scenario: Login with valid credentials
Given Browser is launched
When User enters the url
Then User enters the correct username and password
Then User clicks on Login
Then User clicks on logout button
Then User verifies the title of the page
And Browser is closed