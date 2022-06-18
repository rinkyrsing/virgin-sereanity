Feature: Testing defaultGameFrequency and startTime values on the Virgingames api

  @smoke
  Scenario: Check value of 'defaultGameFrequency' should always be '300000'
    When User sends a GET request
    And  User must get back a valid status code 200
    Then User should verify 'defaultGameFrequency' value should be '300000'
