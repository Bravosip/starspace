package com.summer.design.strategy.dto.impl;

import com.summer.design.strategy.dto.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
