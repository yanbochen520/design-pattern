package org.designpattern.abstractfactory;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 10:56
 */
public class LinuxButton implements Button{
    @Override
    public void display() {
        System.out.println("LinuxButton DisPlay");
    }
}
