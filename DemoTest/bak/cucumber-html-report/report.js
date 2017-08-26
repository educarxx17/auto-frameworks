$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "As a customer",
  "description": "I want to try login or Sign in",
  "id": "as-a-customer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 3177234498,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ExpertStepDefs.setUp()"
});
formatter.result({
  "duration": 47980538437,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Log in page validation messages",
  "description": "",
  "id": "as-a-customer;log-in-page-validation-messages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I select login link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tried to login with incorrect details",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can see why my login failed",
  "keyword": "Then "
});
formatter.match({
  "location": "ExpertStepDefs.goes_to_login_page()"
});
formatter.result({
  "duration": 14804760154,
  "status": "passed"
});
formatter.match({
  "location": "ExpertStepDefs.login_with_incorrect_details()"
});
formatter.result({
  "duration": 134094621,
  "status": "passed"
});
formatter.match({
  "location": "ExpertStepDefs.login_page_validations()"
});
formatter.result({
  "duration": 1124587626,
  "status": "passed"
});
formatter.after({
  "duration": 2128919150,
  "status": "passed"
});
formatter.before({
  "duration": 2250739414,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ExpertStepDefs.setUp()"
});
formatter.result({
  "duration": 42347821950,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Sign up page user accounts",
  "description": "",
  "id": "as-a-customer;sign-up-page-user-accounts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I select sign up link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter my details",
  "rows": [
    {
      "cells": [
        "email",
        "firstName",
        "lastName"
      ],
      "line": 20
    },
    {
      "cells": [
        "amail.com",
        "fname",
        "lname"
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I agree to the terms for hire",
  "keyword": "Then "
});
formatter.match({
  "location": "ExpertStepDefs.i_select_signup_link()"
});
formatter.result({
  "duration": 28632489073,
  "status": "passed"
});
formatter.match({
  "location": "ExpertStepDefs.i_enter_details(MyDetails\u003e)"
});
formatter.result({
  "duration": 964127969,
  "status": "passed"
});
formatter.match({
  "location": "ExpertStepDefs.i_agree_to_the_terms_for_hire()"
});
formatter.result({
  "duration": 1250619094,
  "status": "passed"
});
formatter.after({
  "duration": 2043201743,
  "status": "passed"
});
formatter.uri("Services.feature");
formatter.feature({
  "line": 2,
  "name": "As a customer",
  "description": "I want to see the services offered by Expert360",
  "id": "as-a-customer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke,"
    },
    {
      "line": 1,
      "name": "@services"
    }
  ]
});
formatter.before({
  "duration": 2215804771,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "View services offered by Expert360",
  "description": "",
  "id": "as-a-customer;view-services-offered-by-expert360",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select services link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see services on offer",
  "keyword": "Then "
});
formatter.match({
  "location": "ExpertStepDefs.setUp()"
});
formatter.result({
  "duration": 54526501996,
  "status": "passed"
});
formatter.match({
  "location": "ExpertStepDefs.goes_to_services_page()"
});
formatter.result({
  "duration": 11125357334,
  "status": "passed"
});
formatter.match({
  "location": "ExpertStepDefs.he_can_see_services_on_offer()"
});
formatter.result({
  "duration": 314225334,
  "status": "passed"
});
formatter.after({
  "duration": 2059245277,
  "status": "passed"
});
});