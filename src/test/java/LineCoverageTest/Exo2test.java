package LineCoverageTest;



import org.example.Anagram;
import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exo2test{
    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
        assertFalse(Anagram.isAnagram("hello", "world"));
        assertFalse(Anagram.isAnagram("hello", "rld"));
        assertTrue(Anagram.isAnagram("chine", "niche"));
        assertTrue(Anagram.isAnagram("Astronomer", "Moon starer"));
    }

    @Test
    public void testIsAnagramWithNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "silent"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("listen", null));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    public void testIsAnagramWithNonAlphabeticalCharacters() {
        assertThrows(IllegalArgumentException.class, () -> Anagram.isAnagram("abc123", "321cba"));
        assertThrows(IllegalArgumentException.class, () -> Anagram.isAnagram("abc", "abc!"));
        assertThrows(IllegalArgumentException.class, () -> Anagram.isAnagram("abc", "ABC"));
    }
}
