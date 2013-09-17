package org.ninjav.remote.devices;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@RequestScoped
public class OnOffCdiEventBridge implements Observer {

    @Inject
    private Event<OnOffDevice> deviceEventSource;

    /**
     *
     * @param device
     */
    @Override
    public void update(OnOffDevice device) {
        deviceEventSource.fire(device);
    }
}