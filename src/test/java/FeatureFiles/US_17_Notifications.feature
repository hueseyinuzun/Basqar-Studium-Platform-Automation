Feature: Notifications Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Create, edit and delete a Notifications
    And Click on the element in the left Nav
      | messaging     |
      | notifications |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | <Name> |

    And Click on the element in the Dialog content
      | searchSelect |
      | option       |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


    And Click on the element in the left Nav
      | dashboard     |
      | messaging     |
      | notifications |


    When User edit item from Dialog
      | <Name> | <NewName> |

    Then Success message should be displayed



    And Click on the element in the left Nav
      | dashboard     |
      | messaging     |
      | notifications |

    When User delete item from Dialog
      | <NewName> |

    Then Success message should be displayed

    Examples:
      | Name          | NewName       |
      | Faruk1        | Halit         |
      | Dictionaries1 | Encyclopedias |