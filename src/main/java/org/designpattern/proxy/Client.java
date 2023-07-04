package org.designpattern.proxy;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 10:31
 */
public class Client {
    public static void main(String[] args) {
        Subject subject=new RealSubject();
        Proxy proxy=new Proxy(subject);
        proxy.process();
    }
}
