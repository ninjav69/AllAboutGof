package org.ninjav.remote.devices;

public class SimpleLightFactory implements LightFactory {

    /**
     *
     * @param location
     */
    @Override
    public Light createLight(String location) {
        return new Light(location);
    }
}