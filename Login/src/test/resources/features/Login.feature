Feature: Login and update personal information

  Scenario: Login, update info, assign salary, interact with Buzz and logout
    Given the user is on the login page
    When the user logs in with valid credentials
    Then the personal information should be updated successfully
    When the user assigns a salary to the employee
    And the user interacts with the most popular post in Buzz
    And the user logs out from the application
