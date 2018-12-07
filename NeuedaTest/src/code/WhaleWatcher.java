package code;

import java.util.ArrayList;


public class WhaleWatcher {

	public static void main(String[] args) {
		
		//Execute method to create Array List of whales
		createWhale();

	}
	
	private static void createWhale() {
		
		//Create ArrayList to store whale objects
		ArrayList<Whale> whales = new ArrayList<Whale>();
		
		//Create whales
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));
		
		//Loop through ArrayList to print out whale details
		for(Whale whale : whales) {
			whale.printDetails();
		}
		
	}
	
	

}
