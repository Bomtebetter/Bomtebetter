package v37;

import java.util.Scanner;

public class Egenskit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String namn = input.nextLine();
		
		System.out.println("Hur gammal är du?");
		String ålder = input.nextLine();
		
		System.out.println("Vart bor du?");
		String adress = input.nextLine();
		
		System.out.println("Vad är ditt postnummer?");
		String postnummer = input.nextLine();
		
		System.out.println("I vilken stad bor du i?");
		String stad = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println("\n\nInformation:");
		System.out.println("Namn:\t\t " + namn + "\n" + "Ålder:\t\t " + ålder + "\n" + "Adress:\t\t " + adress + 
				"\n" + "\t\t " + postnummer  + "\t" + stad + "\n" + "Telefonnummer:\t " + telefonnummer);
		
	}

}
