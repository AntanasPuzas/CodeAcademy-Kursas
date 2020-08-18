package Utilities;

import Devices.Device;
import Exceptions.DeviceIsOffException;

import java.util.List;

public class Monitoring {
    public void pingAllDevices(List<Device> deviceList) {
        System.out.println("-----Pinging started-----");
        for (Device device : deviceList) {
            try {
                device.ping();
            } catch (DeviceIsOffException ex) {
                System.out.println(ex.getException());
            }
        }
        System.out.println("-----Pinging finished----");
    }
}
