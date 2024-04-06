Feature: Locations Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

  Scenario: Create a Locations
    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput      | B107 |
      | shortNameInput | A107 |
      | capacity       | 10   |

    And Click on the element in the Dialog content
      | searchSelect |
      | option       |
      | saveButton   |

    Then Success message should be displayed


  Scenario: Same locations checkout
    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput      | B107 |
      | shortNameInput | A107 |
      | capacity       | 10   |

    And Click on the element in the Dialog content
      | searchSelect |
      | option       |
      | saveButton   |

    Then Already exist message should be displayed


  Scenario: Editing the resulting location
    And Click on the element in the Dialog content
      | editButton |

    And User sending the keys in the Dialog content
      | nameInput      | B107 |
      | shortNameInput | C107 |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


  Scenario: Delete last locations
    And Click on the element in the Dialog content
      | deleteButton       |
      | deleteDialogButton |

    Then Success message should be displayed




