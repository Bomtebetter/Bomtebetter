package v41;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int x = 0;
		int z = 0;
		
		System.out.println("Skriv in heltal s� f�r du summan och medelv�rdet av heltalen. Skriv 0 f�r att avsluta. ");
		do {
			x = input.nextInt();
			z = z + x;
			if (x > 0) {
				i++;
			}
			if(x == 0) {
				System.out.println("Medelv�rdet: " +  z/i + "\n" + "Summan: " + z);
				break;
			}
		}
		while (x>0);
		
		
				

	}

}
