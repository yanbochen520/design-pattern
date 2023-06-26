package org.designpattern.template;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 9:50
 */
public class BenzCar extends CarDriver{
    @Override
    public void start() {
        System.out.println("Benz start");
    }

    @Override
    public void stop() {
        System.out.println("Benz stop");
    }

    @Override
    public void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("Benz engineBoom");
    }
}
