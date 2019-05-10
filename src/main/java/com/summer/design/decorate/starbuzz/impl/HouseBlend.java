package com.summer.design.decorate.starbuzz.impl;

import com.summer.design.decorate.starbuzz.Beverage;

/**
 * 综合咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
