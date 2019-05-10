package com.summer.design.observer;

import com.summer.design.observer.homeplan.impl.CurrentConditionDisplay;
import com.summer.design.observer.homeplan.impl.StatisticsDisplay;
import com.summer.design.observer.homeplan.impl.WeatherData;
import org.junit.Test;


public class WeatherDataTest {
    @Test
    public void testHomePlanObserver(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }

    @Test
    public void testJdkPlanObserver(){
        com.summer.design.observer.jdkplan.WeatherData weatherData = new com.summer.design.observer.jdkplan.WeatherData();
        com.summer.design.observer.jdkplan.CurrentConditionDisplay currentConditionDisplay = new com.summer.design.observer.jdkplan.CurrentConditionDisplay(weatherData);
        com.summer.design.observer.jdkplan.StatisticsDisplay statisticsDisplay = new com.summer.design.observer.jdkplan.StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}