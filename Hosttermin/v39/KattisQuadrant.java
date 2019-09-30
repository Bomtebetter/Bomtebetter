package v39;

import java.util.Scanner;

public class KattisQuadrant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int heltal1 = 0;
		int heltal2 = 0;
		
		heltal1 = input.nextInt();
		heltal2 = input.nextInt();
		
		if(heltal1 >= 0 && heltal2 >= 0) {
			System.out.println("1");
		}
		else if (heltal1 <= 0 && heltal2 >=0) {
			System.out.println("2");
		}
		else if (heltal1 <= 0 && heltal2 <=0) {
			System.out.println("3");
		}
		else if (heltal1 >= 0 && heltal2 <=0) {
			System.out.println("4");
		}
		
	}

}
