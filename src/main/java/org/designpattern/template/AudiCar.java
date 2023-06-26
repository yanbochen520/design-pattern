package org.designpattern.template;

/**
 * @Author: ybchen
 * @Date: 2023/6/25 14:27
 */
public class AudiCar extends   CarDriver{

    @Override
    public void start() {
     System.out.println("Auto start");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }

    @Override
    public void alarm() {
        System.out.println("Audi alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("Audi engineBoom");
    }
}
