package org.designpattern.command;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 16:15
 */
public class Receiver {

    public void open(){
        System.out.println("OPEN PROCESSING");
    }
    public void stop(){
        System.out.println("STOP PROCESSING");
    }

}
