Feature: This is to google search
Scenario: Google Search scenario
 Given User is entering google.co.in
 When User is typing the Search term " Johnyboy"
 And enters the retrun key
 Then the usershould see the search results
 