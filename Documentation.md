# Assignment 01 - Documentation
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


## atoi (paul)

### Specification-based testing

### convert_string_to_int()
This test checks if a string containing just numbers is converted correctly.

### remove_whitespace_keep_negative()
This test checks if trailing whitespaces get trimmed off from input and if a negative sign is handled correctly.

### cut_off_trailing_alphabet()
If the input contains a string of digits followed by words, symbols or alphabets, this test passes if the digits are extracted correctly.

### assert_abc_equals_zero()
If no digit is in the input string, this test passes when 0 is returned.

### input_null()
This test passes if null input returns 0.

### assert_0032_equals_32()
This test passes if leading 0 doesn't change value of number in input string.

### assert_input_out_of_range()
This test checks if a out-of-range input makes the function return the border value.

### assert_rest_of_string_ignored()
This tests checks if the program reads until the first non-digit input character and ignores the rest of string.

### assert_if_str_length_0_reached()
This tests checks if the condition of a valid string with no integer returns 0
This test is added in structural testing phase. With this test, the code coverage is at 98%.


### Structural and mutation testing

### assert_plus_sign()
This test checks if the '+' sign is read correctly when passed in as input. This test is added in structural testing phase.

### assert_input_out_of_lower_bound()
If the input string contains a negative number out of the built-in integer bound of Java, the minimal integer value is returned. This test is added in structural testing phase.

### assert_conditional_boundary_overflow()
This test ressolves the survival of a conditional boundary mutant on line 28. Makes sure that input close to Integer.MAX_VALUE doesnt return the Integer.MAX_VALUE.

### Bugs and summary
No bugs found with the 8 specification tests. To raise the code coverage closer to 100%, assert_if_str_length_0_reached() is added. assert_plus_sign and assert_input_out_of_lower_bound are added to increase branch coverage, which is at 100% after incorporating them. During mutation testing, assert_conditional_boundary_overflow is inserted to kill a conditional boundary mutant on line 28. The mutation coverage is 100%.

## combination_sum (basil)

## frac2dec (paul)

### Specification-based testing

### assert_one_over_two()
This test checks if a fraction is correctly converted to decimal fraction representation in string format.

### assert_two_over_one()
This test checks if a integer fraction is handled correctly.

### assert_four_over_333()
This test checks if repeating digits are enclosed with ().

### assert_zero_denominator()
This test checks if taking 0 as denominator makes function return null. This test failed. 

### assert_first_digits_then_repeat()
This test checks if repeating digits are handled correctly if don't appear immediately after the decimal point. 

### assert_minus_one_over_two()
This test makes sure that the negative signs are handled correctly such that a high condition + branch coverage is achieved.


### Structure and mutation testing

### assert_one_over_minus_two()
This test makes sure that the negative signs are handled correctly such that a high condition + branch coverage is achieved.

### assert_minus_one_over_minus_four()
This test makes sure that the negative signs are handled correctly such that a high condition + branch coverage is achieved.

### assert_nominator_zero()
This test ensures that "0" is returned when 0 is passed as input to the nominator argument. This test kills a conditional boundary mutant.

### Bugs and summary
To fix the bug caused by zero division, add an if clause at the start of the function definition to check if denominator == 0 then return null. The sixth, seventh and eighth tests are added in structural testing phase. Without them, the test suite shows a low branch coverage due to res.append() (line 15) call to add a '-' sign to output string. The test suite shows 93% branch coverage, which is sufficiently good because the last missing branch happens at the nominator == 0 branch, it's purpose make edge case efficient. In the case of nominator != 0, the program should continue running. There is no other branch to test. The overall code coverage is at 98%, with the remaining 2% correspond to class name definition.
While perfoming mutation testing, line 11 and line 15 show some surviving conditional boundary mutants. While the mutant on line 11 is fixed by adding the last test, it is not required to write tests for line 15 because even if the code uses >= instead of >, the case of either or both input being zero is already taken care of in the first two if-statements of the program. Thus the test suite has a mutation score of 90%.

## median_of_arrays (gianni)

## generate_parentheses (max)
### Specification-based Testing
**1. Understanding Requirements, Input and Output**

I read the requirements thoroughly and made sure to understand them completely.

**2. Exploring program**

I started playing around with the program to see what it returns for certain inputs and to see if it behaves as it should. After a short exploration phase it seems the program does what is specified in the requirements in happy cases.

**3. Identify Partitions**

a) Input
- n < 1
- 1 <= n <= 8
- n > 8


b) Interactions
We don't have any interactions as we only have one input.


c) Output
- Empty array
- Array with strings (Parentheses)

**4. Boundaries**
- Between 0 and 1 (0 = off point, 1 = on point), because with n=0 and n=1, the program should behave differently.
- Between 8 and 9 (8 = on point, 9 = off point), because with n=8 and n=9, the program should behave differently.

So, we need to test these boundaries, as bugs love boundaries.


**5. Devising and Reducing Test Cases**

We now devise the test cases based on our partitions and boundaries.
To reduce our number of test cases as much as possible, while still having the different partitions and cases tested
we test mainly our on and off points as they cover our partitions as well as our boundaries.
- T1 n = 0 (off point)
- T2 n = 1 (on point)
- T3 n = 8 (on point)
- T4 n = 9 (off point)

**6. Automating**

I automate these four test cases with Junit.
T1 & T2 pass. When creating T3 with n = 8, I realize I could make a mistake quickly when constructing
the expected List to be returned with 8 pairs of parentheses. A test where I am not 100% sure that the
expected value to be returned is correct, is not useful. Therefore, I change T3 from n = 8 to n= 3.
This way I know the expected return value is correct and can therefore determine by running the test
if the program behaves as it should. Further, there is no reason that the program behaves differently
for n = 8 and n= 3 as they are in the same partition. So, changing this test shouldn't compromise the effectiveness
of our test suite.

As we have the constraint that n should be < 9 it is implied the program should behave differently in that case.
As there is no further description in the requirement I decide the program should behave the same as for n < 1, hence return an empty list.
As the test reveals, it doesn't return an empty list, I fix it by inserting an " || n > 8" in Line 10.

As we tested all our partitions and all tests pass, I continue with the process by augmenting the test suite with experience and creativity.


**7. Augment Test Suite**

It could be, that the developer only considered n = 0, because negative numbers wouldn't make sense to pass in the function in the first place.
So I want to check if negative numbers return an empty array as well and add T5.
I am happy with the test suite and continue with structural testing.

### Structural Testing

Luckily, I already have 100% coverage. So I move on to mutation testing.



## Mutation Testing
The mutation coverage is 91%. Two mutants survived, namely:
- On line 5: replaced return value with Collections.emptyList for zest/GenerateParentheses::generateParentheses
- On line 5: changed conditional boundary

For both survived mutants there is no need to add more tests. As on line 5 we should get an empty list as a return. This is fine.
None of our tests killed mutant 2 because we didn't have a test for n = 8. The same argument as before applies.
There is no reason to think that the program behaves differently for n = 8 or n = 3, so testing if n = 3 works is enough to ensure the correctness of the program.
Adding a test with n = 8 doesn't help us. So our test suite is complete as it is.

## needle_in_hay (max)
### Specification-based Testing
**1. Understanding Requirements, Input and Output**

I read the requirements thoroughly and made sure to understand them completely.

**2. Exploring program**

I started playing around with the program to see what it returns for certain inputs and to see if it behaves as it should. After a short exploration phase it seems the program does what is specified in the requirements in happy cases.

**3. Identify Partitions**

a) Input
- "needle" is empty
- "needle" is null
- "needle" has length = 1
- "needle" has length > 1
- "haystack" is empty
- "haystack" is null
- "haystack" has length = 1
- "haystack" has length > 1

b) Interactions
- needle is in haystack once
- needle is not in haystack
- needle is partially in haystack
- needle is in haystack multiple times

c) Output
- 0
- -1
- index of first occ of first character of needle if it is in haystack (an Integer)

**4. Boundaries**

- as soon as we find last char of needle in haystack, program should behave differently. We already test this as we follow the principle to only change our inputs so much that it corresponds to our test case (e.g change needle from test to tes, when test is in haystack). Therefore, we test the on and off points in such cases already.
- as soon as needle or haystack is not empty. We have such a case already when testing the devised partitions (needle and haystack length one).

**5. Devising and Reducing Test Cases**

We combine our different partitions while only executing exceptions once in order to reduce our tests to create.

***Exceptional Cases***
- T1 needle is null
- T2 needle is empty and haystack is not
- T3 haystack is null
- T4 haystack is empty and needle is not
- T5 haystack and needle are empty

***Needle has length 1 and Haystack has length 1***
- T6 needle matches haystack
- T7 needle does mot match haystack

***Needle has length >1 and Haystack has length 1***
- T8 never a match

***Haystack has length >1 and needle has length 1***
- T9 needle is in haystack once
- T10 needle is not in haystack
- T11 needle is in haystack multiple times

***Haystack has length > 1 and Needle has length >1***
- T12 needle is in haystack once
- T13 needle is not in haystack
- T14 needle is in haystack multiple times
- T15 needle is in haystack multiple times and consecutively

**6. Automating**

I automated the devised test case from the previous step and found one bug. Specifically, with Test 2 I found a bug where the program breaks when needle is empty and haystack isn't. We can add another if statement that considers that case and returns 0 when needle is empty and haystack isn't because an empty string is at the beginning of every string. The rest of the tests passed, thus reassured me that the program behaves as it should in the devised cases.
In General, I followed the principle of not changing my inputs a lot, but only change what is necessary such that it matches the corresponding test case. In addition, I tried to reduce the combinations of the partitions as much as possible, while still covering all the cases needed to have assurance that the program works as it should.$


**7. Augment Test Suite**
- I add a test where needle is in haystack consecutively to make sure the function returns the first occurence of needle in haystack. I add T15. I only add it for the partition where needle and haystack have length >1 because I am confident that it will behave the same for the other partitions as well, if it works for that case. There is no reason it wouldn't.
- I am thinking about cases where needle is at the beginning or end of haystack, because it could be that a loop starts iterating late or stops early. So I add cases for the different partitions. Meaning if needle has length one or >1. So I add T16, T17, T18 & T19. I don't need to add a test for the partition where haystack has length 1 because that case covers the beginning and end of haystack already.
- It is also not clear from the requirements how we should treat capital letters. In a real life scenario I would discuss this with the project leader or similar. From my point of view, capital letters do matter, thus needle is only in haystack if the capital letters match as well. So I add tests for that. As we already tested the partitions where haystack and/or needle is length one thoroughly, I only add a case for both length >1 as we want to examine if the program treats capital letters the right way. So I add T20 (needle is in haystack) and T21 (needle is not in haystack where the only difference is the capital letter)

As I, from my point of view, tested the requirements thoroughly by combining the different partitions as well as adding additional cases where I think the program could break, we now move to structural testing in order to examine the code more in detail and to find more tests that we missed to add to our test suite.


## Structural Testing

We already have 100% branch and condition coverage, so I did a good job in requirement based testing and move on to mutation testing.


## Mutation Testing

Mutation Coverage is 100%. All Mutants were killed (Check picture).
![Bildschirmfoto 2024-03-13 um 12.49.38.png](..%2F..%2F..%2F..%2F..%2FBildschirmfoto%202024-03-13%20um%2012.49.38.png)

## maximum_subarray (gianni)
