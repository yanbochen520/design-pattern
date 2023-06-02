package org.designpattern.singleton;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:17
 */

/**
 * hungry method
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }

}
