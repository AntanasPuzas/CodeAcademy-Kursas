package com.company;

import java.util.ArrayList;

public class Monitoring {
    public static void pingAllDevices(ArrayList<Device> devices) {
        for (Device device : devices) {
            try {
                device.ping();
            } catch (DeviceIsOffException exception){
                System.out.println(exception.getException());
            }
        }
    }
}
