# Raider Robotix Printer

## Objectives

* Learn string concatenation
* Implement `for` loops for test cases
* Use appropriate logic and operators in `if` and `else` statements

## Input Format

The input will consist of two space separated integers, `lowerLimit` and `upperLimit`.

## Task

Print the numbers from `lowerLimit` to `upperLimit`, inclusive, with each number on one line.

However, for multiples of 3 print `Raider` instead of the number. For multiples of 7 print `Robotix` instead of the number. For multiples of three and seven, print `RaiderRobotix`.

You should use an effective algorithm that uses as few `if` statements as possible. Maintain readable code and name variables appropriately.

**Hints**

* What operator do you use to check if a number is a multiple of another?
* What is your precondition and break condition in a `for` loop to cycle through a range of numbers?

## Constraints
 * `lowerLimit` and `upperLimit` are integers
 * $0 \leq \texttt{lowerLimit} \leq \texttt{upperLimit} \leq 2^{31}-1$

## Sample Input

    10
    25

## Sample Output

    10
    11
    Raider
    13
    Robotix
    Raider
    16
    17
    Raider
    19
    20
    RaiderRobotix
    22
    23
    Raider
    25


