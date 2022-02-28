package com.skilldistillery.foodtruck;

public class FoodTruck {
	public String truckName;
	public String foodType;
	public double foodRating;
	public double truckId;

		
	public String toString() {
		String output = "Truck Name: " + truckName + " Food Type: " + foodType + " Food Rating: " + foodRating + " Truck ID: " + truckId ;
		return output;
	}
	
	public FoodTruck() {
		
		
	}	
	public FoodTruck(String truckName, String foodType, double foodRating) {
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
	public double getFoodRating() {
		return foodRating;
	}
	public void setFoodRating(double foodRating) {
		this.foodRating = foodRating;
	}
	 public void setTruckId(double truckId) {
		truckId = (int)Math.random()*100;
		this.truckId = truckId;
	 }
	
	
	
	
	
	
	
}
