package code;

import java.util.ArrayList;
import java.util.Collections;

public class Whale extends Animal {

	private String mainOcean;
	private int weight, maxSpeed, length;
	
	public Whale() {
		super();
	}

	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}

	public String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	//Method to get whale properties from object and print to console
	public void printDetails() {
		System.out.println("Whale");
		System.out.println("Name: " + this.getName());
		System.out.println("Main ocean: " + this.getMainOcean());
		System.out.println("Weight (tonnes): " + this.getWeight());
		System.out.println("Length (meters): " + this.getLength());
		System.out.println("--------------\n");
	}
	
	public void displayAtlanticWhales() {
		String ocean = this.getMainOcean();
		
		if(ocean.equals("Atlantic")) {
			System.out.println("Whale");
			System.out.println("Name: " + this.getName());
			System.out.println("Main ocean: " + this.getMainOcean());
			System.out.println("Weight (tonnes): " + this.getWeight());
			System.out.println("Length (meters): " + this.getLength());
			System.out.println("--------------\n");
		}
	}
	
	
	//Not working - trying to create arraylist of all speeds and then use max method to pull highest value
	public void displayFastest() {
		int fastest = 0;
		for(int i = 0; i < 4; i++) {
			fastest = this.getMaxSpeed();
			ArrayList<Integer> fastestArray = new ArrayList<Integer>();
							
			fastestArray.add(fastest);
			
			for (Integer fastestSpeed : fastestArray) {
				Collections.max(fastestArray);
				System.out.println(fastestSpeed);
			}
			
		}
		
	}
	
	//Not working - displays length of each each whale
	public void displayLength() {
		int average = 0;
		int sum = 0;
		
		for(int i = 0; i < this.getLength(); i++) {
			average = this.getLength();
			
		}
		
		System.out.println(average);
		
	}
	
	
}
