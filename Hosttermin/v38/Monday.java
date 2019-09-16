package v38;

import java.util.Scanner;

public class Monday {

	public static void main(String[] args) {

		//vilkor
		boolean again = true;
		int age = 0; // initierat variabel
		int svar = 1;
		Scanner input = new Scanner(System.in); // Gör möjligt för att få en input
		
		if (again) {
		
		System.out.println("Hur gammal är du?");
		age = input.nextInt();
			
		if (age >= 18) {
			System.out.println("Köra bil och moped");
			
		}
		else if (age > 14 && age < 18) {System.out.println("Inte köra bil bara moped");}
		
		
		else System.out.println("Du är en liten plutt");
		
		System.out.println("Vill du fråga om ålder igen? skriv (1) om ja, (2) om nej");
		
		if (svar == input.nextInt()) {
			again = false;
		}
	
		}
	}

}
