package org.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ybchen
 * @Date: 2023/7/5 10:44
 */
public class College extends  Component{
    private List<Component> components = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Component component) {
        components.add(component);

    }

    @Override
    public boolean remove(Component component) {
        return components.remove(component);
    }

    @Override
    public void retrieve() {
        System.out.println(this);
        for (Component component:components){
            component.retrieve();
        }
    }
}
