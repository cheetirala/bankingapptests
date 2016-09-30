@logout

Feature: Logout
  Background:
    Given I navigate to banking app

  Scenario: Logout from Guru99 banking app
    Given I logged into banking app
    When I would like to logout from banking app
    And accept the alert that is displayed
    Then I should be logged out successfully