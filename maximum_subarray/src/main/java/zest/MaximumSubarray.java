package zest;

public class MaximumSubarray {

    public static int maxSubArray(int[] a) {
        int maxSoFar = a[0], maxEndingHere = a[0];

        for (int i = 1; i < a.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + a[i], a[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
