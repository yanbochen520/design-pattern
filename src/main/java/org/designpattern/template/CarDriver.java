package org.designpattern.template;

/**
 * @Author: ybchen
 * @Date: 2023/6/25 14:25
 */
public abstract class CarDriver {
    //可以设置一个钩子函数

    public abstract void start();

    //能停下来
    public abstract void stop();

    //喇叭会出声音
    public abstract void alarm();

    //引擎会轰隆隆地响
    public abstract void engineBoom();

    //会跑吧
    public final void run() {
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.alarm();
        //到达目的地就停车
        this.stop();
    }
}
