package test;

import com.test.math.beans.EquationRequest;
import com.test.math.beans.SolutionResponse;
import com.test.math.services.MathServiceImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Functional test class to verify the equation
 */
public class MathServiceImplTest {

    MathServiceImpl mathServiceImpl = new MathServiceImpl();

    /**
     * This test check for the valid unit test supply
     */
    @Test
    public void testSolution1() {
        EquationRequest request = new EquationRequest(2, 2, -59, -29, 0, 100);
        SolutionResponse response = mathServiceImpl.calculateEquation(request);
        float expected = 30f;
        float actual = response.getRoot();
        assertEquals(expected, actual, 0.0f);
    }

    /**
     * This test check for a not found solution for the search range
     */
    @Test
    public void testNotFoundSolution1() {
        EquationRequest request = new EquationRequest(2, 2, -59, -29, 10, 20);
        SolutionResponse response = mathServiceImpl.calculateEquation(request);
        float expected = Float.MAX_VALUE;
        float actual = response.getRoot();
        assertEquals(expected, actual, 0.0f);
    }

    /**
     * This test check for a not found solution for the search range
     */
    @Test
    public void testNotFoundSolution2() {
        EquationRequest request = new EquationRequest(1, 2, 30, 1, -1000, 2000);
        SolutionResponse response = mathServiceImpl.calculateEquation(request);
        float expected = Float.MAX_VALUE;
        float actual = response.getRoot();
        assertEquals(expected, actual, 0.0f);
    }

    /**
     * This test check for a not found solution for the search range
     */
    @Test
    public void testNotValidRange() {
        EquationRequest request = new EquationRequest(1, 2, 30, 1, 5, 0);
        SolutionResponse response = mathServiceImpl.calculateEquation(request);
        float expected = Float.MAX_VALUE;
        float actual = response.getRoot();
        assertEquals(expected, actual, 0.0f);
    }
}
