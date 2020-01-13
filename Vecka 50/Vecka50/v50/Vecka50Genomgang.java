package v50;

import java.util.Scanner;

public class Vecka50Genomgang {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int svar;
		boolean success = false;

		System.out.println("Write an integer");
		while (!success) {
			
			try {
				svar = input.nextInt();
				System.out.println("Your number is: " + svar);
				success = true;
			} catch (Exception e) {
				input.next();
				System.out.println("Thats not an integer...");
				
			}
		}

	}
}
