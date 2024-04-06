Feature: Departments Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | departments |

  Scenario: Create a Departments
    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | Mathe |
      | codeInput | M107  |

    And Click on the element in the Dialog content
      | saveButton   |

    Then Success message should be displayed



  Scenario: Edit Departments Categories
    And Click on the element in the Dialog content
      | editButton |

    And User sending the keys in the Dialog content
      | nameInput      | Mathe |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


  Scenario: Delete last Departments
    And Click on the element in the Dialog content
      | deleteButton       |
      | deleteDialogButton |

    Then Success message should be displayed




