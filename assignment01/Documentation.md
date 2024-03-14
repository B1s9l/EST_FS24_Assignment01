# Assignment 01 - Documentation
## palindrome


## atoi

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
## frac2dec

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
## needle_in_hay
Max
## maximum_subarray
Gianni