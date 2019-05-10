package com.summer.design.decorate.starbuzz;

/**
 * 饮料基类（装饰者模式）
 */
public abstract class Beverage {
    protected  String description = "Unknow Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
