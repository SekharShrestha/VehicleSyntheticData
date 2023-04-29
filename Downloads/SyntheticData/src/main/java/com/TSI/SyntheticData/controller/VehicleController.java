package com.TSI.SyntheticData.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TSI.SyntheticData.models.Vehicle;
import com.TSI.SyntheticData.service.VehicleService;

@RestController
public class VehicleController {
    
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/vehicles")
    public List<Vehicle> generateVehicles(@RequestParam int numVehicles) {
        return vehicleService.generateVehicles(numVehicles);
    }
    
//    @PostMapping("/vehicles")
//    public void addVehicle(@RequestBody Vehicle vehicle) {
//        vehicleService.addVehicle(vehicle);
//    }
//
//    @GetMapping("/vehicles/{vin}")
//    public Vehicle getVehicleByVin(@PathVariable String vin) {
//        return vehicleService.getVehicleByVin(vin);
//    }
//    
//    @GetMapping("/vehicles/search")
//    public List<Vehicle> searchVehicles(@RequestParam Map<String, String> filters) {
//        return vehicleService.searchVehicles(filters);
//    }
//    
//    @DeleteMapping("/vehicles/{vin}")
//    public void deleteVehicleByVin(@PathVariable String vin) {
//        vehicleService.deleteVehicleByVin(vin);
//    }
//
//    @PutMapping("/vehicles/{vin}")
//    public void updateVehicle(@PathVariable String vin, @RequestBody Vehicle vehicle) {
//        vehicleService.updateVehicle(vin, vehicle);
//    }
}

