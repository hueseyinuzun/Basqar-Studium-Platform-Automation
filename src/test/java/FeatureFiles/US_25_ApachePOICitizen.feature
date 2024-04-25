Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne    |
      | parameters  |
      | citizenship |

  Scenario:  Create citizenship from Excel
    When User create citizenship with ApachePOI

  Scenario: Delete citizenship from Excel
    Then User delete citizenship with ApachePOI