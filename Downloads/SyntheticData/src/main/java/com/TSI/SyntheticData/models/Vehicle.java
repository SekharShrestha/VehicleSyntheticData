package com.TSI.SyntheticData.models;

import java.util.Date;

public class Vehicle {

	private String vin;
    private String registrationNumber;
    private Date registrationDate;
    private String engineNumber;
    private String brand;
    private String model;
    private String exteriorColor;
    private String interiorColor;
    private Date manufacturingDate;
    private String type;
    private String emissionClass;
    private int odometerReading;
    private String engineType;
    private String transmissionType;
    private boolean serviceHistory;
    private double price;
    private boolean ownershipHistory;
    private Date warrantyValidity;
    private String sellingDealer;
    private String features;
    private int year;
    private String condition;
    private String location;
    private String status;
    
    
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vehicle(String vin, String registrationNumber, Date registrationDate, String engineNumber, String brand,
			String model, String exteriorColor, String interiorColor, Date manufacturingDate, String type,
			String emissionClass, int odometerReading, String engineType, String transmissionType,
			boolean serviceHistory, double price, boolean ownershipHistory, Date warrantyValidity, String sellingDealer,
			String features, int year, String condition, String location, String status) {
		super();
		this.vin = vin;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.engineNumber = engineNumber;
		this.brand = brand;
		this.model = model;
		this.exteriorColor = exteriorColor;
		this.interiorColor = interiorColor;
		this.manufacturingDate = manufacturingDate;
		this.type = type;
		this.emissionClass = emissionClass;
		this.odometerReading = odometerReading;
		this.engineType = engineType;
		this.transmissionType = transmissionType;
		this.serviceHistory = serviceHistory;
		this.price = price;
		this.ownershipHistory = ownershipHistory;
		this.warrantyValidity = warrantyValidity;
		this.sellingDealer = sellingDealer;
		this.features = features;
		this.year = year;
		this.condition = condition;
		this.location = location;
		this.status = status;
	}


	public String getVin() {
		return vin;
	}


	public void setVin(String vin) {
		this.vin = vin;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


	public String getEngineNumber() {
		return engineNumber;
	}


	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getExteriorColor() {
		return exteriorColor;
	}


	public void setExteriorColor(String exteriorColor) {
		this.exteriorColor = exteriorColor;
	}


	public String getInteriorColor() {
		return interiorColor;
	}


	public void setInteriorColor(String interiorColor) {
		this.interiorColor = interiorColor;
	}


	public Date getManufacturingDate() {
		return manufacturingDate;
	}


	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getEmissionClass() {
		return emissionClass;
	}


	public void setEmissionClass(String emissionClass) {
		this.emissionClass = emissionClass;
	}


	public int getOdometerReading() {
		return odometerReading;
	}


	public void setOdometerReading(int odometerReading) {
		this.odometerReading = odometerReading;
	}


	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public String getTransmissionType() {
		return transmissionType;
	}


	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}


	public boolean isServiceHistory() {
		return serviceHistory;
	}


	public void setServiceHistory(boolean serviceHistory) {
		this.serviceHistory = serviceHistory;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isOwnershipHistory() {
		return ownershipHistory;
	}


	public void setOwnershipHistory(boolean ownershipHistory) {
		this.ownershipHistory = ownershipHistory;
	}


	public Date getWarrantyValidity() {
		return warrantyValidity;
	}


	public void setWarrantyValidity(Date warrantyValidity) {
		this.warrantyValidity = warrantyValidity;
	}


	public String getSellingDealer() {
		return sellingDealer;
	}


	public void setSellingDealer(String sellingDealer) {
		this.sellingDealer = sellingDealer;
	}


	public String getFeatures() {
		return features;
	}


	public void setFeatures(String features) {
		this.features = features;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
