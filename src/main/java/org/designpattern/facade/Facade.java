package org.designpattern.facade;

/**
 * @Author: ybchen
 * @Date: 2023/7/5 10:01
 */
public class Facade {

    public void service(){
        ModuleA a=new ModuleA();
        ModuleB b=new ModuleB();
        ModuleC c=new ModuleC();
        a.serviceA();
        b.serviceB();
        c.serviceC();
    }
}
