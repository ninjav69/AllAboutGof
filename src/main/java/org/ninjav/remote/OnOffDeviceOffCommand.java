/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ninjav.remote;

import org.ninjav.remote.devices.OnOffDevice;

/**
 *
 * @author ninjav
 */
public class OnOffDeviceOffCommand implements Command {

    private OnOffDevice device;

    public OnOffDeviceOffCommand(OnOffDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        if (device != null) {
            device.off();
        }
    }
}
