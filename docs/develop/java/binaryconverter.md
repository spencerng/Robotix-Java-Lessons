# Binary Converter

## Objectives

* Learn to parse strings effectively
* Learn to use methods in the `Math` class
* Apply your knowledge to Java to implement an algorithm

## Task

All data in computers are stored in binary, which is a base-2 number system in which the only digits are 0's and 1's. Write a program to convert a binary number to decimal. An algorithm to do this is found below, but additional information on decimal/binary may be found online. **You should not use any built-in methods that you have not learned about in the lessons.**

## Conversion Algorithm

In a base-10 (decimal) number system, you obtain the value of a number by multiplying the exponent of the decimal place by the number in that place, then adding the products together. For example, to compute the value of 1234, you would compute 

$1234 = 10^0\cdot4 + 10^1\cdot3 + 10^2\cdot2 + 10^3\cdot1$

which is equal to $1\cdot4 + 10\cdot3 + 100\cdot2 + 1000\cdot1=1234$.

The same applies to base-2 (binary), except you multiply by the powers of 2 instead of the powers of 10. To compute the value of $10110_2$ (binary), you compute (in decimal)

$10110_2 = 2^0\cdot0 + 2^1\cdot1 + 2^2\cdot1 + 2^3\cdot0 + 2^4\cdot1$

which is equal to $1\cdot0 + 2\cdot1 + 4\cdot1 +8\cdot0+16\cdot1=22_{10}$ (in decimal).

## Input Format

The input will consist of an integer, `numTestCases`, on the first line, representing the number of test cases. `numTestCases` lines follow. There will be a binary number, `binaryNum`, on each line following `numTestCases`.

**Hint**: What data type should `numTestCases` be? What about `binaryNum`?

## Constraints

* $1\leq \texttt{numTestCases} \leq 1000$
* The decimal value of each `binaryNum` is between 0 and $2^{31}-1$ (`Integer.MAX_VALUE`), inclusive

## Output Format

Your output will consist of `testCaseNum` lines. On each line, print `binaryNum`, the words `in decimal is`, then the corresponding decimal value of `binaryNum`. For example, if your input is
     
     2
     10110
     11    

your output should be

    10110 in decimal is 22
    11 in decimal is 3

## Sample Input

    3
    0
    111
    1111111111111111111111111111111

## Sample Output

    0 in decimal is 0
    111 in decimal is 7
    1111111111111111111111111111111 in decimal is 2147483647

