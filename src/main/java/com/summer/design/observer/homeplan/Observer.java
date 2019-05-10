package com.summer.design.observer.homeplan;

/**
 * 观察者
 */
public interface Observer {
    /**当气象观测值改变时，主题会把这些状态值当做方法的参数，传送给观察者*/
    public void update(float temp,float humidity,float pressure);
}
