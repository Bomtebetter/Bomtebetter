package v41;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int heltal = input.nextInt();
		 int summa = 0;
		 while (heltal > 0) {
			 summa = summa + heltal % 10;
			 heltal = heltal / 10;
		 }
		 System.out.println(summa);
	}

}
