Feature: Calculator

  Simple calculator which takes two numbers


  @HappyPath
  Scenario: Addition
    Given I have a calculator
    And I enter 5 and 2 into the calculator
    When I press add
    Then the result should be 7


  @HappyPath
 Scenario Outline: Substraction
    Given I have a calculator
    And I enter <input1> and <input2> into the calculator
    When I press subtract
    Then the result should be <result>
    Examples:
    |input1 |input2 |result |
    |5      |2      |3      |


  @HappyPath
  Scenario Outline: Multiply
    Given I have a calculator
    And I enter <input1> and <input2> into the calculator
    When I press multiply
    Then the result should be <result>

    Examples:
      |input1 |input2  |result  |
      | 1     | 1      | 1      |
      | 2     | 3      | 6      |
      | 9     | 9      | 81     |
      | 5     | -17    | -85    |

  @HappyPath
  Scenario Outline: Divide
    Given I have a calculator
    And I enter <input1> and <input2> into the calculator
    When I press divide
    Then the result should be <result>

    Examples:
      |input1 |input2  |result  |
      | 1     | 1      | 1      |
      | 10    | 2      | 5      |