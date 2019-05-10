package com.summer.design.strategy.dto.impl;

import com.summer.design.strategy.dto.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
