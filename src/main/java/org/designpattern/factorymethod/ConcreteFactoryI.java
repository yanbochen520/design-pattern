package org.designpattern.factorymethod;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 17:05
 */
public class ConcreteFactoryI implements Factory{

    @Override
    public Product createProduct() {
        return new ConcreteProductI("product1");
    }
}
