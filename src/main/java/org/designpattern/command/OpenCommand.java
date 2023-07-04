package org.designpattern.command;

/**
 * @Author: ybchen
 * @Date: 2023/7/4 16:19
 */
public class OpenCommand implements Command{

    private  Receiver receiver;

    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.open();
    }
    @Override
    public void rollback(){
        receiver.stop();
    }
}
