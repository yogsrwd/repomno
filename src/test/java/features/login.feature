
Feature: Application Login

Scenario: Login with valid credentials
Given Open any Browser
And Navigate to Login page
When User enters username as "onlybhailog1@gmail.com" and password as "9898@Rr123" into the fields
And User clicks on Login button
Then Verify user is able to successfully login
