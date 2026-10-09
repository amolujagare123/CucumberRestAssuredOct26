Feature: all login scenarios

  Background: this is background
    Given i open browser
    When i maximize it

  @valid @login
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
  #  When I enter correct username and password
    When I enter username as "admin" and password as "admin123"
    And I click on login button
    Then I should reach to home page


    @invalid @login
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
   # When I enter incorrect username and password
      When I enter username as "some-invalid-username" and password as "some-invalid-password"
      And I click on login button
    Then I should get an error


      @blank @invalid @login
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
   # When I enter blank username and password
        When I enter username as "" and password as ""

        And I click on login button
    Then I should get an error

