package org.ybchen1.state;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 17:13
 */
public class ConcreteIIState  implements State{

    private  Context context;

    private  String name;
    public ConcreteIIState(String name,Context context) {
        this.name = name;
        this.context=context;
    }
    @Override
    public String handler1() {
        String answer=this.name+"处理1";
        context.setState(new ConcreteIIState("状态1",context));
        return  answer;

    }

    @Override
    public String handler2() {
        String answer=this.name+"处理2";
        context.setState(new ConcreteIIState("状态1",context));
        return  answer;
    }


}
