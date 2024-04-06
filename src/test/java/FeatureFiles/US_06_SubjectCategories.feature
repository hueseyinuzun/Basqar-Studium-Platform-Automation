Feature: Subject Categories Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  @SmokeTest
  Scenario Outline: Create, edit and delete a Subject Categories
    And Click on the element in the left Nav
      | education         |
      | educationSetup    |
      | subjectCategories |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | <Name> |
      | codeInput | <Code> |

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
      | Name        | Code | NewName              |
      | Disciplines | 007  | Economic disciplines |