Feature: rozetka tests

  Scenario: search for "Galaxy"
    Given I'm on the mobile phones category page
    When I enter "Galaxy" in 'I'm looking for..' field
    And press on find button
    Then the category page with phones appears and each item contains "Galaxy"