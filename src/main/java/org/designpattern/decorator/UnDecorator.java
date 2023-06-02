package org.designpattern.decorator;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 15:19
 */
public class UnDecorator extends Component{
    public UnDecorator(String name) {

        super(name);
    }
    @Override
    public String show() {
        return this.getName();
    }


}
