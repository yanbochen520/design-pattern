package org.designpattern.abstractfactory;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 12:34
 */
public class Client {
    public static void main(String[] args) {
        Factory factory=new WindowsFactory();
        Button button = factory.createButton();
        button.display();
        Text t=factory.createText();
        t.display();
    }
}
