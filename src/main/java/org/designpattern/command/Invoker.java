package org.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 16:14
 */
public class Invoker {

    private List<Command> commands=new ArrayList<>();


    public void addCommand(Command command){
        commands.add(command);
    }


    public void execute(){
        for (Command command:commands){
            command.execute();
        }
    }




}
