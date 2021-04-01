Feature: Feature to test google search functionality

Scenario: Validate google search is working

Given Browser is open
And User is on google search page
When user enters text in searchbox 
And hits enter
Then user is navigated to search results