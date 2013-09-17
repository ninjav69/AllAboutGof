package org.ninjav.remote.devices;

public class Light {

    private String location;
    private String status = "Off";

    public Light(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void on() {
        System.out.println(location + " light on");
        this.status = "On";
    }

    public void off() {
        System.out.println(location + " light off");
        this.status = "Off";
    }
}