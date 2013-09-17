/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ninjav.remote;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.ninjav.remote.devices.Light;

/**
 *
 * @author apickard
 */
public class RemoteControlTest {

    public RemoteControlTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setCommand method, of class RemoteControl.
     */
    @Test
    @Ignore
    public void testSetCommand() {
        System.out.println("setCommand");
        int slot = 0;
        Command onCommand = null;
        Command offCommand = null;
        RemoteControl instance = new RemoteControl();
        instance.setCommand(slot, onCommand, offCommand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onButtonPressed method, of class RemoteControl.
     */
    @Test
    public void testOnButtonPressed() {
        System.out.println("onButtonPressed");
        int slot = 0;
        RemoteControl instance = createRemoteControl();
        instance.onButtonPressed(slot);
    }

    /**
     * Test of offButtonPressed method, of class RemoteControl.
     */
    @Test
    public void testOffButtonPressed() {
        System.out.println("offButtonPressed");
        int slot = 0;
        RemoteControl instance = createRemoteControl();
        instance.offButtonPressed(slot);
    }

    /**
     * Test of toString method, of class RemoteControl.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        RemoteControl instance = new RemoteControl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /*
     * Helper function to create a fully initilialized remote control.
     */
    private RemoteControl createRemoteControl() {
        Light kitchenLight = new Light("Kitchen");
        Light bathroomLight = new Light("Bathroom");

        RemoteControl rc = new RemoteControl();
        rc.setCommand(0, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        rc.setCommand(1, new LightOnCommand(bathroomLight), new LightOffCommand(bathroomLight));

        return rc;
    }
}