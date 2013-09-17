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

/**
 *
 * @author apickard
 */
@Named
@SessionScoped
public class RemoteController implements Serializable {

    private Light kitchenLight;
    private Light bathroomLight;
    private LightOnCommand kitchenOnCommand;
    private LightOffCommand kitchenOffCommand;
    private LightOnCommand bathroomOnCommand;
    private LightOffCommand bathroomOffCommand;
    private RemoteControl rc;

    public RemoteController() {
        kitchenLight = new Light("Kitchen");
        bathroomLight = new Light("Bathroom");

        kitchenOnCommand = new LightOnCommand(kitchenLight);
        kitchenOffCommand = new LightOffCommand(kitchenLight);

        bathroomOnCommand = new LightOnCommand(bathroomLight);
        bathroomOffCommand = new LightOffCommand(bathroomLight);

        rc = new RemoteControl();
        rc.setCommand(0, kitchenOnCommand, kitchenOffCommand);
        rc.setCommand(1, bathroomOnCommand, bathroomOffCommand);
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
