@RegressionSuite
Feature: Header and Footer links

  Background:
    Given user navigate to ABN Lookup Website

  @VerifyHeaderLinks
  Scenario Outline: Verify that when user clicks <Link> link on the header then <Page> page will be displayed
    When user clicks "<Link>" in header
    Then verify that "<Page>" page is displayed
    And close browser
    Examples:
      | Link              | Page               |
      | Home              | ABN Lookup         |
      | Search            | Search             |
      | Tools & resources | Tools & resources  |
      | Help              | Help               |


  @VerifyFooterLinks
  Scenario Outline: Verify that when user clicks <Link> link on the footer then <Page> page will be displayed
    When user clicks "<Link>" in footer
    Then verify that "<Page>" page is displayed
    And close browser

    Examples:
      | Link                | Page             |
      | About us            | About us         |
      | Contact us          | Contact us       |
      | Legal notices       | Legal notices    |
      | Disclaimer          | Disclaimer       |
      | Accessibility       | Accessibility    |
      | Other languages     | Other languages  |
      | Site map            | Site map         |
