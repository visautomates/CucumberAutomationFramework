Feature: Ebay home page scenarios

@Test1

Scenario: Advance search Link

Given I am on Ebay home page
When  I click on Advance search Link
Then  I navigate to Advance search Page




@Test1
Scenario: Search item in search box

Given I am on Ebay home page
When I am searching item in search box
Then Item is isplayed with results