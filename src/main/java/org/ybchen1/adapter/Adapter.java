package org.ybchen1.adapter;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 16:51
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return adaptee.specificRequest();
    }
}
