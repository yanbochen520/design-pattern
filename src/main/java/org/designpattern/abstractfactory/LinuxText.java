package org.designpattern.abstractfactory;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 11:21
 */
public class LinuxText implements Text{
    @Override
    public void display() {
        System.out.println("LinuxText DisPlay");
    }
}
