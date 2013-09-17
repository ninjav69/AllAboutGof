/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ninjav.remote.devices;

import org.ninjav.remote.devices.Light;

/**
 *
 * @author ninjav
 */
public interface LightFactory {

    public Light createLight(String location);
}
