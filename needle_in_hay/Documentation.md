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


**Structural Testing**

We already have 100% branch and condition coverage, so I did a good job in requirement based testing and move on to mutation testing.


**Mutation Testing**

Mutation Coverage is 100%. All Mutants were killed (Check picture).
![Bildschirmfoto 2024-03-13 um 12.49.38.png](..%2F..%2F..%2F..%2F..%2FBildschirmfoto%202024-03-13%20um%2012.49.38.png)
