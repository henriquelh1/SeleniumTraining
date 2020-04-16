#Each feature contains one feature
Feature: Test login functionality

#A feature may have given different specific scenarios
#Scneario use Give-When-Then Structure

Scenario: the user should be able to login with correct username and password
Given user is on the login page
When user enters correct username and correct password
Then user gets confirmation

