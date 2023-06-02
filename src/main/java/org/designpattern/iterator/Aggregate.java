package org.designpattern.iterator;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 12:45
 */

/**
 * 抽象的集合类，该集合类只用定义一个获取迭代器的接口
 */
public interface Aggregate {

    public  abstract Iterator iterator();
}
