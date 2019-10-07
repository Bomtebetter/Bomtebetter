package v41;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int heltal = input.nextInt();
		 int sum = 0;
		 while (heltal > 0) {
			 sum = sum + heltal % 10;
			 heltal = heltal / 10;
		 }
		 System.out.println(sum);
	}

}
