# atoi (paul)
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
