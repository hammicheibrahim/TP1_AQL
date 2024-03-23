package LineCoverageTest;



import org.example.Anagram;
import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exo2test{
    @Test
    public void testIsAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
        assertFalse(Anagram.isAnagram("hello", "rld"));
        assertTrue(Anagram.isAnagram("chine", "niche"));
        assertTrue(Anagram.isAnagram("Astronomer", "Moon starer"));
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
