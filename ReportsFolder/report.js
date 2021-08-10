$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Regression/SignUp.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Don\u0027t Have an Account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user navigates to the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingUP_Steps.navigate_to_the_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Don\u0027t have an account option",
  "keyword": "When "
});
formatter.match({
  "location": "SingUP_Steps.user_clicks_SingUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will navigated to the Sign Up page",
  "keyword": "Then "
});
formatter.match({
  "location": "SingUP_Steps.user_navigated_to_Signup()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Register with valid fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user navigates to the SingUp Page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user Enter his \u003cFirstName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user Entered his \u003cLastName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user set his \u003cRoomName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user enter his \u003cEmail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user entered his \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user confirmed his \u003cConfirmPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the i agree button",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the Singup button",
  "keyword": "And "
});
formatter.step({
  "name": "the profile of the user will be created",
  "keyword": "Then "
});
formatter.step({
  "name": "the user will be navigated to the Home page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "RoomName",
        "Email",
        "Password",
        "ConfirmPassword"
      ]
    },
    {
      "cells": [
        "Baraak",
        "Obama",
        "Workmy",
        "qwerty@persivia.com",
        "P@k12345",
        "P@k12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register with valid fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user navigates to the SingUp Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingUP_Steps.navigate_to_the_SignUPpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Enter his Baraak",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_enters_FirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Entered his Obama",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_enters_LastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user set his Workmy",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_set_RoomName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter his qwerty@persivia.com",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_set_Email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user entered his P@k12345",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_set_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user confirmed his P@k12345",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_confirms_Passowrds(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the i agree button",
  "keyword": "When "
});
formatter.match({
  "location": "SingUP_Steps.user_agree_termsConstions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Singup button",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_clicks_on_SingUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the profile of the user will be created",
  "keyword": "Then "
});
formatter.match({
  "location": "SingUP_Steps.profile_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be navigated to the Home page",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_navigated_to()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Signup With Empty Fields",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user navigates to the Signup Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingUP_Steps.navigates_to_the_Signuppage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the SignUp button without any information",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_clicks_on_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will not be able to Register a user",
  "keyword": "Then "
});
formatter.match({
  "location": "SingUP_Steps.user_is_registerd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will see the error messages against the fields",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_will_see_error_messages()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Register with Same Room Name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user navigate to the SingUp Page",
  "keyword": "Given "
});
formatter.step({
  "name": "user fill his \u003cFirstName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user filled \u003cLastName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user Set his \u003cRoomName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user entered his \u003cEmail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user placed his \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user Confirmed his \u003cConfirmPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user Clicks on the i agree button",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the SingUP button",
  "keyword": "And "
});
formatter.step({
  "name": "the user profile will not be created",
  "keyword": "Then "
});
formatter.step({
  "name": "the user will see the error on the Room name",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "RoomName",
        "Email",
        "Password",
        "ConfirmPassword"
      ]
    },
    {
      "cells": [
        "Baraak",
        "Obama",
        "100USAaPresidentObama124",
        "199barakobamausmm@persivia.com",
        "P@k12345",
        "P@k12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register with Same Room Name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user navigate to the SingUp Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingUP_Steps.navigate_to_the_SignuPpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill his Baraak",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_enters_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user filled Obama",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_enters_lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Set his 100USAaPresidentObama124",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_set_roomname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered his 199barakobamausmm@persivia.com",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_set_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user placed his P@k12345",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_set_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Confirmed his P@k12345",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_confirms_passowrds(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Clicks on the i agree button",
  "keyword": "When "
});
formatter.match({
  "location": "SingUP_Steps.user_agree_terms_Conditions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the SingUP button",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_clicks_on_Singup_btton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user profile will not be created",
  "keyword": "Then "
});
formatter.match({
  "location": "SingUP_Steps.Profile_is_not_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will see the error on the Room name",
  "keyword": "And "
});
formatter.match({
  "location": "SingUP_Steps.user_see_errors()"
});
formatter.result({
  "status": "passed"
});
});