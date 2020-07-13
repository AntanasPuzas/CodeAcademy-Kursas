package Utilities;

import Devices.Device;
import Exceptions.DeviceIsOffException;

import java.util.List;

public class Monitoring {
    public void pingAllDevices(List<Device> deviceList) throws DeviceIsOffException {
        System.out.println("-----Pinging started-----");
        for (Device device : deviceList) {
            device.ping();
        }
        System.out.println("-----Pinging finished----");
    }
}
