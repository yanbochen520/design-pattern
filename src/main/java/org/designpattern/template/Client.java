package org.designpattern.template;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 9:50
 */
public class Client {
    public static void main(String[] args) {
        CarDriver carDriver=new AudiCar();
        carDriver.run();
        carDriver=new BenzCar();
        carDriver.run();
    }
}
