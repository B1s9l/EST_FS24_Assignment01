# frac2dec (paul)
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
