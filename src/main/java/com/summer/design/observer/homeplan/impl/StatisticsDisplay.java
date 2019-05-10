package com.summer.design.observer.homeplan.impl;

import com.summer.design.observer.homeplan.DisplayElement;
import com.summer.design.observer.homeplan.Observer;
import com.summer.design.observer.homeplan.Subject;

public class StatisticsDisplay implements Observer,DisplayElement {
    /**最高温度*/
    private float maxTemperature;
    /**最低温度*/
    private float minTemperature;
    private boolean isInitialization;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("今日最高气温:"+maxTemperature+"，最低气温：" + minTemperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (!isInitialization){
            maxTemperature = temp;
            minTemperature = temp;
            isInitialization = true;
        }
        if (temp > maxTemperature){
            maxTemperature = temp;
        }
        if (temp < minTemperature){
            minTemperature = temp;
        }
        display();
    }
}
