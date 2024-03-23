package BranchCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {
    @Test
    public void testToRoman_BranchCoverage() {
        // Test with edge cases to achieve branch coverage
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0)); // Lower bound
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000)); // Upper bound
        // Additional tests for specific cases to achieve full branch coverage
        assertEquals("IV", RomanNumeral.toRoman(4)); // Test repetition of I
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999)); // Largest valid Roman numeral
    }
}
