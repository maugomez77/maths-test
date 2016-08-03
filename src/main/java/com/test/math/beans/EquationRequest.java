package com.test.math.beans;

import java.util.Arrays;

/**
 * Created by mgomez on 8/2/16.
 */
public class EquationRequest {

    /**
     * Variable to store the request coefficients
     * to be used for a specified equation
     */
    private int[] coefficients = new int[4];

    /**
     * Variable to store the request search range
     * to be used for a specified equation
     */
    private int[] searchRange = new int[2];

    /**
     * Default constructor
     */
    public EquationRequest() {
        super();
    }

    /**
     * Specific constructor to initialize our variables
     * to be used on the equations
     *
     * @param a       First coefficient
     * @param b       Second coefficient
     * @param c       Third coefficient
     * @param d       Fourth coefficient
     * @param low     Search range for lower level
     * @param high    Search range for upper level
     */
    public EquationRequest(int a, int b, int c, int d, int low, int high) {
        super();
        coefficients[0] = a;
        coefficients[1] = b;
        coefficients[2] = c;
        coefficients[3] = d;
        searchRange[0] = low;
        searchRange[1] = high;
    }

    /**
     * The getter for coefficients variable
     *
     * @return int[]
     */
    public int[] getCoefficients() {
        return coefficients;
    }

    /**
     * The getter for search range variable
     * @return int[]
     */
    public int[] getSearchRange() {
        return searchRange;
    }

    /**
     * The setter method for coefficients variable
     *
     * @param coefficients
     */
    public void setCoefficients(int[] coefficients) {
        this.coefficients = coefficients;
    }

    /**
     * The setter method for search range variable
     *
     * @param searchRange
     */
    public void setSearchRange(int[] searchRange) {
        this.searchRange = searchRange;
    }

	@Override
	public String toString() {
		return "EquationRequest [coefficients=" + Arrays.toString(coefficients) + ", searchRange="
				+ Arrays.toString(searchRange) + "]";
	}
  
}
