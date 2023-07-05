package org.designpattern.composite;

/**
 * @Author: ybchen
 * @Date: 2023/7/5 10:31
 */
public abstract class Component {

    private String name;
    private  String desc;

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Component(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 定义一组抽象方法供子类实现
     */
    public abstract void add(Component component);

    public abstract boolean remove(Component component);

    public abstract void retrieve();


}
