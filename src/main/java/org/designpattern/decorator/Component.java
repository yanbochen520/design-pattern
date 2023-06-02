package org.designpattern.decorator;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 15:09
 */
public  abstract  class Component {

    private  String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String show();
}
