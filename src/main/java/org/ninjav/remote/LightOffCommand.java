package org.ninjav.remote;

import org.ninjav.remote.devices.*;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light != null) {
            light.off();
        }
    }
}