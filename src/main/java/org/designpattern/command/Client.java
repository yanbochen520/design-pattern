package org.designpattern.command;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 16:15
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command command=new OpenCommand(receiver);
        Invoker invoker=new Invoker();
        invoker.addCommand(command);
        invoker.execute();
    }
}
