package com.company;

/**
 * Created by Bogdan on 21.09.2016.
 */
public class MySin implements Function {
    @Override
    public double compute(double x) {
        return Math.sin(x);
    }
}
