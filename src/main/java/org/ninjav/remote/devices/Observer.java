package org.ninjav.remote.devices;

public interface Observer {

    /**
     *
     * @param device
     */
    void update(OnOffDevice device);
}