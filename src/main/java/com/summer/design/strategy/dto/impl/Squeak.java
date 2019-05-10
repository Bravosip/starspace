package com.summer.design.strategy.dto.impl;

import com.summer.design.strategy.dto.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Sqeak");
    }
}
