package com.dileep.logisticsCompany.Instances;

import com.dileep.logisticsCompany.VehicleDesign.VehicleDesignInterface;

public class TruckVehicle implements VehicleDesignInterface {

    @Override
    public void deliver() {
        System.out.println("Delivering goods via road transport using a truck.");
    }

    @Override
    public void fuelType(String type) {
        System.out.println("Runs on "+type.toLowerCase() + " fuel with long-distance efficiency.");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Can carry loads up to 10,000 kg.");
    }
}