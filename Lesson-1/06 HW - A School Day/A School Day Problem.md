# A School Day

## Objectives

* Learn to use basic Java input/output
* Learn to declare and assign values to variables
* Demonstrate appropriate usage of variable identifiers
* Apply your knowledge of operators to solve a problem
* Use boolean expression appropriately
* Learn to use simple conditional statements

## Task

You seem to have lost your calendar for this year and can only remember the days of the week that each month starts with. Write a program that determines if a particular date is a school day.

There is school from Monday to Friday (inclusive), except on holidays and in July and August. The following dates are defined as holidays:

* January 1
* July 4
* November 11
* December 24
* December 25

**Hints**

* What boolean expression would check if a day is a holiday?
* How would you check the current day of the week using mathematical operators?
* How would you convert the current day of the week to a number?

## Input Format

The input will consist of three tokens, each separated with a whitespace. The first two represent the current date, while the third represents the day of the week **the first day of the month is on**.

The first token is a string that is a month of the year (`January`, `February`, etc.). The next token is an integer representing the date. The last token is a string that is a day of the week (`Sunday`, `Monday`, etc.)

An example input (for March 2017) is:

    March 25 Wednesday

## Output Format

The output will consist of the input date, followed by the phrase `is a school day.` if it is a school day or `is not a school day.` if it is not.

An example output for the example input is:

    March 25 is not a school day.

## Input/Output Examples

**Sample 1**

    December 25 Friday

    December 25 is not a school day.

**Sample 2**

    July 2 Monday

    July 2 is not a school day.

**Sample 3**

    April 26 Saturday

    April 26 is a school day.