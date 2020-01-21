package v3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 5, 7, 2, 7, 9, 11, 4, 2, 6, 8, 1, 3, 10 };
		int temp;
		boolean sorted;

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
		
		System.out.println("DONE, ALL SORTED AND STUFF!!");

	}

}
