@tag
Feature: Login Action

Background: 
Given Launch the browser
@tag1
Scenario Outline: Login With valid credentials
	Given Navigate to Login Page
	When Enter username"<userName>"
	Then click on next button
	Examples:
	| userName    |
	| cbtcrowd508 |
	