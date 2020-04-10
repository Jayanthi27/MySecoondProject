Feature: Test Scenarios of Naukri
    @TC1_Naukri
    Scenario Outline: Test Login with valid credentials such as username and password
    Given Open browser and start application naukri
    When Enter the  <username>
    Then User Enter <password>
    Then select login

      Examples:
      |username                  |password |
      |jayanthimala.p27@gmail.com|jaya@1234|
  
    @TC2_Naukri
    Scenario: Test logout
    Given Open chrome and start naukri application
    When User enters valid username and password
    Then user must able to login
    Then user selects logout
	
    @TC3_Naukri 
    Scenario: Test search for job 
	Given Open the browser and start url 
	When user selects the required search field 
	Then enter the  job and location fields 
	Then select search field 
 
    @TC4_Naukri
    Scenario: profile update test
    Given launch the chrome browser and the url
    When enter valid details such as username and password
    Then user selects the profile update option
    And verify the email
    
    @TC5_Naukri
    Scenario: appplying for job in naukri
    Given lauch browser and start app
    When enter the valid credentials username and password
    Then view the required job
    Then apply for it