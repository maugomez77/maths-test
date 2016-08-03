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

@RestController
@RequestMapping(value = "/")
public class MathRestController {

	@Autowired
  	private MathService mathService;
	
  	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/v1/solver", method=RequestMethod.POST, headers="Accept=application/json")
	public SolutionResponse addContact(@RequestBody EquationRequest equationRequest) {
		return mathService.calculateEquation(equationRequest);
	}
}
