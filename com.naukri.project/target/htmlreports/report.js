$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DELL/eclipse-seleniumproject/com.naukri.project/features1/naukrifeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Test Scenarios of Naukri",
  "description": "",
  "id": "test-scenarios-of-naukri",
  "keyword": "Feature"
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
  "duration": 9489766629,
  "status": "passed"
});
formatter.match({
  "location": "applyjob_stepdefinition.enter_the_valid_credentials_username_and_password()"
});
formatter.result({
  "duration": 835290017,
  "status": "passed"
});
formatter.match({
  "location": "applyjob_stepdefinition.view_the_required_job()"
});
formatter.result({
  "duration": 3336367066,
  "status": "passed"
});
formatter.match({
  "location": "applyjob_stepdefinition.apply_for_it()"
});
formatter.result({
  "duration": 7816195024,
  "status": "passed"
});
});