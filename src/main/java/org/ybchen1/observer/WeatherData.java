package org.ybchen1.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 14:08
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
         this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
    public void setChanges(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> iterator=observers.iterator();
        while(iterator.hasNext()){
            Observer observer=iterator.next();
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
