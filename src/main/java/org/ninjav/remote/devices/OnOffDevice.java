package org.ninjav.remote.devices;

public interface OnOffDevice {

    void on();

    void off();

    String getLocation();

    String getStatus();
}