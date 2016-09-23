
@login
Feature: Login

  Background:
    Given I navigate to banking app

  Scenario: Login to Guru99 banking app
    When I enter my valid userid and password
    And I try to login to the banking app
    Then I should be logged in successfully