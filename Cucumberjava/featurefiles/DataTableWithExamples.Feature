Feature: This the login feature for OrangeHRM
Scenario Outline: This is the login scenario
  Given Proced to the page
  When User enters"<UserName>" and "<Password>"
  And Clicked button
  
  Examples:
     |UserName |Password|
     |Admin    |admin123|  
     |admin    |johny   |
     |hello    |hai123  |