package v38;

import java.util.Scanner; // m�ste vara �ver public class

public class Monday {

	public static void main(String[] args) {

		//vilkor
		boolean again = true;
		int age = 0; // initierat variabel
		int svar = 1;
		Scanner input = new Scanner(System.in); // G�r m�jligt f�r att f� en input

		if (again) {

			System.out.println("Hur gammal �r du?");
			age = input.nextInt();

			if (age >= 18) {
				System.out.println("K�ra bil och moped");

			}
			else if (age > 14 && age < 18) {System.out.println("Inte k�ra bil bara moped");}


			else System.out.println("Du �r en liten plutt");


		}
	}

}
