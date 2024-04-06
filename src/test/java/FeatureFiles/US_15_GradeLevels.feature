Feature: GradeLevels Create and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

    And Click on the element in the left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |

  Scenario Outline: Create a GradeLevels
    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput      | <Name>      |
      | shortNameInput | <ShortName> |
      | order          | <Order>     |

    And Click on the element in the Dialog content
      | searchSelect |
      | option       |
      | active       |
      | saveButton   |

    Then Success message should be displayed

    Examples:
      | Name        | ShortName | Order |
      | Campus Team | CTeam     | 2     |
      | Basqar Team | BTeam     | 2     |

  Scenario Outline: Delete a GradeLevels

    And Click on the element in the Dialog content
      | refresh    |
      | role       |
      | roleOption |

    When User delete the "<Name>" in the Dialog content

    Then Success message should be displayed

    Examples:
      | Name        |
      | Campus Team |
      | Basqar Team |

