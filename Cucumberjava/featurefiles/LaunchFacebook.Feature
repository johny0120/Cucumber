@simplelogin
Feature: This is test to launch the facebook
Scenario: Facebook launch secnario
  Given user enters the facebook.com
  When user is typing the user name "8056039733" 
  And user is typing the password "preach"
  And user click the login button
  Then user should see the login sucessfull