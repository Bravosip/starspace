package com.summer.design.decorate.starbuzz.impl;

import com.summer.design.decorate.starbuzz.Beverage;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
