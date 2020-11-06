Feature: Select Product item and login into user Account
  
  Background:
  Given Iam on Home page

  Scenario: Select Product item from category pages
    When I will click on NewIn menu on header And click on NewBlouse menu
    Then I will go to Blouses page

  Scenario Outline: Login into Customer Account
    When I will enter"<user>" and "<pass>"
    Then Iam in Account page

    Examples: 
      | user                    | pass        |
      | raja                    | kumara      |
      | jo.pamarthi19@gmail.com | Sreedevi@19 |
