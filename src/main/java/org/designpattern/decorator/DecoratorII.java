package org.designpattern.decorator;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 15:13
 */
public class DecoratorII extends  Component{

    private Component component;
    public DecoratorII(String name, Component component) {
        super(name);
        this.component=component;
    }

    @Override
    public String show() {
        return this.component.show()+this.getName();
    }
}
