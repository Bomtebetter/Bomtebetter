package v39;

import java.util.Scanner;
public class Uppgift4 {

	public static void main(String[] args) {
		int svar1 = 0;
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Skriv in ett heltal imellan 0-10");
		svar1  = input.nextInt();
		
		if (svar1 >= 10 && svar1 <= 0){
			System.out.println("JAhooooooo");
		} 
		else{System.out.println("Seriöst... Jag sade imellan 0-10. Gör om, gör rätt!");}
		} while (svar1 > 10);
	}
}
