Feature: Ensure development environment is configured to use Cucumber
    Scenario: hello world
        Given I have a hello world app
        When I say hi
        Then I hear "Hello World"