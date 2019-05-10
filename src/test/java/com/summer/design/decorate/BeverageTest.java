package com.summer.design.decorate;

import com.summer.design.decorate.starbuzz.Beverage;
import com.summer.design.decorate.starbuzz.impl.DarkRoast;
import com.summer.design.decorate.starbuzz.impl.Espresso;
import com.summer.design.decorate.starbuzz.impl.Milk;
import com.summer.design.decorate.starbuzz.impl.Mocha;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeverageTest {

    @Test
    public void testCost() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "  $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "   $" + beverage2.cost());
    }
}