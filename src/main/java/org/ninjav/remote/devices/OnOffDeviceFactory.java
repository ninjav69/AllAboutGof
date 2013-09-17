/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ninjav.remote.devices;

/**
 *
 * @author ninjav
 */
public interface OnOffDeviceFactory {

    public OnOffDevice createFan(String location);
}
