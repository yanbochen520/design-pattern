package org.ybchen1.observer;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 13:43
 */

/**
 * 抽象的观察者类
 */
public interface Observer {

    public  abstract  void update(float temperature,float pressure,float humidity);
}
