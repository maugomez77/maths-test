package test;

import com.test.math.beans.EquationRequest;
import com.test.math.beans.SolutionResponse;
import com.test.math.services.MathServiceImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mgomez on 8/2/16.
 */
public class MathServiceImplTest {

    MathServiceImpl mathServiceImpl = new MathServiceImpl();

    @Test
    public void testSolution1() {
        EquationRequest request = new EquationRequest(2, 2, -59, -29, 0, 100);
        //EquationRequest request = new EquationRequest(2, 2, -59, -29, 30, 31);
        SolutionResponse response = mathServiceImpl.calculateEquation(request);
        float expected = 30f;
        float actual = response.getRoot();
        assertEquals(expected, actual, 0.0f);
    }
}
