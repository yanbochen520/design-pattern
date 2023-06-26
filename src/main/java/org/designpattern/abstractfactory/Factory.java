package org.designpattern.abstractfactory;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 10:13
 */
public interface Factory {
    Button createButton();

    Text createText();
}
