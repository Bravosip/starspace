package com.summer.design.decorate.starbuzz.impl;

import com.summer.design.decorate.starbuzz.Beverage;

/**
 * 深焙咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description="Dark Roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
