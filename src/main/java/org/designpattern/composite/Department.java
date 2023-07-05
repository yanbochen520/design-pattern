package org.designpattern.composite;

/**
 * @Author: ybchen
 * @Date: 2023/7/5 10:45
 */
public class Department extends Component{
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("不支持新增操作");
    }

    @Override
    public boolean remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    @Override
    public void retrieve() {
        System.out.println(this);
        System.out.println("DEPARTMENT ELEMENT");

    }
}
