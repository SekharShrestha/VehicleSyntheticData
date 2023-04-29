package com.TSI.SyntheticData.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.TSI.SyntheticData.models.Vehicle;
import com.TSI.SyntheticData.service.VehicleService;

import net.datafaker.Faker;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final Faker faker;

    public VehicleServiceImpl() {
        this.faker = new Faker();
    }

    @Override
    public List<Vehicle> generateVehicles(int numVehicles) {
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < numVehicles; i++) {
            Vehicle vehicle = new Vehicle();
//          vehicle.setVin(((String) faker).vehicle().vin());
            vehicle.setVin(faker.vehicle().vin());

            vehicle.setRegistrationNumber(faker.regexify("[A-Z]{2}\\d{2}\\s[A-Z]{3}"));
            vehicle.setRegistrationDate(faker.date().past(20, TimeUnit.DAYS));
            vehicle.setEngineNumber(faker.regexify("[A-Z0-9]{8}"));
            vehicle.setBrand(faker.vehicle().make());
            vehicle.setModel(faker.vehicle().model());
            vehicle.setExteriorColor(faker.color().name());
            vehicle.setInteriorColor(faker.color().name());
            vehicle.setManufacturingDate(faker.date().past(365, TimeUnit.DAYS));
            vehicle.setType(faker.vehicle().carType());
            vehicle.setEmissionClass(faker.regexify("[A-Z]{1,2}-\\d{1,2}"));
            vehicle.setOdometerReading(faker.number().numberBetween(0, 100000));
            vehicle.setEngineType(faker.vehicle().fuelType());
            vehicle.setTransmissionType(faker.vehicle().transmission());
            vehicle.setServiceHistory(faker.bool().bool());
            vehicle.setPrice(faker.number().randomDouble(2, 5000, 50000));
            vehicle.setOwnershipHistory(faker.bool().bool());
            vehicle.setWarrantyValidity(faker.date().future(2, TimeUnit.DAYS));
            vehicle.setSellingDealer(faker.name().fullName());
            vehicle.setFeatures(faker.regexify("[a-z]{10,15},[a-z]{10,15},[a-z]{10,15}"));
            vehicle.setYear(faker.number().numberBetween(2010, 2023));
            vehicle.setCondition(faker.options().option("new", "used", "certified pre-owned"));
            vehicle.setLocation(faker.options().option("OEM", "Dealer", "Customer"));
            vehicle.setStatus(faker.options().option("In-stock", "Invoiced", "Reserved", "Delivered"));
            vehicles.add(vehicle);
        }
        return vehicles;
    }
}

