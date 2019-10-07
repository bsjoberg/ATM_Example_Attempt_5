Feature: Cash Withdrawal

  Scenario: Successful withdrawal from an account with sufficient credit
    Given my account has been credited $100.00
    When I request $20
    Then $20 should be dispensed
    And ​the balance of my account should be $80.00