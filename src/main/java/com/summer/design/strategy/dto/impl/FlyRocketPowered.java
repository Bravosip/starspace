package com.summer.design.strategy.dto.impl;

import com.summer.design.strategy.dto.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
