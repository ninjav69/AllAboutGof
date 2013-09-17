package org.ninjav.remote;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Remote Control: \n");
        for (int i = 0; i < 7; i++) {
            sb.append("On [");
            sb.append(onCommands[i].getClass().getName());
            sb.append("] ");
            sb.append("Off [");
            sb.append(offCommands[i].getClass().getName());
            sb.append("]\n");
        }
        return sb.toString();
    }
}