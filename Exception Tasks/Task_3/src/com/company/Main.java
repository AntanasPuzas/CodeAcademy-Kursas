package com.company;

import Devices.Controller;
import Devices.Device;
import Devices.Monitor;
import Exceptions.DeviceIsOffException;
import Utilities.Monitoring;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DeviceIsOffException {
        Monitoring monitoring = new Monitoring();

        List<Device> deviceList = new ArrayList<>();
        deviceList.add(new Monitor(0, true));
        deviceList.add(new Controller(1, true));

        monitoring.pingAllDevices(deviceList);

        deviceList.get(1).setOn(false);

        monitoring.pingAllDevices(deviceList);
    }
}
