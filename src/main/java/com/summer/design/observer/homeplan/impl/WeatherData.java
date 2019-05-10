package com.summer.design.observer.homeplan.impl;

import com.summer.design.observer.homeplan.Observer;
import com.summer.design.observer.homeplan.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    /**温度*/
    private float temperature;
    /**湿度*/
    private float humidity;
    /**气压*/
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index > 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
             Observer observer = observers.get(i);
             observer.update(temperature,humidity,pressure);

        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
