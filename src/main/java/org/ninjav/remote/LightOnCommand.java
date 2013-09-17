package org.ninjav.remote;

import org.ninjav.remote.devices.*;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light != null) {
            light.on();
        }
    }
}