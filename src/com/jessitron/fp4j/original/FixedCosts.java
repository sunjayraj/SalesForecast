package com.jessitron.fp4j.original;

/**
 * Created by ssoni on 9/25/2014.
 */
public class FixedCosts extends PolynomialQuantity {
    public FixedCosts(double constant) {
        super(new double[] {constant} );
    }

    @Override
    public String getName() {
        return "FixedCosts";
    }
}
