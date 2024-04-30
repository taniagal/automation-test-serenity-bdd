#languaje:us

Feature: Create new account
  As a client
  I want to create a new account
  So that I can register the information of my company

@CreateNewAccountsuccessfully
Scenario: : Create new account
Given you are logged in to salesforce with the credentials user "testautomationinterview-vzzy@force.com" and password "automation1233%"
  When you go to accounts and you create a new account with the principal information "<AccountName>","<WebSite>","<Guy>","<Description>","<MainAccount>"
  And you add the next phone "3216778965"
  And you add the next billing address
    |BillingStreet|BillingCity|BillingState|BillingZipCode|BillingCountry|
    |Street 50    |Medellín   |Antioquia   |2345          |Colombia      |
  And you add the next shipping address
    |ShippingStreet|ShippingCity|ShippingState|ShippingZipCode|ShippingCountry|
    |Street 50     |Medellín    |Antioquia    |2345           |Colombia       |
  And you save the information to create a new account
  Then the account should be created with the next information
    |AccountName|WebSite  |Guy |Description           |Phone          |MainAccount|ShippingStreet|ShippingCity|ShippingState|ShippingZipCode|ShippingCountry|BillingStreet|BillingCity|BillingState|BillingZipCode|BillingCountry|
    |Priyank    |Good     |Guy |DescriptionDescription|3216778965     |MainAccount|Street 50     |Medellín    |Antioquia    |2345           |Colombia       |Street 50    |Medellín   |Antioquia   |2345          |Colombia      |
  Examples:
    |AccountName|WebSite  |Guy |Description|MainAccount|
    |Priyank    | Good    |Guy |Description|           |
