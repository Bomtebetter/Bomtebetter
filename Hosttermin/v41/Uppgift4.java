package v41;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int summa = 1; 
		int antalnummer = 0;
		
			while (antalnummer < 10 || summa <= 100000) {
				int tempsumma = input.nextInt();
				summa *= tempsumma;
				antalnummer++;
				
			}
				System.out.println(summa);
				System.out.println(antalnummer);
		
	}

}
