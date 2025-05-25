package com.dileep.logisticsCompany.Factory;

import com.dileep.logisticsCompany.VehicleDesign.VehicleDesignInterface;

public interface FactoryOfVehicles {
    VehicleDesignInterface requiredVehicle(String transport, String type, String maxWeightCarries);
}
