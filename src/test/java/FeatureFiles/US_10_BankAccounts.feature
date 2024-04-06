@SmokeTest
Feature: Bank Accounts Create, Edit and Delete Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

  Scenario Outline: Create and edit a Bank Accounts

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in the Dialog content
      | nameInput       | <Name>             |
      | ibanInput       | <IBAN>             |
      | integrationCode | <Integration Code> |

    And Click on the element in the Dialog content
      | currency   |
      | option     |
      | saveButton |


    When User edit item from Dialog
      | <Name> | <NewName> |

    Then Success message should be displayed

    Examples:
      | Name     | IBAN             | Integration Code | NewName   |
      | ZeroBank | DE32074567455678 | 352              | DenizBank |


  Scenario Outline: Delete a Bank Accounts
    When User delete item from Dialog
      | <Name> |

    Then Success message should be displayed

    Examples:
      | Name      |
      | DenizBank |