Feature: Cities Create Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Create and delete a Cities
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | cities     |

    And Click on the element in the Dialog content
      | addButton     |
      | countrySelect |
      | countryOption |

    And User sending the keys in the Dialog content
      | nameInput | <Cities> |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Dialog content
      | searchSelect  |
      | countryOption |

    When User delete item from Dialog
      | <Cities> |

    Then Success message should be displayed

    Examples:
      | Cities |
      | Ankara |