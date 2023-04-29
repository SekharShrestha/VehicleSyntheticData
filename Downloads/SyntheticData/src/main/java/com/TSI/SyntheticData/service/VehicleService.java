package com.TSI.SyntheticData.service;

import java.util.List;

import com.TSI.SyntheticData.models.Vehicle;

public interface VehicleService {

	List<Vehicle> generateVehicles(int numVehicles);
}
