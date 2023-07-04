package org.designpattern.command;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 16:19
 */
public class StopCommand implements Command{

    private  Receiver receiver;

    public StopCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.stop();

    }
    @Override
    public void rollback(){
        receiver.open();
    }
}
