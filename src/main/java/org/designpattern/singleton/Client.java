package org.designpattern.singleton;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:19
 */
public class Client {

    public static void main(String[] args) {
        Singleton singletonInstance=Singleton.getInstance();
        Singleton singletonInstance1=Singleton.getInstance();
        System.out.println(singletonInstance1==singletonInstance);


    }
}
