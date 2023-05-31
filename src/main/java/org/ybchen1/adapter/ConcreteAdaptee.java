package org.ybchen1.adapter;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 16:54
 */
public class ConcreteAdaptee implements  Adaptee{
    @Override
    public String specificRequest() {
        return "request handler by concrete adaptee";
    }
}
