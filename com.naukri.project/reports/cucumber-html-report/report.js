$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DELL/eclipse-seleniumproject/com.naukri.project/features1/naukrifeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Test Scenarios of Naukri",
  "description": "",
  "id": "test-scenarios-of-naukri",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test Login with valid credentials such as username and password",
  "description": "",
  "id": "test-scenarios-of-naukri;test-login-with-valid-credentials-such-as-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@TC1_Naukri"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open browser and start application naukri",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the  \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "select login",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "test-scenarios-of-naukri;test-login-with-valid-credentials-such-as-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "test-scenarios-of-naukri;test-login-with-valid-credentials-such-as-username-and-password;;1"
    },
    {
      "cells": [
        "jayanthimala.p27@gmail.com",
        "jaya@1234"
      ],
      "line": 11,
      "id": "test-scenarios-of-naukri;test-login-with-valid-credentials-such-as-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test Login with valid credentials such as username and password",
  "description": "",
  "id": "test-scenarios-of-naukri;test-login-with-valid-credentials-such-as-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@TC1_Naukri"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open browser and start application naukri",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the  jayanthimala.p27@gmail.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter jaya@1234",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "select login",
  "keyword": "Then "
});
formatter.match({
  "location": "loginpage_stepdefinition.open_browser_and_start_application_naukri()"
});
formatter.result({
  "duration": 35270124749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jayanthimala.p27@gmail.com",
      "offset": 11
    }
  ],
  "location": "loginpage_stepdefinition.enter_the(String)"
});
formatter.result({
  "duration": 1921347373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaya@1234",
      "offset": 11
    }
  ],
  "location": "loginpage_stepdefinition.user_enter(String)"
});
formatter.result({
  "duration": 107095377,
  "status": "passed"
});
formatter.match({
  "location": "loginpage_stepdefinition.select_login()"
});
formatter.result({
  "duration": 8036819369,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Test logout",
  "description": "",
  "id": "test-scenarios-of-naukri;test-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@TC2_Naukri"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Open chrome and start naukri application",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user must able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user selects logout",
  "keyword": "Then "
});
formatter.match({
  "location": "logout_stepdefinition.open_chrome_and_start_naukri_application()"
});
formatter.result({
  "duration": 42622724749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 18
    },
    {
      "val": "password",
      "offset": 31
    }
  ],
  "location": "logout_stepdefinition.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 2857534786,
  "status": "passed"
});
formatter.match({
  "location": "logout_stepdefinition.user_must_able_to_login()"
});
formatter.result({
  "duration": 114743644,
  "status": "passed"
});
formatter.match({
  "location": "logout_stepdefinition.user_selects_logout()"
});
formatter.result({
  "duration": 11349959958,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Test search for job",
  "description": "",
  "id": "test-scenarios-of-naukri;test-search-for-job",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@TC3_Naukri"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Open the browser and start url",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user selects the required search field",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "enter the  job and location fields",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "select search field",
  "keyword": "Then "
});
formatter.match({
  "location": "searchjob_stepdefinition.open_the_browser_and_start_url()"
});
formatter.result({
  "duration": 38913955105,
  "status": "passed"
});
formatter.match({
  "location": "searchjob_stepdefinition.user_selects_the_required_search_field()"
});
formatter.result({
  "duration": 478127337,
  "status": "passed"
});
formatter.match({
  "location": "searchjob_stepdefinition.enter_the_job_and_location_fields()"
});
formatter.result({
  "duration": 324929779,
  "status": "passed"
});
formatter.match({
  "location": "searchjob_stepdefinition.select_search_field()"
});
formatter.result({
  "duration": 437606171,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "profile update test",
  "description": "",
  "id": "test-scenarios-of-naukri;profile-update-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@TC4_Naukri"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch the chrome browser and the url",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "enter valid details such as username and password",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user selects the profile update option",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "verify the email",
  "keyword": "And "
});
formatter.match({
  "location": "Profileupdate_stepdefinition.launch_the_chrome_browser_and_the_url()"
});
formatter.result({
  "duration": 31184058332,
  "status": "passed"
});
formatter.match({
  "location": "Profileupdate_stepdefinition.enter_valid_details_such_as_username_and_password()"
});
formatter.result({
  "duration": 1501388929,
  "status": "passed"
});
formatter.match({
  "location": "Profileupdate_stepdefinition.user_selects_the_profile_update_option()"
});
formatter.result({
  "duration": 41715870042,
  "status": "passed"
});
formatter.match({
  "location": "Profileupdate_stepdefinition.verify_the_email()"
});
formatter.result({
  "duration": 7023187586,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "appplying for job in naukri",
  "description": "",
  "id": "test-scenarios-of-naukri;appplying-for-job-in-naukri",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@TC5_Naukri"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "lauch browser and start app",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "enter the valid credentials username and password",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "view the required job",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "apply for it",
  "keyword": "Then "
});
formatter.match({
  "location": "applyjob_stepdefinition.lauch_browser_and_start_app()"
});
formatter.result({
  "duration": 37658597900,
  "status": "passed"
});
formatter.match({
  "location": "applyjob_stepdefinition.enter_the_valid_credentials_username_and_password()"
});
formatter.result({
  "duration": 406783911,
  "status": "passed"
});
formatter.match({
  "location": "applyjob_stepdefinition.view_the_required_job()"
});
formatter.result({
  "duration": 6328900792,
  "status": "passed"
});
formatter.match({
  "location": "applyjob_stepdefinition.apply_for_it()"
});
formatter.result({
  "duration": 16808151808,
  "status": "passed"
});
});