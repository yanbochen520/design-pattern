package org.ybchen1.adapter;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 16:55
 */
public class Client {


    public static void main(String[] args) {
        Adaptee adaptee=new ConcreteAdaptee();
        Target t= new Adapter(adaptee);
        String result= t.request();
        System.out.println(result);
    }
}
