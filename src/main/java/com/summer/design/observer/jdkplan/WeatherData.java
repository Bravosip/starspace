package com.summer.design.observer.jdkplan;

import com.summer.design.observer.homeplan.Observer;
import com.summer.design.observer.homeplan.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {

    /**温度*/
    private float temperature;
    /**湿度*/
    private float humidity;
    /**气压*/
    private float pressure;
    /**测量数据发生变化*/
    public void measurementsChanged(){
        setChanged();
        //观测者主动拉取
        notifyObservers();
        //主动向观测者推送
        //notifyObservers(this);
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
