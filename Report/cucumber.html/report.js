$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality of Adaction application",
  "description": "",
  "id": "booking-functionality-of-adaction-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": verify the user login to application",
  "description": "",
  "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user  enter the valid \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify home page navigate to search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;;1"
    },
    {
      "cells": [
        "AAA",
        "111"
      ],
      "line": 13,
      "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;;2"
    },
    {
      "cells": [
        "BBB",
        "222"
      ],
      "line": 14,
      "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;;3"
    },
    {
      "cells": [
        "manosh95",
        "manosh95"
      ],
      "line": 15,
      "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": ": verify the user login to application",
  "description": "",
  "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"AAA\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user  enter the valid \"111\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify home page navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 4948416481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 205476854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 383243457,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 595641643,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_home_page_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 38120,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": ": verify the user login to application",
  "description": "",
  "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"BBB\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user  enter the valid \"222\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify home page navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 483644798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 156752868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 165503011,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 532862886,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_home_page_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 26391,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": ": verify the user login to application",
  "description": "",
  "id": "booking-functionality-of-adaction-application;:-verify-the-user-login-to-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"manosh95\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user  enter the valid \"manosh95\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify home page navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 332302611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manosh95",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 119520775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manosh95",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 113782160,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 865046248,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_home_page_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 25413,
  "status": "passed"
});
});