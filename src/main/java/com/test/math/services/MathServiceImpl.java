package com.test.math.services;

import com.test.math.beans.EquationRequest;
import com.test.math.beans.SolutionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Method to implement the MathService
 * methods
 *
 */
@Service
public class MathServiceImpl implements MathService {

	/**
	 * Logger for debug/info purposes
	 */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Method to calculate the solution for the following equation:
	 * a sin X + bX 2 + cX + d = 0
	 *
	 * @param request      Receive the coefficients and the search range to look for the solution
	 *                     that satisfy equal to 0
	 * @return SolutionResponse    If the coefficients and if the search range solves the equation,
	 *                             then we found a solution, we return the number where the equation
	 *                             is equal to zero.
	 */
	@Override
	public SolutionResponse calculateEquation(EquationRequest request) {
		int[] coefficients = request.getCoefficients();
		int[] searchRange = request.getSearchRange();
		SolutionResponse response = new SolutionResponse();
		logger.debug("coefficient a " + coefficients[0]);
		logger.debug("coefficient b " + coefficients[1]);
		logger.debug("coefficient c " + coefficients[2]);
		logger.debug("coefficient d " + coefficients[3]);
		logger.debug("search low range " + searchRange[0]);
		logger.debug("search high range " + searchRange[1]);
		for (int i = searchRange[0]; i <= searchRange[1]; i++) {
			int root = (int) (coefficients[0] *  Math.sin(i));
			logger.debug("A * Math.Sin X = " + root);
			root += (int) (coefficients[1] * Math.pow(i, 2));
			logger.debug("Previous Computation + B * X * X = " + root);
			root += coefficients[2] * i;
			logger.debug("Previous Computation + C * X = " + root);
			root += coefficients[3];
			logger.debug("Previous Computation + D = " + root);
			//root = Math.round(root * 10) / 10.0d;
			//logger.debug("Rounded Computations = " + root);
			if (root == 0) {
				response = new SolutionResponse(i);
				break;
			}
		}
		return response;
	}
}
