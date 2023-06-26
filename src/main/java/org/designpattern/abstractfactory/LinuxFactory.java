package org.designpattern.abstractfactory;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 10:55
 */
public class LinuxFactory implements  Factory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Text createText() {
        return new LinuxText();
    }
}
