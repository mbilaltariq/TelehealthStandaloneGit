Feature: 

  Scenario: Don't Have an Account
    Given the user navigates to the Login Page
    When the user clicks on Don't have an account option
    Then the user will navigated to the Sign Up page

  Scenario Outline: Register with valid fields
    Given the user navigates to the SingUp Page
    And the user Enter his <FirstName>
    And the user Entered his <LastName>
    And the user set his <RoomName>
    And the user enter his <Email>
    And the user entered his <Password>
    And the user confirmed his <ConfirmPassword>
    When the user clicks on the i agree button
    And clicks on the Singup button
    Then the profile of the user will be created
    And the user will be navigated to the Home page

    Examples: 
      | FirstName | LastName | RoomName | Email                                     | Password | ConfirmPassword |
      | Baraak    | Obama    | Workmy   | 8775521002252AUSA1usolfgbama1@persivia.com | P@k12345 | P@k12345        |

  Scenario: Signup With Empty Fields
    Given the user navigates to the Signup Page
    And the user clicks on the SignUp button without any information
    Then the user will not be able to Register a user
    And user will see the error messages against the fields

  Scenario Outline: Register with Same Room Name
    Given the user navigate to the SingUp Page
    And user fill his <FirstName>
    And the user filled <LastName>
    And the user Set his <RoomName>
    And user entered his <Email>
    And the user placed his <Password>
    And the user Confirmed his <ConfirmPassword>
    When the user Clicks on the i agree button
    And clicks on the SingUP button
    Then the user profile will not be created
    And the user will see the error on the Room name

    Examples: 
      | FirstName | LastName | RoomName                 | Email                          | Password | ConfirmPassword |
      | Baraak    | Obama    | 100USAaPresidentObama124 | 199barakobamausmm@persivia.com | P@k12345 | P@k12345        |
