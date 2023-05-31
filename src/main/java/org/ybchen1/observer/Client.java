package org.ybchen1.observer;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 14:39
 */

/**
 * 客户端；供测试使用
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new WeatherData();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.setChanges(37.0f, 100.1f, 5.2f);
        subject.removeObserver(observer);
        subject.setChanges(37.1f, 100.2f, 5.12f);

    }
}
