package zest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static zest.MaximumSubarray.maxSubArray;

class MaximumSubarrayTest {
    @Test
    public void testEmptyArray(){
        Assertions.assertEquals(0, maxSubArray(new int[0]));
    }

    @Test
    public void testOnlyPositive(){
        int[] arr = {1,2,3};
        Assertions.assertEquals(6, maxSubArray(arr));
    }

    @Test
    public void testOnlyNegative(){
        int[] arr = {-31,-2,-3};
        Assertions.assertEquals(-2, maxSubArray(arr));
    }
    @Test
    public void testMixedOnlyPositivePart(){
        int[] arr = {-31,2,-3, -3, 4, 1, 2 , -3};
        Assertions.assertEquals(7, maxSubArray(arr));
    }
    @Test
    public void testMixedNotOnlyPositivePart(){
        int[] arr = {-31,2,3, -3, 4, 1, -2, 6, -1, 9 , -3};
        Assertions.assertEquals(19, maxSubArray(arr));
    }

    @Test
    public void testNull(){
        Assertions.assertEquals(0, maxSubArray(null));
    }
}