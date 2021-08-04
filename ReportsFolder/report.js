$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Regression/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with correct credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_navigate_to_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.User_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user will nevigate to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_nevigate_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with incorrect credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user will see the authentication message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "weqw",
        "sadasd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with incorrect credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_lands_on_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters weqw and sadasd",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enters_username_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.User_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user will see the authentication message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_see_authentication_message()"
});
formatter.result({
  "status": "passed"
});
});