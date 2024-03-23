package BranchCoverageTest;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    void testFizzBuzz_BranchCoverage() {
        // Test cases to cover different branches
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1));
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        // Add more test cases as needed to cover different branches
    }
}
