package com.company;

public class Device {
    private boolean isOn;
    private int id;

    public Device(boolean isOn, int id) {
        this.isOn = isOn;
        this.id = id;
    }

    public Device() {
    }

    public void ping() throws DeviceIsOffException {
        if(isOn) {
            System.out.println("Device " + Device.class.getSimpleName() + " with id " + id + " is ON");
        } else {
            throw new DeviceIsOffException("Device " + Device.class.getSimpleName() + " with id " + id + " is OFF");
        }
    }
}
