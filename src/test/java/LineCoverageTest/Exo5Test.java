package LineCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {
    @Test
    public void testToRoman_BranchCoverage() {
        // Test with various input values to achieve line coverage
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("II", RomanNumeral.toRoman(2));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000)); // Upper bound
    }
}