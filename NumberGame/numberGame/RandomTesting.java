package numberGame;

import java.util.Random;
import java.util.Scanner;

public class RandomTesting {
	public static void main(String[] args) {

		String highest = highNumber();

		System.out.println(randomGenerator(highest));

	}

	public static String highNumber() {
		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in hur högt talet ska kunna gå till (Högsta är 999999)");
		String difficulty = input.nextLine();
		return difficulty;
	}

	private static int randomGenerator(String highest) {
		int hiddenNumber;
		
			if (highest.matches("^[0-9]+$")) {
				int highTop = (int) Long.parseLong(highest);
				Random ranNum = new Random();
				hiddenNumber = ranNum.nextInt(highTop) + 1;
				return hiddenNumber;
			
			} else {
				System.out.println("Skriv ett heltal");
			}
		
		return 100;
	}
}
