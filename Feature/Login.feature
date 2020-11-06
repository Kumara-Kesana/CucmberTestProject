@RegressionPack 

Feature: Test Login Functionality

  Background: Navigate to BestofasseenonTV site
    Given I am on Home page

  Scenario Outline: Item Select
    When I search "<productname>"
    Then I will get that related product displayed

    Examples: 
      | productname     |
      | Embark Pensions |
