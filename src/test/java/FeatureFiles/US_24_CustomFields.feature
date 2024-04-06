Feature: Custom Fields Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | customFields |

  Scenario Outline: Create a Custom Fields
    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | <Name> |
      | codeInput | <Code> |

    And Click on the element in the Dialog content
      | searchSelect |
      | option       |
      | saveButton   |

    Then Success message should be displayed


    When User edit item from Dialog
      | <Name> | <NewName> |

    Then Success message should be displayed


    When User delete item from Dialog
      | <NewName> |

    Then Success message should be displayed

    Examples:
      | Name  | Code | NewName |
      | Faruk | F105 | Kenan   |
      | Senay | S007 | Zeynep  |




