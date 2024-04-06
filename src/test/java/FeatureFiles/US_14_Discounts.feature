Feature: Discounts Create and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Create and delete a Discounts
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | description     | <Description>     |
      | integrationCode | <IntegrationCode> |
      | priorityCode    | <Priority>        |

    And Click on the element in the Dialog content
      | toggleBar       |
      | saveCloseButton |

    Then Success message should be displayed


    When User delete the "<Description>" in the Dialog content

    Then Success message should be displayed

    Examples:
      | Description | IntegrationCode | Priority |
      | Beginner    | BG              | 1        |
      | Global      | GL              | 2        |
