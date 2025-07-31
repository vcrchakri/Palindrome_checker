# Palindrome Checker (Smart Version)
Objective
This program checks if a given sentence is a palindrome. It's "smart" because it ignores case, spaces, and any special characters, focusing only on the alphanumeric content.

Key Features / Concepts
String Cleaning: Using replaceAll("[^a-zA-Z]", "") to remove non-alphabetic characters and toLowerCase() for case-insensitivity.

String Reversal: Efficiently reversing the cleaned string using StringBuilder.reverse().

Conditional Logic: Comparing the cleaned original string with its reversed counterpart to determine if it's a palindrome.

How to Run
javac PalindromeChecker.java
java PalindromeChecker

Example Usage
Input 1:

Madam, in Eden, I'm Adam.

Output 1:

The sentence is a palindrome!

Input 2:

Hello World

Output 2:

The sentence is not a palindrome.
