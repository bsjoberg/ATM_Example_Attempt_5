# Checkout feature
# Tags: optional
    
Feature: Checkout from the store
    
Scenario Outline: Checkout a banana
    Given the price of a "banana" is 40c
    When I checkout <count> "banana"
    Then the total price is <total>c

    Examples:
    | count | total |
    | 1     | 40    |
    | 2     | 80    |