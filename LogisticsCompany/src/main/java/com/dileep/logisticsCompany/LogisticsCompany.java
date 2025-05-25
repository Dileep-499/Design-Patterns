package com.dileep.logisticsCompany;

import com.dileep.logisticsCompany.Factory.FactoryOfVehicles;
import com.dileep.logisticsCompany.FactoryClasses.DesignVehicleInstance;
import com.dileep.logisticsCompany.VehicleDesign.VehicleDesignInterface;

public class LogisticsCompany {
    public static void main(String[] args) {
        FactoryOfVehicles designVehicleInstance = new DesignVehicleInstance();
        System.out.println("----------------------------");
        try {
            VehicleDesignInterface vehicleDesignInterface =
                    designVehicleInstance.requiredVehicle("air", "chargeable", "2kgs");

            vehicleDesignInterface.deliver();
            vehicleDesignInterface.fuelType("chargeable");
            vehicleDesignInterface.loadCapacity();

            System.out.println("----------------------------");
            vehicleDesignInterface = designVehicleInstance.requiredVehicle("air", "DiEsEl", "10001kgs");
            vehicleDesignInterface.deliver();
            vehicleDesignInterface.fuelType("dIesel");
            vehicleDesignInterface.loadCapacity();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
