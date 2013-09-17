package org.ninjav.remote;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Not doing anything.");
    }
}