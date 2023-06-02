package org.designpattern.state;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:54
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String handler1(){
       return  this.state.handler1();
    }

    public String handler2(){
        return this.state.handler2();
    }

}
