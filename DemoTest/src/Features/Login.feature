@smoke 
Feature: As a customer 
	I want to try login or Sign in
	
  
Background: 
	Given I am on home page 
	
@login
Scenario: Log in page validation messages 
	And I select login link 
	When I tried to login with incorrect details 
	Then I can see why my login failed 
	
 
Scenario: Sign up page user accounts 
	And I select sign up link 
	When I enter my details 
	
		| email      | firstName |lastName |
		| amail.com  | fname     | lname   |
		
	Then I agree to the terms for hire 
	
