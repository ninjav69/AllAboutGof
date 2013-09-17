package org.ninjav.remote.devices;

import org.ninjav.remote.devices.LightFactory;

public class SimpleLightFactory implements LightFactory {

    /**
     *
     * @param location
     */
    public Light createLight(String location) {
        return new Light(location);
    }
}