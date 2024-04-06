Feature: Salary Types Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Create, edit and delete a Salary Types
    And Click on the element in the left Nav
      | humanResources |
      | salary         |
      | salaryTypes    |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | <Name> |

    And Click on the element in the Dialog content
      | salaryUserType |
      | option         |
      | saveButton     |

    Then Success message should be displayed


    When User edit item from Dialog
      | <Name> | <NewName> |

    Then Success message should be displayed


    When User delete item from Dialog
      | <NewName> |

    Then Success message should be displayed

    Examples:
      | Name      | NewName   |
      | Full Time | Part Time |