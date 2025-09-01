@samsung
Feature: validate samsung

Background: navigate to samsung
Given Launch the application flipkart.com "https://www.flipkart.com/"
Then Validate the users landed on home page only
When User should enter the samsung on search box
And User clicks on search button

Scenario: validate the samsung product
When Sort by price low to high in samsung page
#And user selects a brand from the menu with one dim list
#|REDMI|Mi||SPICE|Peace|

And user select a brand from the menu with one dim map
|value1|Mobiles|
|value2|Mobile Cases & Covers|
|value3|Tablets|
|value4|Wall Chargers|
|value5|Mobile Screen Guards|
