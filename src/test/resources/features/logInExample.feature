@SmokeTest
Feature: User login example
  User Story : As a user, I should be able to login the page with valid credentials
  from librarian and user accounts.



  Scenario:
    Given user is on the homepage
    When user enters valid username
    And user enters valid password
    Then user logs in the web page


  Scenario:
    When  librarian is on the homepage
    And librarian enters valid username
    Then librarian enters valid password
    Then librarian logs in the dashboard page




