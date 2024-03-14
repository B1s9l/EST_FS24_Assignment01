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

### Bugs
No bugs found with the 8 specified tests.

## combination_um
## frac2dec (paul)

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

### Bugs
To fix the bug caused by zero division, add an if clause at the start of the function definition to check if denominator == 0 then return null. 

## median_of_arrays
## generate_parentheses
## needle_in_hay (max)
## maximum_subarray (gianni)