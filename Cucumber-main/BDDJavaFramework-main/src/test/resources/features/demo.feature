@Guidewire-logins
Feature:Guidewire policy login
  @Test12
 Scenario Outline: : Validate Successful Login
    When user logged into application with valid <username>
    And user logged into application with valid <password>
    Then click on the login button
Examples:
      | username  | password     |
      | su  | gw     |


