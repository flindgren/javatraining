Feature: Game Flow

  Scenario: Correct guess
    Given a secret ABCD
    When guessing ABCD
    Then I win

  Scenario: No more rows
    Given 2 rows
    And a secret ABCD
    When guessing XXXX
    And guessing YYYY
    Then I lose


