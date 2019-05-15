package com.summer.design.decorate.starbuzz.dec;

import com.summer.design.decorate.starbuzz.Beverage;

/**
 * 调料（装饰者类）
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
