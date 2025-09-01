@redmi

Feature: validate redmi

Background: navigate to redmi
Given Launch the application flipkart "https://www.flipkart.com/"
Then Validate the users landed on home page
When User should enter the redmi on search box
And User clicks on search

#Scenario Outline: validate the redmi product
#When Sort by "<sort>"
#
#
#Examples:
#|sort                  | column1|
#|Price -- Low to High          | column2|
#|Price -- High to Low  | column3|
#|Newest First  |column4|

And user selects a brand from the menu with one dim list
|REDMI|Mi||SPICE|Peace|

#And user selects a brand from the menu with one dim map
#|value1|REDMI|
#|value2|Mi|

#|value3|SPICE|
#|value4|Peace|
#
#Scenario: validate the redmi product
#Then Sort by price high to low
#
#Scenario: validate the redmi product
#And  Sort by newest first 

#Scenario: validate the redmi product
#When User clicks on redmi phone 
#
 #

