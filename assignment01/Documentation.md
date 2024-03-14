# Assignment 01 - Documentation
## palindrome (Basil)

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


## atoi (paul)

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

<<<<<<< HEAD
### assert_plus_sign()
This test checks if the '+' sign is read correctly when passed in as input. This test is added in structural testing phase.

### assert_input_out_of_lower_bound()
If the input string contains a negative number out of the built-in integer bound of Java, the minimal integer value is returned. This test is added in structural testing phase.

### assert_conditional_boundary_overflow()
This test ressolves the survival of a conditional boundary mutant on line 28. Makes sure that input close to Integer.MAX_VALUE doesnt return the Integer.MAX_VALUE.

### Bugs and summary
No bugs found with the 8 specification tests. To raise the code coverage closer to 100%, assert_if_str_length_0_reached() is added. assert_plus_sign and assert_input_out_of_lower_bound are added to increase branch coverage, which is at 100% after incorporating them. During mutation testing, assert_conditional_boundary_overflow is inserted to kill a conditional boundary mutant on line 28. The mutation coverage is 100%.

## combination_sum
## frac2dec
=======
## combination_um
## frac2dec (paul)
>>>>>>> main

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

### assert_one_over_minus_two()
This test makes sure that the negative signs are handled correctly such that a high condition + branch coverage is achieved.

### assert_minus_one_over_minus_four()
This test makes sure that the negative signs are handled correctly such that a high condition + branch coverage is achieved.

### assert_nominator_zero()
This test ensures that "0" is returned when 0 is passed as input to the nominator argument. This test kills a conditional boundary mutant.

### Bugs and summary
To fix the bug caused by zero division, add an if clause at the start of the function definition to check if denominator == 0 then return null. The sixth, seventh and eighth tests are added in structural testing phase. Without them, the test suite shows a low branch coverage due to res.append() (line 15) call to add a '-' sign to output string. The test suite shows 93% branch coverage, which is sufficiently good because the last missing branch happens at the nominator == 0 branch, it's purpose make edge case efficient. In the case of nominator != 0, the program should continue running. There is no other branch to test. The overall code coverage is at 98%, with the remaining 2% correspond to class name definition.
While perfoming mutation testing, line 11 and line 15 show some surviving conditional boundary mutants. While the mutant on line 11 is fixed by adding the last test, it is not required to write tests for line 15 because even if the code uses >= instead of >, the case of either or both input being zero is already taken care of in the first two if-statements of the program. Thus the test suite has a mutation score of 90%.

## median_of_arrays
## generate_parentheses
## needle_in_hay (max)
## maximum_subarray (gianni)