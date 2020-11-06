@RegressionPack
@Facebook

Feature: Icici account login functionality

  Scenario Outline: Icici login account functionality
    Given Iam in icici home page
    When I will enter "<Username>" and "<Password>"
    Then I will login into account

    Examples: 
      | Username      |  | Password |
      | ganesh.uppala |  | abc12345 |
      | jo.pamarthi   |  | jo1234   |
