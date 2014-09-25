package com.jessitron.fp4j.original;

/**
 * Created by ssoni on 9/25/2014.
 */
public abstract class MonthByMonthQuantity implements QuantityOfInterest {

    private final double[] values;

    protected MonthByMonthQuantity(double[] values) {
        this.values = values;
    }

    @Override
    public double valueAt(int time) {
        return values[time -1];
    }
}
