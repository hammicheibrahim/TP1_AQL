package BranchCoverageTest;
import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    public void testBinarySearch() {
        // Test array
        int[] array = {1, 3, 5, 7, 9};

        // Test cases
        assertEquals(0, BinarySearch.binarySearch(array, 1)); // Test first element
        assertEquals(2, BinarySearch.binarySearch(array, 5)); // Test middle element
        assertEquals(4, BinarySearch.binarySearch(array, 9)); // Test last element
        assertEquals(-1, BinarySearch.binarySearch(array, 2)); // Test element not present
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }
}