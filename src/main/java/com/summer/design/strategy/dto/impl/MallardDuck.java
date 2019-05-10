package com.summer.design.strategy.dto.impl;

import com.summer.design.strategy.dto.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
