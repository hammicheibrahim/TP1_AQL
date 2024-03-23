package BranchCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void testSolve() {
        double a = 1;
        double b = -2;
        double c = 1;
        double[] expectedRoot = {1.0};
        assertArrayEquals(expectedRoot, QuadraticEquation.solve(a, b, c));
    }
}