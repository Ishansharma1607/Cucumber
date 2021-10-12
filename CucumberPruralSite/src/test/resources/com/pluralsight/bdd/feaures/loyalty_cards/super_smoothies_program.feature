Feature: Super Smoothie Loyaly Card Program
  The More Smoothies you buy , tghe more points you earn.

  Background: 
    Given the following drink categories
      | Drink              | Quantity | Points |
      | Apple and Kale     |        2 |     15 |
      | Triple Berry Blend |        1 |     20 |
      | Earl Grey          |        3 |     30 |

  Scenario Outline: Earning Points when purchasing smoothies
    Given Ishan is a Morning Freshness Member
    When Ishan purchases "<Quantity>" "<Drink>" drinks
    Then he should earn "<Points>" points

    Examples: 
      | Drink              | Quantity | Points |
      | Apple and Kale     |        2 |     15 |
      | Triple Berry Blend |        1 |     20 |
      | Earl Grey          |        3 |     30 |
