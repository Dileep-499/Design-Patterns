package com.dileep.logisticsCompany.Instances;

import com.dileep.logisticsCompany.VehicleDesign.VehicleDesignInterface;

public class DroneVehicle implements VehicleDesignInterface {
    @Override
    public void deliver() {
        System.out.println("Delivering items via drone.");
    }

    @Override
    public void fuelType(String type) {
        System.out.println("Type of "+ type.toLowerCase()  +" Vehicle which is Fully charges in 2 hours and provides up to 24 hours of battery life.");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Can carry a maximum load of up to 5 kg.");
    }
}
