Feature: Game Flow

  Scenario: Correct guess
    Given a game with secret ABCD
    When a guess is ABCD
    Then I win


