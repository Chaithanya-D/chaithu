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
  "duration": 48678153100,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.user_enters_the_valid_username()"
});
formatter.result({
  "duration": 10060312200,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.user_will_enter_password()"
});
formatter.result({
  "duration": 453816900,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 3366452300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Test logout",
  "description": "",
  "id": "naukri-website;test-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@TC02_Naukri"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Open chrome and naukri application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user  will be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "select logout option",
  "keyword": "Then "
});
formatter.match({
  "location": "Logout_Step.open_chrome_and_naukri_application()"
});
formatter.result({
  "duration": 26662935900,
  "status": "passed"
});
formatter.match({
  "location": "Logout_Step.user_enters_username_and_password()"
});
formatter.result({
  "duration": 10362727200,
  "status": "passed"
});
formatter.match({
  "location": "Logout_Step.user_will_be_able_to_login()"
});
formatter.result({
  "duration": 218561300,
  "status": "passed"
});
formatter.match({
  "location": "Logout_Step.select_logout_option()"
});
formatter.result({
  "duration": 3353247100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search a job",
  "description": "",
  "id": "naukri-website;search-a-job",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@TC03_Naukri"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Open the browser and start url",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user can click on the job",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "enter the  job and location fields",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "select search field",
  "keyword": "Then "
});
formatter.match({
  "location": "searchjob_stepdefinition.open_the_browser_and_start_url()"
});
formatter.result({
  "duration": 22140149100,
  "status": "passed"
});
formatter.match({
  "location": "searchjob_stepdefinition.user_can_click_on_the_job()"
});
formatter.result({
  "duration": 548435600,
  "status": "passed"
});
formatter.match({
  "location": "searchjob_stepdefinition.enter_the_job_and_location_fields()"
});
formatter.result({
  "duration": 1013200700,
  "status": "passed"
});
formatter.match({
  "location": "searchjob_stepdefinition.select_search_field()"
});
formatter.result({
  "duration": 250532900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "apply for job in naukri",
  "description": "",
  "id": "naukri-website;apply-for-job-in-naukri",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@TC04_Naukri"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "lauch browser and start app",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "enter the valid credentials username and password",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "view the required job",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "apply for it",
  "keyword": "Then "
});
formatter.match({
  "location": "Applyjob_step.lauch_browser_and_start_app()"
});
formatter.result({
  "duration": 27680508500,
  "status": "passed"
});
formatter.match({
  "location": "Applyjob_step.enter_the_valid_credentials_username_and_password()"
});
formatter.result({
  "duration": 1440100000,
  "status": "passed"
});
formatter.match({
  "location": "Applyjob_step.view_the_required_job()"
});
formatter.result({
  "duration": 4891738100,
  "status": "passed"
});
formatter.match({
  "location": "Applyjob_step.apply_for_it()"
});
formatter.result({
  "duration": 13083363900,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "profile update test",
  "description": "",
  "id": "naukri-website;profile-update-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@TC05_Naukri"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "launch the chrome browser and the url",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "enter valid details such as username and password",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user selects the profile update option",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "verify the email",
  "keyword": "And "
});
formatter.match({
  "location": "Profileupdate_Step.launch_the_chrome_browser_and_the_url()"
});
formatter.result({
  "duration": 62752427600,
  "status": "passed"
});
formatter.match({
  "location": "Profileupdate_Step.enter_valid_details_such_as_username_and_password()"
});
formatter.result({
  "duration": 2976189800,
  "status": "passed"
});
formatter.match({
  "location": "Profileupdate_Step.user_selects_the_profile_update_option()"
});
formatter.result({
  "duration": 10796629800,
  "status": "passed"
});
formatter.match({
  "location": "Profileupdate_Step.verify_the_email()"
});
formatter.result({
  "duration": 63278492400,
  "status": "passed"
});
});