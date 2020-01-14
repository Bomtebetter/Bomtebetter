package v3;

import java.util.Arrays;

public class BubbleRandom {

	public static void main(String[] args) {
		//Skapar en array med 37 tomma platser
		int[] numbers = new int[37];

		// Vi fyller i våran array med 37 slumpvalda heltal från 0 till 100
		for (int j = 0; j < numbers.length; j++) {
			numbers[j] = (int) (Math.random() * 100);

		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("DONE, ALL MIXED AND STUFF!!");

	}
}
