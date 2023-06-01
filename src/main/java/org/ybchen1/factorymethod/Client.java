package org.ybchen1.factorymethod;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 17:14
 */
public class Client {



    public static void main(String[] args) {
        Factory factory=new ConcreteFactory();
        Factory factory1=new ConcreteFactoryI();
        Product product=factory.createProduct();
        Product product1=factory1.createProduct();
        product1.show();
        product.show();
    }
}
