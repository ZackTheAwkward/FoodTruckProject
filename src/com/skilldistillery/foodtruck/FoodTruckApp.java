package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FoodTruck[] foodTruck = new FoodTruck[5];
		// TODO Create an array to store up to 5 food truck objects
		// THIS MAIN WILL BE THE ONLY STATIC METHOD

		System.out.println("Please follow the prompts given" + "\n"
				+ "Please note, if you wish to stop entering data, just type quit when prompted for a truck name. ");

		for (int i = 0; i < foodTruck.length; i++) {
			foodTruck[i] = new FoodTruck(null, null, null);
			System.out.println("Please enter the name for food truck " + i);
			foodTruck[i].setTruckName(scanner.next());
			System.out.println("Please enter the food type for truck " + i);
			foodTruck[i].setFoodType(scanner.next());
			System.out.println("Please enter the food rating for truck " + i);
			foodTruck[i].setFoodRating(scanner.next());

		}

		scanner.close();

//		System.out.println("Please enter the names for the five food trucks one at a time. ");
//			for(int i = 0; i < foodTruckNames.length; i++) {
//				foodTruckNames[i] = scanner.next();
//			}
//			System.out.println("Please enter the food types for the five food trucks one at a time. ");
//			for(int i = 0; i < foodTruckType.length; i++) {
//				foodTruckType[i] = scanner.next();
//			}
//			System.out.println("Please enter the food ratings for the five food trucks one at a time. ");
//			for(int i = 0; i < foodTruckRating.length; i++) {
//				foodTruckRating[i] = scanner.next();
//			}
//		
//			scanner.close();
		/*
		 * TODO USER STORY #1 The user is prompted to input the name, food type, and
		 * rating for up to five food trucks. For each set of input, a FoodTruck object
		 * is created, its fields set to the user's input, and it is added to the array.
		 * The truck id is not input by the user, but instead assigned automatically in
		 * the FoodTruck constructor from a static field that is incremented as each
		 * truck is created.
		 */
		// Refer to Car and ParkingLot drills in Encapsulation Drills

		/*
		 * TODO USER STORY 2 If the user inputs quit for the food truck name, input ends
		 * immediately and the program continues.
		 */
		// boolean keepGoing (isTrue) will probably help with the quit option as well
		// .toUpperCase and .equals

		/*
		 * TODO USER STORY 3 After input is complete, the user sees a menu from which
		 * they can choose to:
		 * 
		 * List all existing food trucks. See the average rating of food trucks. Display
		 * the highest-rated food truck. Quit the program.
		 * 
		 */
		// Look into using a switch to print a menu. Also look for labs that determined
		// largest and smallest number in an array

		/*
		 * TODO USER STORY 4 After choosing a menu item, the user sees the menu again
		 * and can choose another item until the choose to quit
		 */
		// Using either a for loop or while loop to keep the menu going until quit is
		// chosen. (.toUpperCasse and .equals)

	}
}
