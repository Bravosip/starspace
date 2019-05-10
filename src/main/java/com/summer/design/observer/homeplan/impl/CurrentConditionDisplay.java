package com.summer.design.observer.homeplan.impl;

import com.summer.design.observer.homeplan.DisplayElement;
import com.summer.design.observer.homeplan.Observer;
import com.summer.design.observer.homeplan.Subject;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    /**温度*/
    private float temperature;
    /**湿度*/
    private float humidity;
    /**气压*/
    private float pressure;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度:"+temperature+"，当前湿度：" + humidity + "，当前气压："+ pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
