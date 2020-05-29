$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/FeatureFile2.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginUser.user_opens_the_browser()"
});
formatter.result({
  "duration": 10796083800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "New user registration",
  "description": "",
  "id": "title-of-your-feature;new-user-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "navigates to the RegisterPage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters valid data",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User is successfully logged into the system",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User successfully logout from the application",
  "keyword": "And "
});
formatter.match({
  "location": "NewUserRegister.navigates_to_the_RegisterPage()"
});
formatter.result({
  "duration": 11240551100,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegister.user_enters_valid_data()"
});
formatter.result({
  "duration": 6019180000,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegister.user_is_successfully_logged_into_the_system()"
});
formatter.result({
  "duration": 1739815100,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegister.user_successfully_logout_from_the_application()"
});
formatter.result({
  "duration": 3613935400,
  "status": "passed"
});
formatter.after({
  "duration": 1278441200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Login with valid Credentials",
  "description": "",
  "id": "title-of-your-feature;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "navigates to the LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User Login Successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 21,
      "id": "title-of-your-feature;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Admin_1",
        "Admin_1"
      ],
      "line": 22,
      "id": "title-of-your-feature;login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginUser.user_opens_the_browser()"
});
formatter.result({
  "duration": 7554576000,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Login with valid Credentials",
  "description": "",
  "id": "title-of-your-feature;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@tag2"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "navigates to the LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters \"Admin_1\" and \"Admin_1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginUser.navigates_to_the_LoginPage()"
});
formatter.result({
  "duration": 4274353000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin_1",
      "offset": 13
    },
    {
      "val": "Admin_1",
      "offset": 27
    }
  ],
  "location": "LoginUser.user_enters_and(String,String)"
});
formatter.result({
  "duration": 3123814300,
  "status": "passed"
});
formatter.match({
  "location": "LoginUser.user_Login_Successfully()"
});
formatter.result({
  "duration": 10038137300,
  "status": "passed"
});
formatter.after({
  "duration": 1256388500,
  "status": "passed"
});
});