# Checkout feature
# Tags: optional
    
Feature: Checkout from the store
    
Scenario: Checkout a banana
    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
    Then the total price is 40c