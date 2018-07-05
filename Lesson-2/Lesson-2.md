# Lesson 2 - Loops, Strings, Math

After a (probably pretty long) first lesson, let's explore a couple more features of Java and see what you can do with everything that you learned.

## Loops
Loops are used to execute a **block** of code enclosed in a set of braces (`{}`) multiple times. The number of times a block executes depends on a boolean expression.

### `while` Loops
`while` loops execute as long as a boolean expression is `true`. It may not execute at all if the expression is `false` before entering the loop.

    while(/*some boolean expression*/){
        //Execute code here multiple times as long as the expression is true
    }

Remember that the boolean expression should become `false` at some point during the execution of the code in the loop. Otherwise, an **infinite loop** will be created.
    
For example, the following will print the numbers from 1 to 10 (inclusive):

    int counter = 1;
    while(counter<=10){
      System.out.println(counter);
      counter++;
    }

`do`-`while` loops may also be written. The main difference between these and `while` loops is that the boolean expression must be `true` at the end of the loop, not at the beginning. The following prints the numbers from 1 to 10 (inclusive):

    int counter = -1;
    do{
      counter++;
      System.out.println(counter);
    }while(counter<10);
    

### `for` Loops
`for` loops provide a more controlled way for **iterating** through a loop multiple times. There are three components to the `for` loop: the initial statement, the exit condition (boolean expression), and the post-excution statement. The example

    for(/*initial statement*/; /*exit condition*/; /*post-execution statement*/){
        //Code to be executed each loop
    }
    
is essentially equal to the following `while` loop:

    //Initial statement
    while(/*exit condition*/){
        //Code to be executed each loop
        //Post-execution statement
    }
    
The `for` loop is commonly used to execute a loop a certain number of times. Below, the loop prints the numbers from 0 to 9 (10 iterations):

    for(int count = 0; i < 10; count++){
        System.out.println(count);
    }

Keep in mind that the variable `count` is declared within the loop, and it cannot accessed outside it.

Loops may also be placed inside each other. For example, executing

     for(int row = 1; row <=12; row++){
        for(int col = 1; col <=12; col++){
            System.out.print(row*col);
            System.out.print(" "); //adds a space
        }
        System.out.println();//line break
     }
    
will print a (poorly formatted) times table.

**Exercises**
* Write a program that computes the sum of all odd integers from 1 to a number specified by the user
* Write a program that computes b^e (a number raised to the power of an exponent), where `b` and `e` are positive integers
* Write a program that allows the user to enter a number, `setSize`. `setSize` numbers, `num`, follow and are inputted by the user. Print the average, largest, and smallest of the numbers.

## String Manipulation
The `String` class in Java contains many methods to manipulate strings. We will present an overview of the most useful ones, though you may read the full documentation [here](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).

### Concatenation
A string can be **concatenated**, or joined together, with other strings or primitive datatypes (and literals) with the `+` operator. For example, executing the following:

     String mascot = "Raider";
     int teamNum = 25;
     String teamName = mascot + " Robotix";
     System.out.println("The year is " + 2017);
     System.out.println("I am on Team " + teamNum + ", " + teamName);
     
 will print
 
      The year is 2017
      I am on Team 25, Raider Robotix

You may also concatenate a string onto the end of another with the `+=` operator. Executing

     String s = "Hello";
     s+=" World!";
     System.out.println(s);
     
will print `Hello World!`.

### String Properties
You can check the length of a string (number of characters) with the `string.length()` method. Executing

     String s = "Hello";
     System.out.println(s+ " is " + s.length() + " characters long");
     System.out.print("World!".length());
     
will print

     Hello is 5 characters long
     6
     
You can also check if a string contains a specific character sequence with the `string.contains(<character sequence>)` method, which returns a boolean value. If `String s = "Hello";` is declared, `s.contains("ell")` returns `true`, while `s.contains("f")` returns `false`.

### Parsing a String
You may want to **parse** through a string sometimes, or check the sequence of its characters. The `string.charAt(/*index*/)` method will return the character currently at the index. There are two things you should know about the method:

1. The method will return a value of type `char` (character), which is a primitive datatype. Characters are declared and assigned values with single quotation marks, like this:

    char character = 'f', ampersand = '&';

 Their value may be compared with the equivalence (`==`) operator. For example, `character=='f'` is `true`.

2. The index is a value that is greater than *or equal to* 0 and *less than* `string.length()`. That is, the index of the first character in the string is `0`, and the index of the last character in the string is `string.length()-1`. If `String s = "World";` is declared, `s.charAt(0)` returns `'W'`, `s.charAt(3)` returns `'l'`, and `s.charAt(4)` returns `'d'`.

**Exercises**
* Write a program to reverse a string if it has an R in it.
* Write a program to check if a string is a palindrome (reads the same backward as forward, such as racecar)
* Write a program to replaces all commas from a string with semicolons

## The `Math` Class
The `Math` class contains several methods that you may find helpful. It is imported by default, and documentation is found [here](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html).

For these examples, we will declare `double a = 4.5, b = -2.5`;
* `Math.abs(b)`: takes the absolute value of a number, returns `2.5` in the example
* `Math.ceil(a)`: takes the ceiling of a number (rounds it up if it is a decimal), returns `5` in the example
* `Math.floor(a)`: takes the floor of a number (rounds it down if it is a decimal), returns `4` in the example
* `Math.pow(a-0.5,-b+0.5)`: takes the first number to the power of the second number, returns `125.0` in the example
* `Math.sqrt(a-0.5)`: takes the square root of a number, returns `2.0` in this example
* `Math.PI`: returns the value of pi (3.141592653589793)

**Exercises**
* Write a program that solves quadratic equations of the form 0=ax^2+bx+c for x, where a, b, and c are coefficients given by the user
* Write a program that calculates the average of a data set, given the numbers in the set and its length
* Write a program to find the surface area and volume of a square pyramid, given its side length and height
* Write a program to round a number to a specific number of decimal places

# Assignment
Complete the "Raider Robotix Printer" and "Binary Converter" programs on HackerRank.
