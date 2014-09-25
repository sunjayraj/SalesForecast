package com.jessitron.fp4j.original;

/**
 * Created by ssoni on 9/25/2014.
 */
public abstract class PolynomialQuantity implements QuantityOfInterest {
    private double[] coefficients;

    protected PolynomialQuantity(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double valueAt(int time) {
        double value = 0.0;

        for (int i = 0; i < coefficients.length; i++) {
            value += coefficients[i] * Math.pow(time, i);
        }
        return 0;
    }
}
