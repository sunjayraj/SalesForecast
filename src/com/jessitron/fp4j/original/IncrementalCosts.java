package com.jessitron.fp4j.original;

/**
 * Created by ssoni on 9/25/2014.
 */
public class IncrementalCosts extends PolynomialQuantity {
    public IncrementalCosts(double intercept, double slope) {
        super( new double[] {intercept, slope} );
    }

    @Override
    public String getName() {
        return "IncrementalCosts";
    }

}
