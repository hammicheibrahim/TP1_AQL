package LineCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    public void testBinarySearch() {
        // Test array
        int[] array = {1, 3, 5, 7, 9};

        // Test cases
        assertEquals(0, BinarySearch.binarySearch(array, 1));
        assertEquals(2, BinarySearch.binarySearch(array, 5));
        assertEquals(4, BinarySearch.binarySearch(array, 9));
        assertEquals(-1, BinarySearch.binarySearch(array, 2)); // Element not present
    }
}
