package v41;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int heltal1 = input.nextInt();
		int heltal2 = input.nextInt();
		
		if (heltal1 < heltal2) {
			System.out.println(heltal1);
		}
		else if (heltal1 > heltal2) {;
			System.out.println(heltal2);
		}
	}

}
