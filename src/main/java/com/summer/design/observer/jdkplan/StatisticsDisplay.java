package com.summer.design.observer.jdkplan;

import com.summer.design.observer.homeplan.DisplayElement;
import com.summer.design.observer.homeplan.Subject;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement {
    /**最高温度*/
    private float maxTemperature;
    /**最低温度*/
    private float minTemperature;
    private boolean isInitialization;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("今日最高气温:"+maxTemperature+"，最低气温：" + minTemperature);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            float temp = weatherData.getTemperature();
            if (!isInitialization) {
                maxTemperature = temp;
                minTemperature = temp;
                isInitialization = true;
            }
            if (temp > maxTemperature) {
                maxTemperature = temp;
            }
            if (temp < minTemperature) {
                minTemperature = temp;
            }
            display();
        }

    }
}
