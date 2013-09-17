/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ninjav.remote.controller;

import java.io.Serializable;
import javax.ejb.Startup;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.ninjav.remote.LightOffCommand;
import org.ninjav.remote.LightOnCommand;
import org.ninjav.remote.RemoteControl;
import org.ninjav.remote.devices.Light;
import org.ninjav.remote.devices.LightFactory;
import org.ninjav.remote.devices.SimpleLightFactory;

/**
 *
 * @author apickard
 */
@Named
@SessionScoped
public class RemoteController implements Serializable {

    private Light kitchenLight;
    private Light bathroomLight;
    private RemoteControl rc;

    public RemoteController() {
        // Better to have a factory instantiate the lights. That way we
        // can change the family of lights by changing the factory.
        // We could later extend Light by adding a decorator that implements
        // the observer design pattern - giving us added functionality that
        // addresses cross-cutting concerns (that of introducing events) without
        // changing the code of Light.
        LightFactory lightFactory = new SimpleLightFactory();
        kitchenLight = lightFactory.createLight("Kitchen");
        bathroomLight = lightFactory.createLight("Bathroom");

        rc = new RemoteControl();
        rc.setCommand(0,
                new LightOnCommand(kitchenLight),
                new LightOffCommand(kitchenLight));
        rc.setCommand(1,
                new LightOnCommand(bathroomLight),
                new LightOffCommand(bathroomLight));
    }

    public Light getKitchenLight() {
        return kitchenLight;
    }

    public void setKitchenLight(Light kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    public Light getBathroomLight() {
        return bathroomLight;
    }

    public void setBathroomLight(Light bathroomLight) {
        this.bathroomLight = bathroomLight;
    }

    public String onButtonPressed(Integer slot) {
        rc.onButtonPressed(slot);
        return null;
    }

    public String offButtonPressed(Integer slot) {
        rc.offButtonPressed(slot);
        return null;
    }
}
