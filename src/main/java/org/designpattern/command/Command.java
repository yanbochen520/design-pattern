package org.designpattern.command;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 16:14
 */
public interface Command {

    void execute();
    void rollback();

}
