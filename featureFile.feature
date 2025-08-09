Feature: Amazon E2E functionality

Scenario: login with valid credentials
Given I am able to view the homePage
And I am able to view loginPage
When I enter the username "8925782712"
And I click continue button
And I enter the password "Huvi2015"
And I click login button
Then I able to view user homepage "Hello, Malar"

Scenario: search for samsung mobiles
When I able to enter "samsung mobiles" in search box
And I click on search button
Then I able to view the samsung result page  "Amazon.in : samsung mobiles" 
And I able to view samsung related products

Scenario: select one samsung mobile, add to cart
When I able to view the samsung result page
Then select the mobile with maximum amount
And select the quantity
And add to cart