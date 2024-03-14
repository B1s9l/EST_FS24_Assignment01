package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromeOneTest {

    @Test
    public void manualTests() {
        assertTrue(PalindromeOne.isPalindrome(0));
        assertTrue(PalindromeOne.isPalindrome(1));
        assertTrue(PalindromeOne.isPalindrome(11));
        assertFalse(PalindromeOne.isPalindrome(12));
        assertTrue(PalindromeOne.isPalindrome(12321));
        assertFalse(PalindromeOne.isPalindrome(12331));
        //assertTrue(1234567890987654321);
        //assertFalse(1234567890123456789);
        assertFalse(PalindromeOne.isPalindrome(-121));
    }

    @Test
    public void testPalindromeWithPositiveNumber() {
        assertTrue(PalindromeOne.isPalindrome(121));
    }

    @Test
    public void testPalindromeWithNegativeNumber() {
        assertFalse(PalindromeOne.isPalindrome(-121));
    }

    @Test
    public void testPalindromeWithSingleDigit() {
        assertTrue(PalindromeOne.isPalindrome(0));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeOne.isPalindrome(123));
    }

    @Test
    public void testPalindromeWithLeadingZero() {
        assertFalse(PalindromeOne.isPalindrome(01210));
    }
}
