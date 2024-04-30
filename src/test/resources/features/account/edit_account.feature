#languaje:us

Feature: Edit account
As a client
I want edit a account
So that I can update the information of my company

  @EditAccountsuccessfully
  Scenario: : Edit account
    Given you are logged in to salesforce with the credentials user "testautomationinterview-vzzy@force.com" and password "automation1233%"
    And you have an account created with the name "Priyank1"
    When you edit the account with the next information
      |AccountName|WebSite  |Guy |Description             |Phone          |MainAccount|ShippingStreet|ShippingCity|ShippingState|ShippingZipCode|ShippingCountry|BillingStreet|BillingCity|BillingState|BillingZipCode|BillingCountry|
      |Priyank2   |Good1    |Guy1 |DescriptionDescription1|32167789651    |MainAccount1|Street 501   |Medellín1   |Antioquia1   |23451           |Colombia1     |Street 501   |Medellín1  |Antioquia1  |23451         |Colombia1     |
    Then the account should be updated with the new information
      |AccountName|WebSite  |Guy |Description             |Phone          |MainAccount|ShippingStreet|ShippingCity|ShippingState|ShippingZipCode|ShippingCountry|BillingStreet|BillingCity|BillingState|BillingZipCode|BillingCountry|
      |Priyank1   |Good1    |Guy1 |DescriptionDescription1|32167789651    |MainAccount1|Street 501   |Medellín1   |Antioquia1   |23451           |Colombia1     |Street 501   |Medellín1  |Antioquia1  |23451         |Colombia1     |