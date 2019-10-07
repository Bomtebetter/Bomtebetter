package v40;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int heltal1 = input.nextInt();
		int heltal2 = input.nextInt();
		int heltal3 = input.nextInt();
		
		for (int i = 1; i <= heltal3; i++) {
			if (i % heltal1 == 0 && i % heltal2 == 0) {
				System.out.println("FizzBuzz"); //gör saker
			}
			else if (i % heltal1== 0) {
				System.out.println("Fizz"); //gör också saker
			}
			else if (i % heltal2== 0) {
				System.out.println("Buzz"); //gör andra saker
			} 
			else {
				System.out.println(i); //skriver ut saker
			}
		}
		
	}

}
