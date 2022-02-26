package com.skilldistillery.foodtruck;

public class FoodTruck {
//TODO define fields for a unique numeric id, a name (Name of FoodTruck), and a numeric rating.
	//Refer to Cars/ParkingLot drills in Encapsulation drills
	private String truckName;
	private String foodType;
	private String foodRating;
	private double truckId;
	

		
	public String toString() {
		String output = "null";
		return output;
	}
	
	public FoodTruck() {
		
		
	}
	public FoodTruck(String truckName, String foodType, String foodRating, double truckId) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.foodRating = foodRating;
		this.truckId = truckId;
		
		
	}
	public String getTruckName() {
		return truckName;
	}
	public void setTruckName() {
		this.truckName = truckName;
	}
	
	
}

