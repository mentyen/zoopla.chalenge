#Author: your.email@your.domain.com
@tag
Feature: TC_01 validating search box functionality

  Background: 
    Given I am on a home page
    Then I enter "London" in to the search box and hit enter

  @smoke
  Scenario: Validating a search box functionality
 
    Then I will print all prices in descending order

  @smoke1
  Scenario: Validating a correct agent information
    Then I select 5 property from the list and click
    Then I click on a agent name and verify that its maching expected
