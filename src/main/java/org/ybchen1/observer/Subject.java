package org.ybchen1.observer;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 13:26
 */

/**
 * 抽象的主题，被观察者
 */
public interface Subject {

    public abstract void addObserver(Observer o);

    public abstract void removeObserver(Observer observer);

    public abstract  void  notifyObserver();

    public abstract  void setChanges(float temperature,float pressure,float humidity);
}
