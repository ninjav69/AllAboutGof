package org.ninjav.remote.devices;

public interface Subject {

    /**
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     *
     * @param o
     */
    void removeObserver(Observer o);

    void notifyObservers();
}