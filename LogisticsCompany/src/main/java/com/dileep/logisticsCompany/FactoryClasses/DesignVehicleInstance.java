package com.dileep.logisticsCompany.FactoryClasses;

import com.dileep.logisticsCompany.Factory.FactoryOfVehicles;
import com.dileep.logisticsCompany.Instances.DroneVehicle;
import com.dileep.logisticsCompany.Instances.SeaVehicle;
import com.dileep.logisticsCompany.Instances.TruckVehicle;
import com.dileep.logisticsCompany.VehicleDesign.VehicleDesignInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignVehicleInstance implements FactoryOfVehicles {

    private final List<String> DroneFuelType = Arrays.asList("chargeable", "battery", "reusable");
    private final List<String> fuelType = Arrays.asList("petrol", "diesel");

    @Override
    public VehicleDesignInterface requiredVehicle(String transport, String type, String maxWeightCarries) {
        long maxWeight = Long.parseLong(
                maxWeightCarries.replaceAll("[^0-9]", "")
        );
        type = type.toLowerCase();
        if (transport.equalsIgnoreCase("air") && maxWeight <= 5 &&
                DroneFuelType.contains(type)) {
            return new DroneVehicle();
        } else if (transport.equalsIgnoreCase("road") && maxWeight <= 10000 &&
                fuelType.contains(type)) {
            return new TruckVehicle();
        } else if (transport.equalsIgnoreCase("sea") && maxWeight <= 20000 &&
                fuelType.contains(type)){
            return new SeaVehicle();
        }else {
            throw new IllegalArgumentException("No suitable vehicle found for the given parameters.");
        }
    }
}
