# Lesson 2 - Loops, Strings, Math

After a (probably pretty long) first lesson, let's explore a couple more features of Java and see what you can do with everything that you learned.

## Loops
Loops are used to execute a **block** of code enclosed in a set of braces (`{}`) multiple times. After all, computers are very good at doing the same thing over and over again! The number of times a block executes depends on a boolean expression.

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

Note that all three parts of a `for` loop are optional. That is, a loop like

    for(;;) {
        //something
    }
    
will execute forever.

**Questions**

Determine the number of times the following `for` loops will execute.

1. `for (int i = 4; i <=8; i += 2) { /*do something*/ }`
2. `for (int i = 10; i >= 0; i -= 3) { /*do something*/ }`
3. `for (int j = 2; j >= 4; j++) { /*do something*/ }`

**Exercises**
* Write a program that computes the sum of all odd integers from 1 to a number specified by the user
* Write a program that computes b^e (a number raised to the power of an exponent), where `b` and `e` are positive integers
* Write a program that allows the user to enter a number, `setSize`. `setSize` numbers, `num`, follow and are inputted by the user. Print the average, largest, and smallest of the numbers.

### Loop Control

There are two **control statements** that are used with loops:

#### `break`

The `break` statement will immediately exit a `while` or `for` loop. This can be useful if you're looking for a specific value, and you want the loop to end after you've found that value. For instance, in the below example, the loop will terminate immediately after the value `key` is found:

    int key = 8;
    for (int i = 0; i < 64; i++) {
      if (i == key) {
        System.out.println("Found");
        break;
      }
      System.out.println("Not found...");
    }

As a result, `Not found...` will be printed out eight times at first, followed by `Found`. The loop will then terminate. The `break` statement will be more useful after you learn about arrays.

#### `continue`

The `continue` statement will immediately go to the next iteration of a `for` or `while` loop, bypassing all statements after it. This could be used when you only want to execute a loop for some values. Of course, an `if`-`else` statement can often accomplish the same thing, but `break` and `continue` statements can prevent too many nested blocks of code.

For instance, the following block of code

    for (int i = 0; i < 4; i++) {
      System.out.println("Going... " + i);
      if (i >= 2) {
        continue;
      }
      System.out.println("Here");
    }
    
will print 

    Going... 0
    Here
    Going... 1
    Here
    Going... 2
    Going... 3
    

## Characters

In addition to the primitive data types (`boolean`, `int`, `double`) we learned about before, `char`s represent one of the 256 [ASCII characters](https://www.asciitable.com/). These include the numbers, standard symbols and punctuation on a keyboard, and both uppercase and lowercase letters. A `char` is assigned a value with the declaration

    char allianceColor = 'R';

Note the use of single quotation marks rather than double quotation marks (which are used for `String`s) and that a variable of type `char` may only contain a single character. 

**Escape characters** are the first 32 ASCII characters, which serve special functions. The most commonly used is `'\n'`, which creates a line break. In addition, quotation marks must be escaped. Thus, executing the following code

    char quote1 = '\'';
    char quote2 = '\"';
    char newLine = '\n'
    System.out.print(quote1);
    System.out.print(newLine);
    System.out.print(quote2);

will print

    '
    "

Note that strings can be thought of as a series of `char`s concatenated together. For instance, executing

    String someText = "Kickoff, 2017\nAs we anticipated the new game, the livestream blared, \"STEAM POWERED! STEAM POWERED! STEAM POWERED!\"";
    System.out.println(someText);

will print

    Kickoff, 2017
    As we anticipated the new game, the livestream blared, "STEAM POWERED! STEAM POWERED! STEAM POWERED!"

The value of characters may be compared with the equivalence (`==`) operator. For example, `allianceColor=='R'` is `true`. Note, however, that a character is not equal its `int` equivalent. That is, `'1'==1` is `false`.

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

1. The method will return a value of type `char` (character), rather than `String`.

2. The index is a value that is greater than *or equal to* 0 and *less than* `string.length()`. That is, the index of the first character in the string is `0`, and the index of the last character in the string is `string.length()-1`. If `String s = "World";` is declared, `s.charAt(0)` returns `'W'`, `s.charAt(3)` returns `'l'`, and `s.charAt(4)` returns `'d'`.

A standard way to parse through all of the characters of a string is with the following `for` loop:

    String str = "Hello World!";
    for(int i = 0; i < str.length(); i++){
        char currentChar = str.charAt(i);
        //Do something here
    }

### Substrings

Suppose you want to return a slice of a string, known as a substring, such as the first letter four letters of `String s = "Raider Robotix";`. An easy-to-understand way would be to use string parsing, similar to what we did above:

    String s = "Raider Robotix";
    String result = ""; // an empty string
    for(int i = 0; i < 4 && i < s.length(); i++){
        result += s.charAt(i);
    }
    System.out.println(result);
    
This would print out `Raid`. Note that the expression `i < s.length()` was still present in the exit condition in order to prevent errors if `s` was an input string that was less than four characters long.

However, a faster way to get `result` would be to use the `substring(beginIndex, endIndex)` method, in which `beginIndex` and `endIndex` are integers that represent the indicies that you want to search. Similar to the `for` loop above, `beginIndex` is inclusive, while `endIndex` is exclusive. Here are some examples:

 * `s.substring(0, 4);` returns `Raid`
 * `s.substring(7, s.length());` returns `Robotix`
 * `"hamburger".substring(4, 8);` returns `urge`

### Miscellaneous String Functions

Assume that `String s = "Hello";` is declared in the following examples:

* `s.toLowerCase();` returns `hello`
* `s.toUpperCase();` returns `HELLO`
* `s.indexOf("l");` returns `2` (the first occurence of `l` in `s`), while `s.lastIndexOf("l")` returns `3`
* `s.concat("world");` returns `Helloworld`

As mentioned before, string equality is checked with `s.equals("Hello");`, which would return `true`. On the other hand, after declaring `String anotherString = "Hello";`, the boolean expression `s == anotherString || s == "Hello"` would be `false`, as string are *objects*, not *primitives*.

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
* `Math.random()`: returns a random `double` in the interval \[0.0, 1.0). This can be used to generate a random integer within a particular range by clamping the number down, then **casting** it to an `int`. For example, if you want a random integer in the interval \[`lower`, `upper`], you would declare `int randInt = (int) (Math.random() * (upper-lower)) + lower;`. Try it out!

**Exercises**
* Write a program that solves quadratic equations of the form 0=ax^2+bx+c for x, where a, b, and c are coefficients given by the user
* Write a program that calculates the average of a data set, given the numbers in the set and its length
* Write a program to find the surface area and volume of a square pyramid, given its side length and height
* Write a program to round a number to a specific number of decimal places

# Assignment
Complete the "Raider Robotix Printer" and "Binary Converter" programs on HackerRank.
