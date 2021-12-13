$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles2/ForgotPassword2.feature");
formatter.feature({
  "name": "",
  "description": "To validate forgotten password functionality of facebook app",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@forgot"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To validate forgotten password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@forgot"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click forgotten password button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_forgotten_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter email or phoneno",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email_or_phoneno()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles2/Login2.feature");
formatter.feature({
  "name": "To Validate Login Functionality of Facebook Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "To Validate login by using valid email and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter valid Email and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "karthi"
      ]
    },
    {
      "cells": [
        "password",
        "1234567"
      ]
    },
    {
      "cells": [
        "email",
        "karthieie27@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_valid_Email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach invaild credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_invaild_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate login by using invalid email and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter invalid emailadd and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "username1",
        "password1"
      ]
    },
    {
      "cells": [
        "karthieie27912@gmail.com",
        "12345678",
        "selenium",
        "12345678"
      ]
    },
    {
      "cells": [
        "python",
        "1234567",
        "selenium",
        "12345678"
      ]
    },
    {
      "cells": [
        "java",
        "1234567",
        "seleniuma",
        "123456789"
      ]
    },
    {
      "cells": [
        "Augular",
        "1234567",
        "selenium",
        "12345678"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_emailadd_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach invaild credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_invaild_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});