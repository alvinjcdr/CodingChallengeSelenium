@RegressionSuite
Feature: Help validation

  Background:
    Given user navigate to ABN Lookup Website

  @VerifyHelpOptions
  Scenario Outline: Verify Help sub menus
    When user hovers to "<mainMenu>" and go to "<subMenu>" page
    Then verify that "<subMenu>" page is displayed
    And close browser
    Examples:
      | mainMenu   | subMenu                     |
      | Help       | Update your ABN details     |
      | Help       | Frequently asked questions  |
      | Help       | Glossary                    |
      | Help       | Charitable tax concessions  |
      | Help       | Search tips                 |
      | Help       | Entity types                |
      | Help       | Government agencies         |