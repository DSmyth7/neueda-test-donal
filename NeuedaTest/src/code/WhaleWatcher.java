package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WhaleWatcher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an option:\n1. All Whales\n2. Atlantic Whales\n3. Fastest Whales\n4. Average Length ");
		while(!sc.hasNextInt()) {
			System.out.println("Invalid choice");
			System.out.println("Choose an option: ");
			sc.next();
		}
		int choice = sc.nextInt();
		
		if(choice == 1) {
			 createWhale();
		}
		else if(choice == 2) {
			displayAtlantic();
		}

		else if(choice == 3) {
			displayFastest();
	}
		else if(choice == 4) {
			averageLength();
		}

	}

	// Prints all whales to the console
	private static void createWhale() {

		// Create ArrayList to store whale objects
		ArrayList<Whale> whales = new ArrayList<Whale>();

		// Create whales
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));

		// Loop through ArrayList to print out all whales
		for (Whale whale : whales) {
			whale.printDetails();
		}

	}

	// Prints all whales who swim in the Atlantic
	private static void displayAtlantic() {

		// Create ArrayList to store whale objects
		ArrayList<Whale> whales = new ArrayList<Whale>();

		// Create whales
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));

		// Loop through ArrayList to print out whale details
		for (Whale whale : whales) {

			whale.displayAtlanticWhales();
		}
	}

	private static void displayFastest() {
		// Create ArrayList to store whale objects
		ArrayList<Whale> whales = new ArrayList<Whale>();

		// Create whales
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));

		// Loop through ArrayList to print out whale details
		for (Whale whale : whales) {

			whale.displayFastest();
				
		
				
			}

			
		}
		
	private static void averageLength() {
		// Create ArrayList to store whale objects
				ArrayList<Whale> whales = new ArrayList<Whale>();

				// Create whales
				whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
				whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));
				whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
				whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));

				// Loop through ArrayList to print out whale details
				for (Whale whale : whales) {

					whale.displayLength();
										
				}

	}

}
