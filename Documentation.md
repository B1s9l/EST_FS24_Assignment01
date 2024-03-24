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
### 1. Specification-based testing
1. Understand the requirements
- The program should take a list of integers (candidates) of arbitrary length and a single integer (target).
- The program should then return a list containing unique lists with all combinations of integers from the first input (candidates) that added result in the integer from the second input (target).
- The integers in the first input list (candidates) may be chosen arbitrarily many times.
- A solution counts as unique if at least one of the values from the first input list (candidates) appears a different number of times than for another solution. 
2. Explore what the program does for various inputs:
- Base case yes | c: [1, 2, 3], t: 6 || c: [2, 3, 6, 7], t: 7 || c: [2, 3, 5], t: 8
- Base case no | c: [2, 4, 6], t: 5
- One candidate that is equal to the target | c: [1], t: 1
- One candidate not equal to the target | c: [1], t: 2
- Empty candidates | c: [], t: 1
- Target is 0 | c: [1], t: 0
- Target is negative | c: [1], t: -1
- Candidate contains a negative | c: [-1, 1], t: 5
- Target and candidate are negative | c: [-1], -5
- Large input (150 combinations) | c: [1, 2, 3, 4, 5], t: 10
- Non-distinct candidates | c: [1, 1, 2], t: 5
3. Explore possible inputs and outputs and identify partitions
- Single candidate, not equal to integer: None solutions
- Single candidate, equal to integer: One solutions
- Multiple candidates, integer: Multiple or None solutions
- Negative candidates, positive integer: No solution
- Positive Candidates, negative integer: No solution
- Even candidates, odd target: No solution
- Odd candidates, even target: Multiple or None solutions
- Empty candidates: No solution
- Multiple non-distinct candidates: None, One or Multiple solutions
- (omitted) Candidates is null
4. Analyse the boundaries
- Empty candidates array
- Single candidate
- Multiple candidates: Smallest, Largest, All
- Negative candidates, positive target
- Negative candidates, negative target
- Even candidates, odd target: Impossible
- Odd candidates, odd target: Possible
- Candidates containing 0
- Non-distinct candidates
- (omitted) Candidates is null
5. Devise test cases
- Empty candidates | c: [], t: 1 -> o: []
- Single candidate | c: [1], t: 1 -> o: [[1]]
- Multiple candidate | c: [2, 3, 4], t: 8 -> o: [[2, 2, 2, 2], [2, 3, 3], [2, 2, 4], [4, 4]]
- Negative candidates, positive target | c: [-1, -2, -3], t: 5 -> o: []
- Positive candidates, negative target | c: [1, 2, 3], t: -5 -> o: []
- Negative candidates, negative target | c: [-2, -3, -4], t: -5 -> o: [[-2, -3]]
- Even candidates, odd target | c: [2, 4], t: 5 -> o: []
- Odd candidates, even target | c: [1, 3], t: 4 -> [[1, 1, 1, 1], [1, 3]]
- Target 0 | c: [1, 2], t: 0 -> o: []
- Candidates 0 | c: [0, 1, 2], t: 3 -> o: [[1, 1, 1], [1, 2]] 
- Non-distinct candidates | c: [1, 1, 2], t: 3 -> o: [[1, 1, 1], [1, 2]]
- Large numbers | c: [1000, 2000], t: 3000 -> [[1000, 1000, 1000], [1000, 2000]]
- Smallest candidate | c: [1, 2, 3], t: 1 -> o: [[1]]
- (omitted) Candidates is null | c: null, t: 1 -> o: (omitted)
6. Automate the test cases: Done!
- I found a bug in the for-loop in getResult() [more below]
- I omitted the tests for negative candidates under the assumption the inputs are always >= 0:
  fixing the code to implement this functionality would surpass a simple bug and require rewriting the entire function
7. Augment the test suite with creativity and experience: Done!

#### Bug in combination sum
- I found a bug in the for-loop in the getResult() method. Any 0 in the candidates would result in
    infinite amount of solutions, since 0 can be added arbitrarily many times without changing the total sum
    and still be considered a unique solution.
- To avoid this I added line 19 that skips every 0.

### 2. Structural Testing
1)	Performed specification-based testing on the CombinationSum file.
2)	Read the implementation and understand the main coding decisions made by the dev:
3)	Run the devised test suite with a code coverage tool
- I ran the test suites with Jacoco:
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
When mutation testing CombinationSum One mutants survived:
- Removed call to java/util/Arrays::sort → SURVIVED
  - Sorting the candidates is crucial for obtaining all combinations
  - Since sorting is handled by a built-in method no further tests are required.
  - Alternatively a sorting algorithm could be implemented in the code and tested respectively.


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

1. Understand the requirements
- The program should find the median of two sorted arrays(ascending order), if one  array is empty, null or not sorted, should return 0.
2. Explore what the program does for various inputs:
- 0 (two empty arrays): -1 (found my first bug)
- null (null): 0
- array not sorted : 0
- OddLengthArrays(1,2, 3): 2
- NegativesOddLength(-3,-2,-1): -2
- EvenLength Arrays(1,2,3,4): 2.5
3. Explore possible inputs and outputs and identify partitions
- Empty Arrays: return wrong result
- Null Arrays: 0
- OddLength:return mid element
- EvenLength: return average of middle elements
- MixedSorted: sort correctly and return correct
- Not sorted: return 0
- Very large ints: considered by developer, could possibly be changed to long but i think was not intended by dev
4. Analyse the boundaries
- boundary empty array, null or not sorted array and not empty array: first case just return 0 else find middle element

5. Devise test cases
- test: input null first param
- test: input null second param
- test: input empty first param
- test: input empty second param
- test: input empty both params(bug)
- test: input mixed array even length
- test: input mixed array odd length
- test: input not sorted first array
- test: input not sorted second array
- test: input not mixed odd
- test: input not mixed even
- test: input two elements equal(bug)

6. Automate Test cases
- see MedianOfArraysTest.java
7. Conclusion:
   When I test with empty input for both arrays, the program return -1, this can be avoided by instead of  returning -1 in the getMin function you would just return 0.
Besides that I did not find any other bugs. Another bug was in the isAscendingSorted, since it should only check whether the number is smaller and not smaller equal. I achieved 100% branch coverage right away so then I went to mutation testing. The mutation coverage was 96%. One mutant was a boundary mutator, the other was a mathmutator.
The first mutant changed the smaller than to a greater than in the getMin function and then returned the wrong result aswell, I then exposed the getMin method of the class and wrote an additional test for it, in case anyone mixes up a minimum, better be safe than sorry.
The second mutant changed the addition of the length of the arrays to a substraction, which does not have to be tested, because it does not affect the result in where it will be evaluated.
The boundary mutators I do not have

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
1. Understand the requirements
- The program should find the maximum Sum in an array, if the array is empty, should return 0.
2. Explore what the program does for various inputs:
- 0 (empty array): Crash (found my first bug)
- null (null): Crash (found bug nr2)
- Single digit (1): 1
- OnlyPositive(1,2,3): 6
- OnlyNegatives(-3,-2,-1): -1
- MixedArray (-3, 2, -1, 2): 4
3. Explore possible inputs and outputs and identify partitions
- Empty Array: Crash
- Null Array: Crash
- OnlyPositives: sum all
- Only Negatives: return largest
- MixedArray with large positive order: return sum of that order
- Mixed array with small negatives and big following positives: return sum over several negatives
- Very large ints: considered by developer, could possibly be changed to long but i think was not intended by dev
4. Analyse the boundaries
- boundary empty array and not empty array: empty just return 0 else sum array

5. Devise test cases
- test: input only negatives 
- test: input empty array
- test: input null
- test: input only positives 
- test: input mixed with large positive
- test: input mixed with overlapping sums

6. Automate test cases according to devised ones
- see MaximumSubarraySumTest.java

7. Conclusion:
When I test with empty input or null, the program crashes, this can be avoided by adding an if
and checking whether the array is null or empty, else I think its a quite elegant solutions because it solves the problem in
linear time. The other test cases all passed. Since the code does not contain any branches but only a loop, I achieved 100%
branch coverage right away with my test cases so I could skip this part. Mutation test coverage was 100% so no additional test case needed. 
