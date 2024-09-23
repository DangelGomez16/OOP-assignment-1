// Daniel A. Gomez
// UCFID 5351345
// January 26th, 2024
// Assignment 1
package assignment1;
import java.util.Random;
import java.util.Scanner;


public class Gomez_Daniel {

	public static void main(String[] args) {
		
		// First, print out the top part of every new receipt.
		System.out.println("******************************");
		System.out.println("****** S store ***************");
		System.out.println("******************************");
		
		// Next, print a unique receipt number between [1000, 2000),
		// along with a unique date in the next line between the years
		// [1900, 2100) and between the days [1, 28] in Month, Day, Year format.
		Random random = new Random();
		int upperBound = 2000;
		int lowerBound = 1000;
		
		int receiptNum = random.nextInt(lowerBound, upperBound);
		System.out.println("receipt number" + "      "  + receiptNum);
		
		monthGenerator(random);
		upperBound = 29;
		lowerBound = 1;
		int day = random.nextInt(lowerBound, upperBound);
		System.out.print(day + " ");
		
		upperBound = 2100;
		lowerBound = 1900;
		int year = random.nextInt(lowerBound, upperBound);
		System.out.println(year);
		
		// With the top part of the receipt printed out, a while loop
		// repeatedly asking to "Write item name" and "Write price" then 
		// printing the item name and cost after taxes, until the user enters
		// "DONE". 
		int itemTracker = 1;
		double priceTracker = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
	
			System.out.print("Write item name" + " ");
			String inputItem = scanner.next();
			
			// If the input for the name is "DONE", exit the loop.
			if(inputItem.equals("DONE")) {
				itemTracker--;
				break;
			}
			
			System.out.print("Write price" + " ");
			double inputPrice = scanner.nextDouble(); 
			
			
			// Makes the user inputed item until a capitalized string.
			String printItem = inputItem.substring(0, 1).toUpperCase() + inputItem.substring(1);
			System.out.print("item number " + itemTracker + " " + printItem + " ");
			 
			if(printItem.equals("Food") == false) {
				priceTracker = taxation(inputPrice, priceTracker);
			}
			else {
				System.out.println(inputPrice);
				priceTracker += inputPrice;
			}
			
			itemTracker++;
		}
		
		// Print out how many items were inputed as well as the total price.
		System.out.print(itemTracker + " items" + "      " + "total ");
		System.out.printf("%.2f\n", priceTracker);
		
		scanner.close();
		
		// Print out the bottom of the receipt. 
		for(int i = 0; i < 3; i++)
			System.out.println("******************************");

	}
	
	// Prints the price of a user inputed item with a thirty percent tax added on.
	public static double taxation(double price, double tracker) {
		
		double taxedItem = price * 1.30;
		System.out.printf("%.2f\n", taxedItem);
		tracker += taxedItem;
		return tracker; 
	}
	
	// Prints a random month.
	public static void monthGenerator(Random random) {
		
		// Randomly generate a number between [1, 12].
		int upperMonth = 13;
		int lowerMonth = 1;
		
		int month = random.nextInt(lowerMonth, upperMonth);
		
		// Print out the name of the month that correlates with the 
		// randomly generated number. 
		if(month == 1) {
			System.out.print("January" + " ");
		}
		else if(month == 2) {
			System.out.print("February" + " ");
		}
		else if(month == 3) {
			System.out.print("March" + " ");
		}
		else if(month == 4) {
			System.out.print("April" + " ");
		}
		else if(month == 5) {
			System.out.print("May" + " ");
		}
		else if(month == 6) {
			System.out.print("June" + " ");
		}
		else if(month == 7) {
			System.out.print("July" + " ");
		}
		else if(month == 8) {
			System.out.print("August" + " ");
		}
		else if(month == 9) {
			System.out.print("September" + " ");
		}
		else if(month == 10) {
			System.out.print("October" + " ");
		}
		else if(month == 11) {
			System.out.print("November" + " ");
		}
		else if(month == 12) {
			System.out.print("December" + " ");
		}
	}

}
