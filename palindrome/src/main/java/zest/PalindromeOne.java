package zest;

public class PalindromeOne {

    public static boolean isPalindrome(int x) {
        // convert input into an array and rest is nothing but a simple two pointer solution
        char[] numbers = String.valueOf(x).toCharArray();
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] != numbers[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
