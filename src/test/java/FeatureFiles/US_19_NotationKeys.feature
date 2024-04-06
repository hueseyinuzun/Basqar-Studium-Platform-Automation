Feature: Notation Keys Create and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Create and delete a Notation Keys
    And Click on the element in the left Nav
      | humanResources |
      | salary         |
      | notationKeys   |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | notationName       | <Name>       |
      | notationShortName  | <Short Name> |
      | notationMultiplier | <Multiplier> |

    And Click on the element in the Dialog content
      | applyButton |

    Then Success message should be displayed


    When User delete item from Dialog
      | <Name> |

    Then Success message should be displayed

    Examples:
      | Name  | Short Name | Multiplier |
      | Faruk | Fr         | 35         |
      | Kemal | Km         | 17         |