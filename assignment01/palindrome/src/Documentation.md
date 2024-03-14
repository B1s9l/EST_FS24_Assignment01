# Documentation.md for Palindrome
## Palindrome One
### Specification-based testing
1. Understand the requirements
- The program should take any integer number as an input and return true if it is a palindrome or false if it is not a palindrome.
2. Explore what the program does for various inputs:
- 0 (0): True
- null (null): Not an integer error
- Single digit (1): True
- Two digits palindrome (11): True
- Two digits not a palindrome (12): False
- Multiple digits, even, palindrome (123321): True
- Multiple digits, odd, palindrome (12321): True
- Multiple digits, first/last equal, not a palindrome (12331): False
- Multiple digits, first/last not equal, not a palindrome (12332): False
- Very large number palindrome (21474747412): True
- Very large number not a palindrome (2147483647): False
- Negative number (-121): False
3. Explore possible inputs and outputs and identify partitions
- One-digit number: True 
- Multiple-digit number, even, palindrome: True
- Multiple-digit number, odd, palindrome: True
- Multiple-digit number, first/last equal, not a palindrome: False
- Multiple-digit number, first/last not equal, not a palindrome: False
- Negative number: False
- Very large number palindrome: True
- Very large number not a palindrome: False
4. Analyse the boundaries
- boundary negative/single digit: -1/0
- boundary: single/multiple digits: 9/10 - 11
- boundary: even/odd digits: 99/100 - 101
- ?boundary: first/last cases
5. Devise test cases
- test: input negative (-1)
- test: input zero (0)
- test: input single digit (1)
- test: input multiple digits (10)
- test: input multiple digits, even (11)
- test: input multiple digits, odd (121)
- test: input large number (21474747412)
- test: input first/last equal (1231)
- test: input first/last different (1223)
6. Automate the test cases
7. Augment the test suite with creativity and experience