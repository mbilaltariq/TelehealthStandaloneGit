Feature: logout


	Background: 
		Given The user navigate to sign in page

  Scenario: Login successfully
    
    When The user is going to enter <Username> and <Password>
    And Click on the Sign in button
    And The user will be nevigated to the home page
    Then The user clicked on the logout button
    And The user click on the Yes button

  Scenario: Click on cancel button
    
    When The user enter the <Username> and <Password>
    And The user click on the login button
    And The user nevigates to the home
    Then User click on the logout button
    And The user clicks on the Cancel button
