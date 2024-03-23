package LineCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void testSolve() {
        // Test when a is zero
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 2));

        // Test when delta is negative
        assertNull(QuadraticEquation.solve(1, 2, 3));

        // Test when delta is zero
        double a = 1;
        double b = -2;
        double c = 1;
        double[] expectedRoot = {1.0};
        assertArrayEquals(expectedRoot, QuadraticEquation.solve(a, b, c));

        // Test when delta is positive
        double a2 = 1;
        double b2 = -3;
        double c2 = 2;
        double[] expectedRoots = {2.0, 1.0};
        assertArrayEquals(expectedRoots, QuadraticEquation.solve(a2, b2, c2));
    }
}