## palindrome (Basil)

### 1. Specification-based testing
1. Understand the requirements
- The program should take any integer number as an input and return true if it is a palindrome or false if it is not a palindrome.
2. Explore what the program does for various inputs:
- 0 (0): True
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
- test: input leading zero (0)
- test: input single digit (1)
- test: input multiple digits (10)
- test: input multiple digits, even (11)
- test: input multiple digits, odd (121)
- test: input large number (21474747412)
- test: input first/last equal (1231)
- test: input first/last different (1223)
6. Automate the test cases: For PalindromeOne and PalindromeTwo: Done!
- At this point I noticed a bug with PalindromeTwo which I will elaborate at the end of this paragraph.
7. Augment the test suite with creativity and experience: Done!

#### The bug in PalindromeTwo
- The test for the integer 0 failed. 
- Upon further inspection of the code I noticed the case where the input integer is 0 is caught by the wrong statement.
- This is due to a missing case where x == 0.
- I added line 11 in PalindromeTwo.java to fix a bug where the integer 0 would return an incorrect false.

### 2. Structural Testing
1)	Performed specification-based testing on both palindrome files.
2)	Read the implementation and understand the main coding decisions made by the dev:
- I added tests for the upper and lower constraints and double-checked the negative test
3)	Run the devised test suite with a code coverage tool
- I ran the test suites with Jacoco: Both files received:
  - 100% Class coverage
  - 100% Method coverage
  - 100% Line coverage
  - 100% branch coverage
4)	(omitted) For each piece of code that is not covered:
      a)	Understand why that code was not tested
      b)	Decide whether the piece of code deserves a test (testing or not testing is now conscious decision
      c)	If a test is needed, implement an automated test case that covers the missing pieces.
5)	Go back to the source code and look for other interesting tests you can devise based on the code.

### Mutation testing
?
