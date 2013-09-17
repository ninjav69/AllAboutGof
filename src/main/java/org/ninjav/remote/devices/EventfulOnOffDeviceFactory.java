/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ninjav.remote.devices;

/**
 *
 * @author ninjav
 */
public class EventfulOnOffDeviceFactory implements OnOffDeviceFactory {

    @Override
    public OnOffDevice createFan(String location) {
        return new OnOffEventDecorator(new Fan(location));
    }
}
