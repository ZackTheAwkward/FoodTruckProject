package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Please follow the prompts given, please note when asked for a Food Truck name, you may enter quit to continue to the next section");
		FoodTruck[] foodTruck = new FoodTruck[5];

		for (int i = 0; i < foodTruck.length; i++) {
			int currentTruck = i + 1;

			foodTruck[i] = new FoodTruck(null, null, 0.0);

			System.out.println("Please enter the name for food truck " + currentTruck);
			foodTruck[i].setTruckName(scanner.next());

			System.out.println("Please enter the food type for truck " + currentTruck);
			foodTruck[i].setFoodType(scanner.next());

			System.out.println("Please enter the food rating for truck " + currentTruck + " as a double");
			foodTruck[i].setFoodRating(scanner.nextDouble());

			System.out.println("If you would like to quit now, please type out quit, otherwise enter no");
			if (scanner.next().equals("quit")) {
				break;
			}
		}
		while (true) {
			System.out.println("Please select one of these options ");
			System.out.println("1: List all existing Food Trucks ");
			System.out.println("2: See average rating of the Food Trucks ");
			System.out.println("3: See highest rated food truck ");
			System.out.println("4: Quit");

			int selection = scanner.nextInt();

			if (selection == 1) {
				System.out.println("List of all existing Food Truck ");
				for (int i = 0; i < foodTruck.length; i++) {
					if (foodTruck[i] == null) {
						break;
					} else {

						System.out.println(foodTruck[i]);
					}

				}

				continue;

			} else if (selection == 2) {
				System.out.println("List of Average rating of the Food Trucks");
				for (int i = 0; i < foodTruck.length; i++) {
					if (foodTruck[i] == null) {
						break;
					} else {
						double sum = foodTruck[0].getFoodRating() +  foodTruck[1].getFoodRating()
								+ foodTruck[2].getFoodRating() + foodTruck[3].getFoodRating()
								+ foodTruck[4].getFoodRating();
						double average = sum / 5;
						System.out.println(average);
					}
				}
				continue;
			} else if (selection == 3) {
				for (int i = 0; i < foodTruck.length; i++) {
					if(foodTruck[i] == null) {
						break;
					} else {

					double large = foodTruck[0].getFoodRating();
			
					if (large < foodTruck[i].getFoodRating()) {
						large = foodTruck[i].getFoodRating();
					}
						}
					
					System.out.println("The winning food truck is " + foodTruck[i]);
				}
				continue;

			} else if (selection == 4) {
				System.out.println("Quit");
				break;
			}

		}

		scanner.close();
	}
}
