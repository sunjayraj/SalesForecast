package com.jessitron.fp4j.original;

/**
 * Created by ssoni on 9/25/2014.
 */
public class Sales extends MonthByMonthQuantity {
    public Sales(double[] values) {
        super(values);
    }

    @Override
    public String getName() {
        return "Sales";
    }

}
