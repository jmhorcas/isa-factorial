Feature: Calcular el factorial de un número
  Como estudiante de ingeniería de la Salud
  Quiero calcular el factorial de un número
  Para conocer las posibles permutaciones de un conjunto de elementos

  Background:
    Given tengo una calculadora de factorial

  Scenario: Cálculo del factorial de cero
    Given el usuario ingresa el número 0
    When calculo el factorial
    Then el resultado debe ser 1

  Scenario: Cálculo del factorial de uno
    Given el usuario ingresa el número 1
    When calculo el factorial
    Then el resultado debe ser 1

  Scenario Outline: Cálculo del factorial de un número positivo
    Given el usuario ingresa el número <n>
    When calculo el factorial
    Then el resultado debe ser <resultado>

    Examples:
    | n  | resultado   |
    | 2  | 2           |
    | 3  | 6           |
    | 4  | 24          |
    | 5  | 120         |
    | 10  | 3628800    |

  Scenario Outline: Intento del cálculo del factorial de un número negativo
    Given el usuario ingresa el número <n>
    When calculo el factorial
    Then debe lanzarse una excepción

    Examples:
    | n    |
    | -1   |
    | -5   |
    | -10  |
    | -20  |
    | -200 |