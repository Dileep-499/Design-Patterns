package com.dileep.logisticsCompany.Instances;

import com.dileep.logisticsCompany.VehicleDesign.VehicleDesignInterface;

public class SeaVehicle implements VehicleDesignInterface {
    @Override
    public void deliver() {
        System.out.println("Transporting goods via sea route.");
    }

    @Override
    public void fuelType(String type) {

        System.out.println("Powered by marine " + type.toLowerCase()+" engines.");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Can carry heavy cargo up to 20,000 kg.");
    }
}
