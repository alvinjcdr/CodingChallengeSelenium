@RegressionSuite
Feature: Home page validation

  Background:
    Given user navigate to ABN Lookup Website

  @SearchABN
  Scenario: Verify ABN Search
    #click Search without any search entry
    When user clicks the Search icon
    Then verify that "Search text required" text is displayed
    When user clicks 'Home' link
    Then verify ABN Lookup homepage is loaded
    #Search for a valid ABN entry
    When user type "File" in search bar
    And user clicks the Search icon
    Then verify that "Search results - active ABNs and names" text is displayed
    And matching results for "File" is displayed on the result table
    When user clicks 'Home' link
    Then verify ABN Lookup homepage is loaded
    #Search for an invalid ABN entry
    When user type "zzzz" in search bar
    And user clicks the Search icon
    Then verify that "No matching names found" text is displayed
    When user clicks 'Home' link
    Then verify ABN Lookup homepage is loaded
    #Verify that searching with Special Character is allowed
    When user type "!#@#$" in search bar
    And user clicks the Search icon
    Then verify that "Search results - active ABNs and names" text is displayed
    When user clicks 'Home' link
    Then verify ABN Lookup homepage is loaded
    #Verify that searching with integers is allowed
    When user type "1234567890" in search bar
    And user clicks the Search icon
    Then verify that "Search results - active ABNs and names" text is displayed
    And close browser

  @HomePageLinks
  Scenario: Verify home page links
    When user clicks "ABN Lookup tools" link
    Then verify that "ABN Lookup tools" page is displayed
    When user clicks back in browser
    And user clicks "our help section" link
    Then verify that "Glossary" page is displayed
    When user clicks back in browser
    And user clicks "ABN Lookup web services" link
    Then verify that "Web services" page is displayed
    Then close browser

  @HomePageSections
  Scenario: Verify home page sections
    Then verify that "Australian Government" image is displayed
    And verify that "ABN Lookup" image is displayed
    And verify "system maintenance" is displayed in banner message
    And verify content introduction element is displayed
    And verify "Trading names will not be displayed from 1 November 2025" tips is displayed
    And verify "Update your ABN details" tips is displayed
    And verify "Did you know?" tips is displayed
    Then close browser
