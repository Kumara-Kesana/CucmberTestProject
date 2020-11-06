@Dropdown

Feature: Social site functionality

  Scenario Outline: Scenario test functionality
    
    Given Iam in facebook home page
    When I have given "<user>" and "<pass>"  
    Then I will login into my facebook account
    
        Examples:
      |user   |pass|
      |Jo     |Pamarthi|
      |kumara |raja    |

