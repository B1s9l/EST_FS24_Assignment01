package zest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTwoTest {

    @Test
    public void testPalindromeZero() {
        Assertions.assertTrue(PalindromeTwo.isPalindrome(0));
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
        Assertions.assertTrue(PalindromeTwo.isPalindrome(1));
    }
    @Test
    public void testPalindromeTwoDigits() {
        Assertions.assertTrue(PalindromeTwo.isPalindrome(11));
    }
    @Test
    public void testPalindromeTwoDigitsNot() {
        Assertions.assertFalse(PalindromeTwo.isPalindrome(10));
    }

    @Test
    public void testPalindromeThreeodd() {
        Assertions.assertTrue(PalindromeTwo.isPalindrome(202));
    }

    @Test
    public void testPalindromeMultiEven() {
        Assertions.assertTrue(PalindromeTwo.isPalindrome(123321));
    }
    @Test
    public void testPalindromeMultiOdd() { Assertions.assertTrue(PalindromeTwo.isPalindrome(12321)); }
    @Test
    public void testPalindromeMultiFirstNot() {
        Assertions.assertFalse(PalindromeTwo.isPalindrome(12331));
    }
    @Test
    public void testPalindromeMultiNotFirstNot() {
        Assertions.assertFalse(PalindromeTwo.isPalindrome(12332));
    }
    @Test
    public void testPalindromeUpperConstNoIn() {
        Assertions.assertFalse(PalindromeTwo.isPalindrome(1048575));
    }
    @Test
    public void testPalindromeUpperConstYesIn() {
        Assertions.assertTrue(PalindromeTwo.isPalindrome(1048401));
    }
    @Test
    public void testPalindromeUpperConstNoOut() {
        Assertions.assertFalse(PalindromeTwo.isPalindrome(1048576));
    }
    @Test
    public void testPalindromeLowerConstNo() {
        Assertions.assertFalse(PalindromeTwo.isPalindrome(-1048576));
    }
    @Test
    public void testPalindromeNegative() {
        Assertions.assertFalse(PalindromeTwo.isPalindrome(-121));
    }
}
