package BranchCoverageTest;


import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testIsPalindrome() {
        ///branche 2
        assertFalse(Palindrome.isPalindrome("hello"));/// branche 3 ,
        assertTrue(Palindrome.isPalindrome("kayak"));/// brnache 4 , branche
    }
    @Test
    public void testIsPalindromeWithNull() {
        //branche 1
        try {
            Palindrome.isPalindrome(null);
            fail("Expected NullPointerException, but no exception was thrown.");
        } catch (NullPointerException e) {
            assertEquals("String must not be null", e.getMessage());
        }
    }
}