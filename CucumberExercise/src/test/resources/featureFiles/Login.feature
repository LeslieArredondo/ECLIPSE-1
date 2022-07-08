@tag
Feature: Login Page
  As a user I should be able to log in to the page in order to buy something

  @validCredentials
  Scenario: As a Normal user I should be able to log in with valid credentials
    Given The user is in login page
    When User send an email as "test900@hotmail.com"
    And User send password as "test1"
    And User click on Sign in button
    Then User should be in profile page
    
   @invalidCredentials
  Scenario: As a Normal user I should getting an error if I send an invalid email
	
	Given The user is in login page
    When User send an email as "test900"
    And User send password as "test1"
    And User click on Sign in button
    Then User should get an error message as "Invalid email address"
    
    @invalidCredentials
 Scenario: As a Normal User I should getting an error if I send an incorrect email
    Given The user is in login page
    When User sends an email as "test900@hotmail.com"
    And User send password as " "
    And User click on Sign in button
    Then User should get an error message as "Password is required."