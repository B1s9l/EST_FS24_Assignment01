package zest;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParenthesesTest {

    GenerateParentheses generateParentheses;

    @BeforeEach
    void setUp() {
        generateParentheses = new GenerateParentheses();
    }

    //T1
    @Test
    void zeroPairsOfParentheses(){
        List<String> emptyList = new ArrayList<>();
        List <String> returnValue = generateParentheses.generateParentheses(0);
        assertEquals(emptyList, returnValue);
    }

    //T2
    @Test
    void OnePairOfParentheses(){
        List<String> listOnePair = new ArrayList<>(1);
        listOnePair.add("()");
        List <String> returnValue = generateParentheses.generateParentheses(1);
        assertEquals(listOnePair, returnValue);
    }

    //T3
    @Test
    void ThreePairsOfParentheses(){
        List<String> listThreePair = new ArrayList<>(Arrays.asList("((()))","(()())","(())()","()(())","()()()"));
        List <String> returnValue = generateParentheses.generateParentheses(3);
        assertEquals(listThreePair, returnValue);
    }

    //T4
    @Test
    void NinePairsOfParentheses(){
        List<String> listThreePair = new ArrayList<>();
        List <String> returnValue = generateParentheses.generateParentheses(9);
        assertEquals(listThreePair, returnValue);
    }

    //T5
    @Test
    void negativeNumbers(){
        List<String> emptyList = new ArrayList<>();
        List <String> returnValue = generateParentheses.generateParentheses(-1);
        assertEquals(emptyList, returnValue);
    }








}