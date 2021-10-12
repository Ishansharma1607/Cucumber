Feature: login functionality

  Scenario Outline: To do data driven testing on login functionality
    Given user is on Login Page
    When user enters user name as "<un>" & Password as "<pwd>" & and Click on Login Button
    Then login "<loginType>"  happen

    Examples: 
      | un       | pwd      | loginType |
      | demouser | password | should    |
      | admin    | admin123 | shouldNot |
      | hr       | hr123    | shouldNot |
