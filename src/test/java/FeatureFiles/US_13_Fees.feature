Feature: Fee Create and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Create and delete a Nationalities
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput       | <Name>            |
      | codeInput       | <Code>            |
      | integrationCode | <IntegrationCode> |
      | priorityCode    | <Priority>        |

    And Click on the element in the Dialog content
      | toggleBar       |
      | saveCloseButton |

    Then Success message should be displayed

    When User delete item from Dialog
      | <Name> |

    Then Success message should be displayed

    Examples:
      | Name        | Code  | IntegrationCode | Priority |
      | Hasan Demir | P1111 | paypal          | 11       |
      | Kemal Ak    | G2222 | googlePay       | 22       |
