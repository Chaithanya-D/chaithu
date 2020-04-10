Feature: Naukri Website
@TC01_Naukri
Scenario: Login to the Naukri
Given user launch the naukri application
Then user enters the valid username
Then user will enter password
And click on the login button user nagivate to the next page

@TC02_Naukri
Scenario: Test logout
Given Open chrome and naukri application
When User enters username and password
Then user  will be able to login
Then select logout option
    
@TC03_Naukri
Scenario: Search a job
Given Open the browser and start url
Then user can click on the job
Then enter the  job and location fields
Then select search field 
    
@TC04_Naukri
Scenario: apply for job in naukri
Given lauch browser and start app
When enter the valid credentials username and password
Then view the required job
Then apply for it
 
@TC05_Naukri
 Scenario: profile update test
    Given launch the chrome browser and the url
    When enter valid details such as username and password
    Then user selects the profile update option
    And verify the email