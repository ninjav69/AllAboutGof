package org.ninjav.remote.devices;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fan implements OnOffDevice {

    private String location;
    private String status;
    private static final Logger LOG = Logger.getLogger(Fan.class.getName());

    public Fan(String location) {
        this.location = location;
        this.status = "Off";
    }

    @Override
    public void on() {
        LOG.log(Level.INFO, "Turning {0} light {1}",
                new Object[]{location, status});
        status = "On";
    }

    @Override
    public void off() {
        LOG.log(Level.INFO, "Turning {0} light {1}",
                new Object[]{location, status});
        status = "Off";
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getStatus() {
        return status;
    }
}