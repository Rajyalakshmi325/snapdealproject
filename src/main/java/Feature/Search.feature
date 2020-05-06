Feature: enter snapdeal url

Scenario: enter the url

Given open the browser
When enter the url
Then get the title of the page
Then search bar should enabled
Then User search for a product
Then User is on that product page
Then close the browser