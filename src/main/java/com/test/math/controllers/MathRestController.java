package com.test.math.controllers;

import com.test.math.beans.EquationRequest;
import com.test.math.beans.SolutionResponse;
import com.test.math.services.MathService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for the math calculations
 */
@RestController
@RequestMapping(value = "/")
public class MathRestController {

	/**
	 * Variable to do the math calculations for the service
	 */
	@Autowired
  	private MathService mathService;

	/**
	 * Logger variable for debug/info purposes on the console
	 */
  	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Method to find a solution for the following equation:
	 *
	 * @param   equationRequest   This request contains the coefficients, search range
	 * @return  SolutionResponse  If we found a solution for the equation
	 */
	@RequestMapping(value = "/v1/solver", method=RequestMethod.POST, headers="Accept=application/json")
	public SolutionResponse calculateEquation(@RequestBody EquationRequest equationRequest) {
		return mathService.calculateEquation(equationRequest);
	}
}
