package com.test.math.beans;

/**
 * Created by mgomez on 8/2/16.
 */
public class SolutionResponse {

    /**
     * Variable to store the find solution
     */
    private float root;

    /**
     * Constructor to initialize our solution variables
     *
     * The root is set initially to a big value to
     * know if there has been any solution found for
     * the specific equation
     */
    public SolutionResponse() {
        super();
        root = Float.MAX_VALUE;
    }

    /**
     * Constructor to initialize our solution variables
     *
     */
    public SolutionResponse(float root) {
        this.root = root;
    }

    /**
     * Getter for our solution to be exposed on the API
     *
     * @return float
     */
    public float getRoot() {
        return root;
    }
}
