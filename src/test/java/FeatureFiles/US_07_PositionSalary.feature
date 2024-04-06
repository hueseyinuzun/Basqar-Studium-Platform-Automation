Feature: Position Salary Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression
  Scenario Outline: Create, edit and delete a Position Salary
    And Click on the element in the left Nav
      | humanResources |
      | salary         |
      | positionSalary |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | <Name> |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


    When User edit item from Dialog
      | <Name> | <NewName> |

    Then Success message should be displayed


    When User delete item from Dialog
      | <NewName> |

    Then Success message should be displayed

    Examples:
      | Name   | NewName     |
      | Tester | Development |
