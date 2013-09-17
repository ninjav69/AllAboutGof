package org.ninjav.remote.devices;

public abstract class OnOffDecorator implements OnOffDevice {

    protected OnOffDevice device;

    public OnOffDecorator(OnOffDevice device) {
        this.device = device;
    }

    public OnOffDevice getDevice() {
        return device;
    }

    public void setDevice(OnOffDevice device) {
        this.device = device;
    }
}