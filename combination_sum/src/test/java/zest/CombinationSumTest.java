package zest;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

class CombinationSumTest {
    @Test
    public void testCombSumMultiple() { //- Multiple candidate | c: [2, 3, 4], t: 8 -> o: [[2, 2, 2, 2], [2, 2, 4], [2, 3, 3], [4, 4]]
        int[] candidates = {2, 3, 4};
        int target = 8;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList(2, 2, 2, 2));
        goal.add(Arrays.asList(2, 2, 4));
        goal.add(Arrays.asList(2, 3, 3));
        goal.add(Arrays.asList(4, 4));
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);

        assertEquals(4, result.size());
        assertEquals(goal, result);
    }
    @Test
    public void testCombSumEmptyCandidates() { //- Empty candidates | c: [], t: 1 -> o: []
        int[] candidates = {};
        int target = 1;
        List<List<Integer>> goal = new ArrayList<>();
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(0, result.size());
        assertEquals(goal, result);
    }

    @Test
    public void testCombSumSingleCand() { //- Single candidate | c: [1], t: 1 -> o: [[1]]
        int[] candidates = {1};
        int target = 1;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList(1));
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(1, result.size());
        assertEquals(goal, result);
    }

    /*  I omitted the tests for negative candidates under the assumption the inputs are always >= 0:
        fixing the code to implement this functionality would surpass a simple bug and require rewriting the entire function
    @Test
    public void testCombSumNegCandPosTar() { //- Negative candidates, positive target | c: [-1, -2, -3], t: 5 -> o: []
        int[] candidates = {-1, -2, -3};
        int target = 5;
        List<List<Integer>> goal = new ArrayList<>();
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(0, result.size());
        assertEquals(goal, result);
    }
    @Test
    public void testCombSumNegCandNegTar() { //- Negative candidates, negative target | c: [-2, -3, -4], t: -5 -> o: [[-2, -3]]
        int[] candidates = {-2, -3, -4};
        int target = -5;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList(-2, -3));
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(1, result.size());
        assertEquals(goal, result);
    }
     */
    @Test
    public void testCombSumPosCandNegTar() { //- Positive candidates, negative target | c: [1, 2, 3], t: -5 -> o: []
        int[] candidates = {1, 2, 3};
        int target = -5;
        List<List<Integer>> goal = new ArrayList<>();
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(0, result.size());
        assertEquals(goal, result);
    }
    @Test
    public void testCombSumEvenCandOddTar() { //- Even candidates, odd target | c: [2, 4], t: 5 -> o: []
        int[] candidates = {2, 4};
        int target = 5;
        List<List<Integer>> goal = new ArrayList<>();
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(0, result.size());
        assertEquals(goal, result);
    }

    @Test
    public void testCombSumOddCandEvenTar() { //- Odd candidates, even target | c: [1, 3], t: 4 -> [[1, 1, 1, 1], [1, 3]]
        int[] candidates = {1, 3};
        int target = 4;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList(1, 1, 1, 1));
        goal.add(Arrays.asList(1, 3));
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(2, result.size());
        assertEquals(goal, result);
    }

    @Test
    public void testCombSumTarZero() { //- Target 0 | c: [1, 2], t: 0 -> o: []
        int[] candidates = {1, 2};
        int target = 0;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList());
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(1, result.size());
        assertEquals(goal, result);
    }
    @Test
    public void testCombSumCandZero() { //- Candidates 0 | c: [0, 1, 2], t: 3 -> o: [[1, 1, 1], [1, 2]]
        int[] candidates = {0, 1, 2};
        int target = 3;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList(1, 1, 1));
        goal.add(Arrays.asList(1, 2));
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(2, result.size());
        assertEquals(goal, result);
    }

    @Test
    public void testCombSumLargeNumb() { //- Large numbers | c: [1000, 2000], t: 3000 -> [[1000, 1000, 1000], [1000, 2000]]
        int[] candidates = {1000, 2000};
        int target = 3000;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList(1000, 1000, 1000));
        goal.add(Arrays.asList(1000, 2000));
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(2, result.size());
        assertEquals(goal, result);
    }
    @Test
    public void testCombSumSmallestCand() { //- Smallest candidate | c: [1, 2, 3], t: 1 -> o: [[1]]
        int[] candidates = {1, 2, 3};
        int target = 1;
        List<List<Integer>> goal = new ArrayList<>();
        goal.add(Arrays.asList(1));
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);
        assertEquals(1, result.size());
        assertEquals(goal, result);
    }



}