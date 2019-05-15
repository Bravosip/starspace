package com.summer.design.decorate.starbuzz.impl;

import com.summer.design.decorate.starbuzz.Beverage;
import com.summer.design.decorate.starbuzz.dec.CondimentDecorator;

/**
 * 牛奶
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
