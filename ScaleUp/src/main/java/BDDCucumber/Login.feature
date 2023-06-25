Feature: Test the login function

  Scenario Outline: Test the multiple user logins
    Given I login to web application
    When user is authenticated
    And user is having username as <username>
    And User is having the valid password <password>
    Then user logged in to web app
    Examples:
      | username | password |
      |          |          |