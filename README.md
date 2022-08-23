# String Manipulation Lab

## Learning Goals

- Make use of the `String` methods

## Introduction

The `XO` class hasa the following starter code:

```java
import java.util.Scanner;
public class XO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a string to check for x's and o's:");
        String xo = scanner.nextLine();

        if (getXO(xo)) {
            System.out.println("The string entered has the same amount of x's and o's.");
        } else {
            System.out.println("The string entered has different amounts of x's and o's.");
        }
    }

    public static boolean getXO(String xo) {
        // Write your code here!
    }
}
```

If the `String` the user enters has the same amount of x characters and o
characters, then program will return:

```plaintext
The string entered has the same amount of x's and o's.
```

If the `String` the user enters does not have the same amount of x characters
as o characters, then the program will return:

```plaintext
The string entered has different amounts of x's and o's.
```

## Instructions

Use the methods offered by the `String` class that we have learned about in
the previous lesson to help you take in a `String` and determine if it has the
same amount of 'x' characters as 'o' characters. You will write this code within
the `getXO()` method, and it must return a `boolean` value.

The code should also be **case-insensitive**. This means that the characters
'x' and 'X' should be treated the same.

The `String` that the user inputs could have any character in it as well. For
example: "The quick fox jumped over the fence" is a valid `String`, but we will
only concern ourselves with counting the 'x' and 'o' characters.

## Sample Tests

```java
getXO("ooxx");    // Should return true
getXO("xooxx");   // Should return false
getXO("zzz");     // Should return true since no 'x' or 'o' is present
getXO("XoXo");    // Should return true
```
