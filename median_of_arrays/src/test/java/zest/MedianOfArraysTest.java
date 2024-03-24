package zest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MedianOfArraysTest {
    private MedianOfArrays myObject;
    @BeforeEach
    public void SetUp(){
        myObject = new MedianOfArrays();
    }
    @Test
    public void testOddLength(){
        int[] arr1 = {1,2};
        int[] arr2 = {3,4,5};
        Assertions.assertEquals(3,myObject.findMedianSortedArrays(arr1,arr2));
    }
    @Test
    public void test2Equalelements(){
        int[] arr1 = {1,2, 2,2};
        int[] arr2 = {3,4,5};
        Assertions.assertEquals(2,myObject.findMedianSortedArrays(arr1,arr2));
    }
    @Test
    public void testGetMin(){
        int[] arr1 = {1,2, 2,2};
        int[] arr2 = {3,4,5};
        Assertions.assertEquals(1,myObject.getMin(arr1,arr2));
        Assertions.assertEquals(2,myObject.getMin(arr1,arr2));
        Assertions.assertEquals(2,myObject.getMin(arr1,arr2));
        Assertions.assertEquals(2,myObject.getMin(arr1,arr2));
    }
    @Test
    public void testEvenLength(){
        int[] arr1 = {1,2,5};
        int[] arr2 = {3,4,5};
        Assertions.assertEquals(3.5,myObject.findMedianSortedArrays(arr1,arr2));
    }
    @Test
    public void testMixedArraysOdd(){
        int[] arr1 = {1,4, 6, 7};
        int[] arr2 = {-1,2,3};
        Assertions.assertEquals(3,myObject.findMedianSortedArrays(arr1,arr2));
    }
    @Test
    public void testMixedArraysEven(){
        int[] arr1 = {-1,3, 7, 9};
        int[] arr2 = {-4,-3,5, 8};
        Assertions.assertEquals(4,myObject.findMedianSortedArrays(arr1,arr2));
    }
    @Test
    public void testNullFirstArray(){
        int[] arr2 = {3,4,5};
        Assertions.assertEquals(0,myObject.findMedianSortedArrays(null,arr2));
    }
    @Test
    public void testNullSecondArray(){
        int[] arr1 = {3,4,5};
        Assertions.assertEquals(0,myObject.findMedianSortedArrays(arr1,null));
    }
    @Test
    public void testEmptyBoth(){
        Assertions.assertEquals(0,myObject.findMedianSortedArrays(new int[0], new int[0]));
    }
    @Test
    public void testEmptyFirstArray(){
        int[] arr2 = {3,4,5};
        Assertions.assertEquals(4,myObject.findMedianSortedArrays(new int[0],arr2));
    }
    @Test
    public void testEmptySecondArray(){
        int[] arr2 = {3,4,5};
        Assertions.assertEquals(4,myObject.findMedianSortedArrays(arr2, new int[0]));
    }
    @Test
    public void testNotSortedFirst(){
        int[] arr1 = {-1,-3, 7, 9};
        int[] arr2 = {-4,-3,5, 8};
        Assertions.assertEquals(0,myObject.findMedianSortedArrays(arr1,arr2));
    }

    @Test
    public void testNotSortedSecond(){
        int[] arr1 = {-1,3, 7, 9};
        int[] arr2 = {-4,12,5, 8};
        Assertions.assertEquals(0,myObject.findMedianSortedArrays(arr1,arr2));
    }
}