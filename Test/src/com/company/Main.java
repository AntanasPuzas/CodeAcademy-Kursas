package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Device> devices = new ArrayList() {
            {
                add(new Mouse(true, 0));
                add(new Mouse(false, 1));
                add(new TV(true, 2));
                add(new TV(true, 3));
                add(new TV(false, 4));
            }
        };

        Monitoring.pingAllDevices(devices);
    }
}
