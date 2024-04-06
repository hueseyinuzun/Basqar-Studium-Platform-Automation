Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |

  Scenario: Create a Country
    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | Germany |
      | codeInput | 123456  |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed


  Scenario: Entering The Same Information to Country
    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput | Germany |
      | codeInput | 123456  |

    And Click on the element in the Dialog content
      | saveButton |

    Then Already exist message should be displayed


  Scenario: Delete a country
    When User delete item from Dialog
      | Germany |

    Then Success message should be displayed


