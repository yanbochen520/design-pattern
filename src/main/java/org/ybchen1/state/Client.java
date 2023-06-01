package org.ybchen1.state;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 17:22
 */
public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.setState(new ConcreteState("状态1",context));
        String s=context.handler1();
        System.out.println(s);
        System.out.println(context.handler2());

    }
}
