@login @android
Feature: Calculator Menu

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to calculator menu

  @test @positive
  Scenario: User successfully performed addition operation verification
    And user input Angka 1 "1"
    And user input Angka 2 "2"
    And user click addition symbol
    And user click button equals
    Then user successfully do it

  Scenario: User successfully performed subtraction operation verification
    And user input Angka 1 "10"
    And user input Angka 2 "2"
    And user click subtraction symbol
    And user click button equals
    Then user successfully do subtraction

  Scenario: User successfully performed multiplication operation verification
    And user input Angka 1 "3"
    And user input Angka 2 "5"
    And user click multiplication symbol
    And user click button equals
    Then user successfully do multiplication

  Scenario: User successfully performed division operation verification
    And user input Angka 1 "4"
    And user input Angka 2 "2"
    And user click division symbol
    And user click button equals
    Then user successfully do division

  Scenario: User do long press
    And user do long press

  Scenario: User do tap multiple times
    And user do tap multiple times
