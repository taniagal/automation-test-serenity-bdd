# automation-test-serenity-bdd
Test automation with java

Tools used to execute the tests.

Serenity Bdd
Cucumber
Gherkin
Maven 
Java 
Sonar Lint
Selenium 
Pom


-Two tests were created to validate the creation of accounts and edit accounts created
-The automation design pattern used to build the automation is POM

-Each feature has its definitions file and steps file
-The elements with the locators are organized by page 

-Each feature has its runner associated 
-The test can be executed from the feature wit right click and execute with chrome in this case.

-Several dependencies were added in the pom to execute the tests succesfully.
-The assertions were created with Junit 

-The language used to create the test scenarios was english
-The structure used to build the test scenrios was gherkin

-The methods used to wait the elements are from serenity bdd 
-The methods are build with the camelCaseStructure
-The elements were located with different type of selectors as:
      -Xpath 
      -Id

Features   
create_new_account.feature: this feature has the scenario to validate the account creation with different type of data 
edit_account.feature: this feature has the scenario to validate how to edit an existing account 

Page
HomePage: this page has the locators associated to principal page after a user is logged in
LoginPage:  this page has the locators associated to the login (url, user and password)
AccountPage: this page has the locators associated to the account creation and editing accounts.

Definitions
This files have the different methods and type of data to send to the page and create o edit the accounts 

Steps 
This files have  the different methods to comunicate low layers with the elements page




