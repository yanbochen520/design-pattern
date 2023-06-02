package org.designpattern.responsibilitychain;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 14:58
 */
public class SecondHandler extends  Handler{
    @Override
    String handler() {
        System.out.println("SecondHandler Handler Now");
        if (this.getNextHandler()!=null){
            System.out.println("Next Handler Handler Now");
            return this.getNextHandler().handler();
        }
        return "SecondHandler Handler Over";
    }
}
