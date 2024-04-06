Feature: Country and Cities Create Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create a Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | NewTurkey |
      | codeInput | 123456    |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed


  Scenario: Create a Cities
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | cities     |

    And Click on the element in the Dialog content
      | addButton      |
      | countrySelect  |
      | countryOption2 |

    And User sending the keys in the Dialog content
      | nameInput | Izmir |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed


  Scenario: Delete a Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |

    When User delete item from Dialog
      | NewTurkey |

    Then Error message should be displayed


  Scenario: Delete a Cities
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | cities     |

    And Click on the element in the Dialog content
      | searchSelect   |
      | countryOption2 |

    When User delete item from Dialog
      | Izmir |

    Then Success message should be displayed


  Scenario: Delete a Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |

    When User delete item from Dialog
      | NewTurkey |

    Then Success message should be displayed

