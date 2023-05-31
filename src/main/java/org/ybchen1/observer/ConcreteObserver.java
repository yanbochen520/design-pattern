package org.ybchen1.observer;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 14:23
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update(float temperature,float pressure,float humidity) {
        System.out.println(temperature);
        System.out.println(pressure);
        System.out.println(humidity);
    }



}
