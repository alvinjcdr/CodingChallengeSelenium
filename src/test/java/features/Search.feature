@RegressionSuite
Feature: Search page validation

  Background:
    Given user navigate to ABN Lookup Website

  @SearchPageScenario
  Scenario: Verify Search Menu
    #Verify Advance Search
    When user hovers to search and go to Advance Search page
    Then verify that "Advanced search" page is displayed
    #click Search without any search entry
    When user clicks the Search button
    Then verify that "Insufficient search criteria" text is displayed
    #Search for a valid ABN entry
    When user type "File" in the advance search
    And user clicks the Search button
    Then verify that "Search results - active ABNs and names" text is displayed
    And matching results for "File" is displayed on the result table
    #Search for an invalid ABN entry
    When user hovers to search and go to Advance Search page
    And user type "zzzz" in the advance search
    And user clicks the Search button
    Then verify that "No matching names found" text is displayed
    #Verify that searching with Special Character is allowed
    When user hovers to search and go to Advance Search page
    And user type "!#@#$" in the advance search
    And user clicks the Search button
    Then verify that "Search stopped" text is displayed
    #Verify that searching with integers is allowed
    When user hovers to search and go to Advance Search page
    And user type "1234567890" in the advance search
    And user clicks the Search button
    Then verify that "Search results - active ABNs and names" text is displayed
    #Verify Statistical query
    When user hovers to search and go to Statistical query page
    Then verify that "Statistical query" page is displayed
    When user clicks the Search button
    Then verify that "ABN Statistics" page is displayed
    And verify "system maintenance" is displayed in banner message
    And close browser
