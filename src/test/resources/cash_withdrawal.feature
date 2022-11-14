Feature: Cash Withdrawal

  Scenario: Successful withdrawal from an account in credit
    Given my account has been credited $100.00
    When I request $30
    Then $30 should be dispensed
    And ​the balance of my account should be $80.00