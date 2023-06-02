package org.designpattern.responsibilitychain;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 15:04
 */
public class Client {
    public static void main(String[] args) {
        Handler firstHandler=new FirstHandler();
        Handler secondHandler =new SecondHandler();
        firstHandler.setNextHandler(secondHandler);
       String s= firstHandler.handler();
       System.out.println(s);
    }
}
