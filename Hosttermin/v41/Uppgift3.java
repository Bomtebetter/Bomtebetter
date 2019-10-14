package v41;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int x = 0;
		int z = 0;
		
		System.out.println("Skriv in heltal så får du summan och medelvärdet av heltalen. Skriv 0 för att avsluta. ");
		do {
			x = input.nextInt();
			z = z + x;
			if (x > 0) {
				i++;
			}
			if(x == 0) {
				System.out.println("Medelvärdet: " +  z/i + "\n" + "Summan: " + z);
				break;
			}
		}
		while (x>0);
		
		
				

	}

}
