package org.designpattern.responsibilitychain;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 14:55
 */
public abstract class Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    public Handler getNextHandler(){
        return this.nextHandler;
    }

     abstract  String handler();
}
