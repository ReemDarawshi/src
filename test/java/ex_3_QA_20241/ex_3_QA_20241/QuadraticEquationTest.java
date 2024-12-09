package ex_3_QA_20241.ex_3_QA_20241;

/**
 * Unit test for simple App.
 * Reem Darawshi 211705181
 * Jeries Ghattas 315181651
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {

    QuadraticEquation equation = new QuadraticEquation();

    @Test
    public void testInputOutOfRangeLoMamash() {
        assertEquals("Error: Input out of range", equation.classifyRoots(4, 10, 20));
    }

    @Test
    public void testInputOutOfRangeMamash() {
        assertEquals("Error: Input out of range", equation.classifyRoots(201, 150, 100));
    }

    @Test
    public void testNotQuadraticEquation() {
        assertEquals("Not a quadratic equation", equation.classifyRoots(0, 10, 20));
    }

    @Test
    public void testRealRoots() {
        assertEquals("Real roots", equation.classifyRoots(5, 20, 5));
    }

    @Test
    public void testEqualRoots() {
        assertEquals("Equal roots", equation.classifyRoots(5, 10, 5));
    }

    @Test
    public void testImaginaryRoots() {
        assertEquals("Imaginary roots", equation.classifyRoots(5, 10, 50));
    }

    @Test
    public void testMinimumBoundary() {
        assertEquals("Imaginary roots", equation.classifyRoots(5, 5, 5));
    }

    @Test
    public void testMaximumBoundary() {
        assertEquals("Imaginary roots", equation.classifyRoots(200, 200, 200));
    }

    @Test
    public void testNearMinBoundaryDeltaGreaterThanZero() {
        assertEquals("Real roots", equation.classifyRoots(5, 10, 2));
    }


    @Test
    public void testNearMaxBoundaryDeltaEqualsZero() {
        assertEquals("Imaginary roots", equation.classifyRoots(200, 200, 100));
    }

}

   
