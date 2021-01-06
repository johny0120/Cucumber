Feature: This is to test google search
Scenario: Google search scenario
   Given user is entering into google.co.in
   When user is typing the search term "Deva john raj"
   And enter the return key
   Then the user should see the search results