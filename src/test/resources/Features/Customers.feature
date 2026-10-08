Feature: scenarios related to customers

  @userReg
  Scenario: to test the functionality of submit button for valid input
    Given I am on user registration page
    When I Enter Below data
      | Rahul | Sharma | rahul.sharma@testmail.com | 9876543210 | Flat 302, Sunshine Apartments, Kothrud | Pune | Maharashtra | 411038 | India | Test@1234 |
    And I click on submit button
    Then User should be added

    @joinCommunity
  Scenario Outline: to test the submit button of join community form
    Given I am on Join community page
    When I enter <name> , <email> , <contact> , <city>
    And I click on submit button for Join community page
    Then user should be joined
    Examples:
      | name         | email                     | contact    | city      |
      | Rahul Sharma | rahul.sharma@testmail.com | 9876543210 | Pune      |
      | Priya Patil  | priya.patil@testmail.com  | 9823456781 | Mumbai    |
      | Amit Verma   | amit.verma@testmail.com   | 9765432109 | Delhi     |
      | Sneha Iyer   | sneha.iyer@testmail.com   | 9898123456 | Chennai   |
      | Karan Mehta  | karan.mehta@testmail.com  | 9712345678 | Bengaluru |