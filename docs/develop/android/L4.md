# Lesson 4 - Object Orientated Design

We explored `String`s in previous lessons, which was your first look at an object in Java. In fact, you've been writing programs inside of a `main` function, which is a method inside a function! In this lesson, we'll see what an object really is and why they're so useful.

## Why objects?

Objects have both **state**, variables that remain constant until you modify them, and **behavior**, which are seen through callable methods that either feed your main method information about that object or operate on its state. As programmers, you need to design objects so that their state and behavior are appropriate for what you're trying to accomplish, while breaking down code into testable and understandable building blocks.

It's probably easiest to think of an object like an object in the real world, such as a person or a dog. It could have states like a name, age, favorite color, and friends. Similarly, a `Person` object could have behaviors like befriending another person if they have the same favorite color, increasing its age every year, or saying its name. Objects may also want to keep some state variables `private`, such as a credit card number. These are just examples, but you'll see as we go about modeling a person in this lesson.

In essence, objects make programming real-world mechanisms and representing real-world entities a lot easier. You could have a `Robot` object drive a certain distance, deposit and earn interest in a `BankAccount`, or read the state of an `Actuator` on a `Robot`.

## Constructors and member variables

A `class` is the blueprint behind an object, which is something you should already be familiar with from writing programs. Each class should generally be in its own `.java` file, called `ClassName.java`. It's possible to have multiple classes within a file, but we'll get to that later.

Inside `Person.java`:

    //Import statements come first
    import java.util.Scanner;

    public class Person {

        public static void main(String[] args){
            //do stuff here
        }
    }

This is probably what you're familiar with right now. Now, we'll add in some fields, called **member variables**, to the `Person` class that will help identify it:

    public class Person {
        String name, favoriteColor;
        int age, numFriends;
    }

To initialize these attributes, we'll also need a **constructor**, which is essentially a method that returns an **instance** of that class while assigning values to as many member variables as you'd like.

    public class Person{
        String name, favoriteColor;
        int age, numFriends;

        public Person(String name){
            this.age = 0;
            this.numFriends = 0;
            this.name = name;
        }
    }

Note that the identifier for a constructor is simply the name of the class, though the parameters can be any datatype, and there is no `return` statement. Like other methods, constructors can also be overloaded with arguments of different datatypes. An **empty constructor** is automatically created if no constructor is declared for a class, which simply doesn't set any member variables.

To access member variables, we use the keyword `this`, referring to the new instance of the object, followed by the **dot operator** and the identifiers of the variables you want to modify. This also distinguishes the `name` variable in the parameter of the constructor with the `name` variable that's part of the object's state.

Member variables must be assigned a value, either explicitly through the code of the class or via a constructor, before their value can be accessed. They can also either be objects or primitive values.

## Declaring objects

So, how exactly do you create an object with the constructor? Well, it's similar to declaring any other variable in Java, complete with a datatype and identifier, except you'll need to use the `new` keyword:

    public static void main(String[] args){
        Person mentor = new Person("Cokeley");
    }

This creates an instance of a `Person`, which is stored in `mentor`. Now, if you want to access or modify attributes of `mentor`, you'll use the same dot operator that was used in the constructor:

    mentor.age = 25;
    System.out.println(mentor.name + " is " + mentor.age + " years old");

This will print out `Cokeley is 25 years old`.

## Class methods

While having objects as a simple **data structure** with various attributes is useful, sometimes you want a little more interactivity. That's when we can create our own methods in a class. We can spice up the `Person` class by adding in the following:

    public class Person{
        String name, favoriteColor;
        int age, numFriends;

        public Person(String name){
            this.age = 0;
            this.numFriends = 0;
            this.name = name;
        }

        boolean makeFriends(Person possibleFriend){
            if(possibleFriend.favoriteColor.equals(this.favoriteColor)){
                this.numFriends++;
                possibleFriend.numFriends++;
                return true;
            }
            return false;
        }
    }

This `makeFriends` method mutually has two people become friends if their `favoriteColor` is the same, then returns `true` if they've become friends, or false otherwise. Another example can be seen with this `RightTriangle` class:

    class RightTriangle{
        double legOne, legTwo, hypotenuse;

        RightTriangle(double side1, double side2, double side3){
            this.hypotenuse = Math.max(Math.max(side1, side2), side3);
            this.legOne = Math.min(Math.min(side1, side2), side3);
            this.legTwo = side1 + side2 + side3 - this.legOne - this.hypotenuse;
        }

        double getArea(){
            return 0.5 * this.legOne * this.legTwo;
        }

        double getPerimeter(){
            return this.legOne + this.legTwo + this.hypotenuse;
        }

        //Returns smaller acute angle in radians
        double getSmallerAngle(){
            return Math.atan(this.legOne / this.legTwo);
        }

        //Returns larger acute angle in radians
        double getLargerAngle(){
            return Math.PI/2 - this.getSmallerAngle();
        }

        //Extends the length of the shorter leg and
        //adjusts the length of the hypotenuse accordingly
        void extendLegOne(double newLength){
            if(newLength > this.legTwo){
                this.legOne = this.legTwo;
                this.legTwo = newLength;
            }

            else this.legOne = newLength;

            this.hypotenuse = Math.sqrt(Math.pow(this.legOne, 2) + Math.pow(this.legTwo, 2));
        }

    }

Here, after initializing a `RightTriangle` object, we can use its different instance methods to get and modify its properties. For instance, executing the following in the `main` method

    RightTriangle tri = new RightTriangle(4,3,5);
    System.out.println("Perimeter: " + tri.getPerimeter());
    System.out.println("Area: " + tri.getArea());
    System.out.println("Smaller Angle: " + tri.getSmallestAngle() + " rad");
    tri.extendLegOne(10);
    System.out.println("New Perimeter: " + tri.getPerimeter());

will print

    Perimeter: 12.0
    Area: 6.0
    Smallest Angle: 0.6435011087932844 rad
    New Perimeter: 24.77032961426901

## Visibility

Sometimes it is desirable to reduce the access and visibility of object methods or instance variables. For example, you generally wouldn't want a `main` method to be able to change a `Person` object's `name` explicitly, or perhaps you want to modify a `BankAccount` object's balance only through withdrawal and deposit methods, each requiring a PIN code. In that case, it's best to leave member variables `private` instead of `public`. To do this, simply put the **visibility modifier** in front of the variable identifier, like so:

    public class Person{
        private String name, favoriteColor;
        private int age, numFriends;

        public Person(String name){
            this.age = 0;
            this.numFriends = 0;
            this.name = name;
        }
    }   

That way, `private` level access only allows those variables to be accessed and modified within the same class (such as within the constructor or other class methods). On the other hand, `public` level access allows all classes to modify a variable or call a method, while default access (not putting any modifier) only allows classes of the same package to access variables/methods. We'll get into packages later on, but just know that they're ways of grouping similar classes for now.

So, how are we supposed to modify and access attributes like `favoriteColor` so the method `makeFriends` can still function properly? For the first case, we'll use a special type of method called a **setter**, while we create a **getter** to do the latter:

    private public class Person{
        private String name, favoriteColor;
        private int age, numFriends;

        public Person(String name){
            this.age = 0;
            this.numFriends = 0;
            this.name = name;
        }

        public void setFavoriteColor(String favoriteColor){
            this.favoriteColor = favoriteColor;
        }

        public String getFavoriteColor(){
            return this.favoriteColor;
        }
    }

It's pretty simple: a setter has an argument datatype that's the same as the member variable, sets the member variable, then returns nothing. Meanwhile, a getter has the same return type as the member variable, has no parameters, and simply returns the value of the member variable. In fact, these methods are so common (as it's good practice to set variables as `private`) that most IDEs (including Eclipse) have a way to automatically generate setters and getters for a class.

Finally, `static` methods and variables are called directly on a class, rather than on an instance of a class. You've already seen examples of these in the `Math` class: the variable `Math.PI` and the method `Math.pow(base,exp)` can be called without declaring an instance of a `Math` object via the `new` keyword.

It's important to note that `static` variables are shared by all instances of a given class (and thus can be used as temporary storage). Also, `static` methods cannot access non-`static` variables or methods. You can make a `static` method `private` or `public` by putting the visibility modifier in front of the word `static`, such as in `public static void main(String[] args)`.

## Scope

Our last topic is something that we've used throughout this lesson without realizing it; variable identifiers often come in conflict with each other. In that case, which value do we use?

The smallest scope is in a loop:

    for(int i = 1; i < 5; i++){
        double area = Math.pow(i, 2);
    }

In this case, both `i` and `area` have **block scope** and cannot be modified or accessed outside of the `for` loop. You'll see that a set of curly braces generally denotes scope. Note that variables with the identifier `i` or `area` cannot exist outside of the loop either.

Next up are local variables, also known as **method scope**:

    public void setSideLength(int sideLength){
            double squareArea = Math.pow(sideLength, 2);
            this.sideLength = sideLength;
    }

Both `sideLength` and `squareArea` can be accessed/modified only within the method `setSideLength`. However, using the keyword `this` and the dot operator will refer to the member variable `sideLength` of the class, rather than the one passed in as an argument.

All variables other than member variables cannot be accessed outside of a class, which then follow the visibility rules discussed before.

## HW: Modeling Bank Accounts

We've discussed bank accounts throughout this lesson. Now it's time to implement one!

Each `BankAccount` object has the following attributes, which should all be `private`:

 * `balance`: a `double` indicating the amount of money in the bank account. Cannot be negative.
 * `pin`: a four-digit code that authenticates a user. May contain leading zeroes (i.e. 0000 is a valid PIN)
 * `name`: the name of the bank account owner
 * `interestRate`: the percent of interest earned by a user in a given year, shared across all bank accounts
 * **Challenge**: `id`: a random, five-digit code that's generated upon the creation of the bank account to identify it. Does not contain leading zeroes. You may want to refer back to the `Math.random` method from Lesson 2.

Methods should be provided to do the following:

 * Construct a `BankAccount` with a PIN, owner, and initial balance
 * **Challenge**: Construct a `BankAccount` with a PIN, owner, and initial balance of $0.00
 * Get the `name` of the owner of an account
 * Get the `id` of the account
 * Change the PIN of the account, given the old PIN and the new PIN. Should return some form of feedback to determine if the PIN was successfully changed
 * Withdraw money from an account, given its PIN and the amount desired. Should indicate if withdrawal was successful and should not allow it if the account doesn't have enough money
 * Deposit a given amount of money into the account
 * Earn interest for the year, based on the `interestRate`
 * **Challenge**: Transfer money from one account to another, given another `BankAccount` object and its PIN

You do *not* need to submit a `main` method as a **driver** for your class, though you will need to write one to test if your class works. Next lesson, you'll write one to complete specific tasks when you learn about arrays and `HashMaps` to create a network of bank accounts.

Please email me your completed class or DM me via Slack.