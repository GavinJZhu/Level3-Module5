package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(40, RecursionMath.recursiveMultiplication(8, 5));
        assertEquals(96, RecursionMath.recursiveMultiplication(12, 8));
        assertEquals(70, RecursionMath.recursiveMultiplication(10, 7));
        assertEquals(36, RecursionMath.recursiveMultiplication(6, 6));

        // Add more JUnit tests like the one above to test your method
    }

    @Test
    public void testDivision() {
        assertEquals(1, RecursionMath.recursiveDivision(8, 2));
        assertEquals(4, RecursionMath.recursiveDivision(100, 5));
        assertEquals(2, RecursionMath.recursiveDivision(160, 4));
        assertEquals(5, RecursionMath.recursiveDivision(30, 6));
        assertEquals(1, RecursionMath.recursiveDivision(81, 3));

        // Add JUnit tests to test your method
    }

    @Test 
    public void testPower() {
        assertEquals(243, RecursionMath.recursivePower(3, 5));
        assertEquals(125, RecursionMath.recursivePower(5, 3));
        assertEquals(256, RecursionMath.recursivePower(2, 8));
        assertEquals(6561, RecursionMath.recursivePower(9, 4));
        assertEquals(16807, RecursionMath.recursivePower(7, 5));

        // Add JUnit tests to test your method
    }
}
