package org.designpattern.proxy;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 10:23
 */
public class RealSubject implements Subject {
    @Override
    public void process() {
        System.out.println("Real Subject Processing");

    }
}
