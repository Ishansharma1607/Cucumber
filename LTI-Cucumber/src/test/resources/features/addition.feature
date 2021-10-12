Feature: Addition

  Scenario: Addition of two numbers
    Given I have two variables 10 & 19
    When I do addition
    Then result should shoud display in Console

  Scenario: Addition of two numbers with list
    Given I have two variables as below
      |  8 |
      | 12 |
    When I do addition
    Then result should shoud display in Console

  Scenario: Addition of two numbers with Map
    Given I have two variables as below map
      | num1 | 80 |
      | num2 | 10 |
    When I do addition
    Then result should shoud display in Console
