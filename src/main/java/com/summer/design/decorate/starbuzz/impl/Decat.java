package com.summer.design.decorate.starbuzz.impl;

import com.summer.design.decorate.starbuzz.Beverage;

/**
 * 低咖啡因咖啡
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
