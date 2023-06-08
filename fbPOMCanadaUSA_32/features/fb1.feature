@fb
Feature: Different pages of FB

  Scenario Outline: As a user I want to check fb home & create account page
    Given I am in home page of "https://www.facebook.com/"
    When I click on clickOnCreateNewAccount
    And I enter "<firstName>" and "<lastName>" and "<mobile>" and "<password>"
    And select "<year>" and "<month>" and "<day>"
    Then I click on "<gender>"

    Examples: 
      | firstName | lastName | mobile   | password | year | month | day | gender |
      | Rahat     | Khan     | 87678878 | hgvg54   | 1960 | Dec   |  12 | Male   |