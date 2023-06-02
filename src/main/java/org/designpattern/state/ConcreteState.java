package org.designpattern.state;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:52
 */
public class ConcreteState implements State{

    public ConcreteState(String name,Context context) {
        this.name = name;
        this.context=context;
    }

    private  Context context;

    private String name;





    @Override
    public String handler1() {
      String answer=this.name+"处理1";
      context.setState(new ConcreteIIState("状态2",context) );
      return  answer;

    }

    @Override
    public String handler2() {
        String answer=this.name+"处理2";
        context.setState(new ConcreteIIState("状态2",context));
        return  answer;
    }
}
