package org.designpattern.abstractfactory;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 11:07
 */
public class WindowsButton implements  Button{
    @Override
    public void display() {
        System.out.println("Windows DisPlay");
    }
}
