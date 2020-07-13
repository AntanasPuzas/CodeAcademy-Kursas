package Devices;

import Exceptions.DeviceIsOffException;

public class Device {
    boolean isOn;
    long id;

    public Device(long id, boolean isOn) {
        this.id = id;
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void ping() throws DeviceIsOffException{
        if (isOn) {
            System.out.println("Device " + Device.class.getSimpleName() + " " + id + " is ON");
        } else {
            throw new DeviceIsOffException("Device " + Device.class.getSimpleName() + " " + id + " is OFF");
        }
    }
}
