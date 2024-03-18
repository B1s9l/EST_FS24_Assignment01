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

**Structural Testing**

Luckily, I already have 100% coverage. So I move on to mutation testing.



**Mutation Testing**
The mutation coverage is 91%. Two mutants survived, namely:
- On line 5: replaced return value with Collections.emptyList for zest/GenerateParentheses::generateParentheses
- On line 5: changed conditional boundary

For both survived mutants there is no need to add more tests. As on line 5 we should get an empty list as a return. This is fine.
None of our tests killed mutant 2 because we didn't have a test for n = 8. The same argument as before applies.
There is no reason to think that the program behaves differently for n = 8 or n = 3, so testing if n = 3 works is enough to ensure the correctness of the program.
Adding a test with n = 8 doesn't help us. So our test suite is complete as it is.
