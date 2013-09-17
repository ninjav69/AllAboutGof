package org.ninjav.remote.devices;

import java.util.*;

public class OnOffEventDecorator extends OnOffDecorator implements Subject {
    
    private Collection<Observer> observers = new ArrayList<Observer>();
    
    public OnOffEventDecorator(OnOffDevice device) {
        super(device);
    }
    
    @Override
    public void on() {
        device.on();
        notifyObservers();
    }
    
    @Override
    public void off() {
        device.off();
        notifyObservers();
    }
    
    @Override
    public String getLocation() {
        return device.getLocation();
    }
    
    @Override
    public String getStatus() {
        return device.getStatus();
    }

    /**
     *
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     *
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(device);
        }
    }
}