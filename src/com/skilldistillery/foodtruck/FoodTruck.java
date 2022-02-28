package com.skilldistillery.foodtruck;

public class FoodTruck {
//TODO define fields for a unique numeric id, a name (Name of FoodTruck), and a numeric rating.
	//Refer to Cars/ParkingLot drills in Encapsulation drills
	public String truckName;
	public String foodType;
	public String foodRating;
	public double truckId;
	

		
	public String toString() {
		String output = "Truck Name: " + truckName + " Food Type: " + foodType + " Food Rating: " + foodRating + " Truck ID: " + truckId ;
		return output;
	}
	
	public FoodTruck() {
		
		
	}	
	public FoodTruck(String truckName, String foodType, String foodRating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.foodRating = foodRating;
	}
	
	public String getTruckName() {
		return truckName;
	}
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodRating() {
		return foodRating;
	}
	public void setFoodRating(String foodRating) {
		this.foodRating = foodRating;
	}
	
	
	
	
	
	
	
	
}

