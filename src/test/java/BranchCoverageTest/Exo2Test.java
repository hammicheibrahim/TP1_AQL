package BranchCoverageTest;
import org.example.Anagram;
import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Exo2Test {

    @Test
    public void testIsAnagram() {
        /// branche tow elese implicite 2
        assertFalse(Anagram.isAnagram("hello", "ld"));///branche 3
        assertFalse(Anagram.isAnagram("hello", "world"));/// branche 4 , 5
        assertTrue(Anagram.isAnagram("chine", "niche"));/// branche 6 , 7

    }
    @Test
    public void testIsPalindromeWithNull() {
        /// branche one
        try {
            Anagram.isAnagram(null,null);
            fail("Expected NullPointerException, but no exception was thrown.");
        } catch (NullPointerException e) {
            assertEquals("Strings must not be null", e.getMessage());
        }
    }
}
