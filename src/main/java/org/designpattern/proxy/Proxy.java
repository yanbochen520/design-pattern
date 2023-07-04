package org.designpattern.proxy;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 10:26
 */
public class Proxy implements Subject{
     private  Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void process() {
        this.beforeProcess();
        subject.process();
        this.afterProcess();
    }


    private void beforeProcess(){
        System.out.println("Before Process");
    }

    private void afterProcess(){
        System.out.println("After Process");
    }
}
