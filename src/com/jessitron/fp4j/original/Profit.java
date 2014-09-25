package com.jessitron.fp4j.original;

/**
 * Created by ssoni on 9/25/2014.
 */
public class Profit implements QuantityOfInterest {

    private Sales sales;
    private IncrementalCosts incrementalCosts;

    public Profit(Sales sales, IncrementalCosts incrementalCosts, FixedCosts fixedCosts) {
        this.sales = sales;
        this.incrementalCosts = incrementalCosts;
        this.fixedCosts = fixedCosts;
    }

    private FixedCosts fixedCosts;

    @Override
    public String getName() {
        return "Profit";
    }

    @Override
    public double valueAt(int time) {
        return sales.valueAt(time) - (incrementalCosts.valueAt(time) + fixedCosts.valueAt(time));
    }
}
