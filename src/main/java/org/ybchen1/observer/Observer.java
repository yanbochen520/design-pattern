package org.ybchen1.observer;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 13:43
 */
public interface Observer {

    public  abstract  void update(float temperature,float pressure,float humidity);
}
