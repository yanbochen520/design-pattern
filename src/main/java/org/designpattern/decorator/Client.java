package org.designpattern.decorator;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 15:17
 */
public class Client {
    public static void main(String[] args) {
      Component undecorator=new UnDecorator("undecorator");
      Component decorator1= new Decorator("decorator1",undecorator);
      Component decorator2= new Decorator("decorator2",decorator1);
      System.out.println(undecorator.show());
      System.out.println(decorator1.show());
      System.out.println(decorator2.show());


    }
}
