@RegressionSuite
Feature: Tools and Resources validation

  Background:
    Given user navigate to ABN Lookup Website

  @VerifyToolsAndResources
  Scenario Outline: Verify tools and resources sub menus
    When user hovers to "<mainMenu>" and go to "<subMenu>" page
    Then verify that "<subMenu>" page is displayed
    And close browser
    Examples:
      | mainMenu          | subMenu                     |
      | Tools & resources | Web services                |
      | Tools & resources | ABN Lookup tools            |
      | Tools & resources | Deductible gift recipients  |
      | Tools & resources | ATO app                     |
      | Tools & resources | Quick links                 |
      | Tools & resources | Bulk extract                |
      | Tools & resources | ABN refresh                 |