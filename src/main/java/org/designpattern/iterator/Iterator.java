package org.designpattern.iterator;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 12:45
 */

/**
 * 抽象的迭代器接口
 * @param <T>：元素类型
 */
public interface Iterator<T> {

    public abstract boolean hasNext();

    public abstract T next();
}
