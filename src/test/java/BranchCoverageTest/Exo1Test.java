package BranchCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
        assertFalse(Palindrome.isPalindrome("hello"));
    }
    @Test
    public void testIsPalindromeWithNull() {
        try {
            Palindrome.isPalindrome(null);
            fail("Expected NullPointerException, but no exception was thrown.");
        } catch (NullPointerException e) {
            assertEquals("String must not be null", e.getMessage());
        }
    }
}
