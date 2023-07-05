package org.designpattern.facade;

/**
 * @Author: ybchen
 * @Date: 2023/7/5 10:02
 */
public class Client {

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.service();
    }
}
