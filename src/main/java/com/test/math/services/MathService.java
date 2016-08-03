package com.test.math.services;

import com.test.math.beans.EquationRequest;
import com.test.math.beans.SolutionResponse;

/**
 * This interface defines the method that the math service
 * will need to implement in order to find a solution
 * for an equation
 */
public interface MathService {
	/**
	 * Find a solution for a quadratic equation
	 *
	 * @return SolutionResponse
	 */
	public SolutionResponse calculateEquation(EquationRequest request);
}
