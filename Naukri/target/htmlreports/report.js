$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/chaithanya/eclipse-project/Naukri/src/main/java/feature/test.feature");
formatter.feature({
  "line": 1,
  "name": "Naukri Website",
  "description": "",
  "id": "naukri-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to the Naukri",
  "description": "",
  "id": "naukri-website;login-to-the-naukri",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@TC01_Naukri"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user launch the naukri application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the valid username",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user will enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Step.user_launch_the_naukri_application()"
});
formatter.result({
  "duration": 39187250500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.user_enters_the_valid_username()"
});
formatter.result({
  "duration": 2209107500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.user_will_enter_password()"
});
formatter.result({
  "duration": 668411000,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 6961284700,
  "status": "passed"
});
});