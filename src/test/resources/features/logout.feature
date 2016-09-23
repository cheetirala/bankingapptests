@logout

Feature: Logout

  Scenario: Logout from Guru99 banking app
    Given I navigate to banking app
    And logged into banking app
    When I would like to logout from banking app
    And accept the alert that displayed
    Then I should be logged out successfully