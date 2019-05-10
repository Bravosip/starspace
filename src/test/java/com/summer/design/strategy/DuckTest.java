package com.summer.design.strategy;

import com.summer.design.strategy.dto.Duck;
import com.summer.design.strategy.dto.impl.FlyRocketPowered;
import com.summer.design.strategy.dto.impl.MallardDuck;
import com.summer.design.strategy.dto.impl.ModelDuck;
import org.junit.Test;

public class DuckTest {

    @Test
    public void testMallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
    }

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}