package org.ybchen1.factorymethod;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 17:04
 */
public class Product {
    private String  name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("我是"+name);
    }
}
