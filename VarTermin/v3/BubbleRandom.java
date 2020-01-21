package v3;

import java.util.Arrays;

public class BubbleRandom {

	public static void main(String[] args) {
		// Skapar en array med 37 tomma platser
		int[] numbers = new int[37];
		int temp;
		boolean sorted;
		// Vi fyller i våran array med 37 slumpvalda heltal från 0 till 100
		for (int j = 0; j < numbers.length; j++) {
			numbers[j] = (int) (Math.random() * 100);

		}
		do {
			sorted = false;
			for (int i = 0; i < numbers.length -1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats på två intilliggande siffror
					temp = numbers[i]; // sparar tillfälligt värdet på den vänstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					sorted = true;
					System.out.println(Arrays.toString(numbers));
				}
	
			}

		} while (sorted);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("DONE, ALL MIXED AND STUFF!!");

	}
}
