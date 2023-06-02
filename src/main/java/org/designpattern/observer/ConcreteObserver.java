package org.designpattern.observer;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 14:23
 */

/**
 * 具体的观察者类，实现一个update方法
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update(float temperature,float pressure,float humidity) {
        System.out.println(temperature);
        System.out.println(pressure);
        System.out.println(humidity);
    }



}
