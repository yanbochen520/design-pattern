package org.ybchen1.factorymethod;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 17:05
 */
public class ConcreteFactory implements Factory{

    @Override
    public Product createProduct() {
        return new ConcreteProduct("product");
    }
}
