package zest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class PalindromeOneTest {
    @Test
    public void testPalindromeZero() {
        Assertions.assertTrue(PalindromeOne.isPalindrome(0));
    }
    @Test
    public void testPalindromeLeadingZero() {
        Assertions.assertTrue(PalindromeOne.isPalindrome(011));
    }
    @Test
    public void testPalindromeLeadingZeroNot() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(0110));
    }
    @Test
    public void testPalindromeSingleDigit() {
        Assertions.assertTrue(PalindromeOne.isPalindrome(1));
    }
    @Test
    public void testPalindromeTwoDigits() {
        Assertions.assertTrue(PalindromeOne.isPalindrome(11));
    }
    @Test
    public void testPalindromeTwoDigitsNot() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(12));
    }

    @Test
    public void testPalindromeMultiEven() {
        Assertions.assertTrue(PalindromeOne.isPalindrome(123321));
    }
    @Test
    public void testPalindromeMultiOdd() {
        Assertions.assertTrue(PalindromeOne.isPalindrome(12321));
    }
    @Test
    public void testPalindromeMultiFirstNot() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(12331));
    }
    @Test
    public void testPalindromeMultiNotFirstNot() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(12332));
    }
    @Test
    public void testPalindromeUpperConstNoIn() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(1048575));
    }
    @Test
    public void testPalindromeUpperConstYesIn() {
        Assertions.assertTrue(PalindromeOne.isPalindrome(1048401));
    }
    @Test
    public void testPalindromeUpperConstNoOut() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(1048576));
    }
    @Test
    public void testPalindromeLowerConstNo() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(-1048576));
    }
    @Test
    public void testPalindromeNegative() {
        Assertions.assertFalse(PalindromeOne.isPalindrome(-121));
    }

}
