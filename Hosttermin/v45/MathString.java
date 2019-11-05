package v45;

import java.util.Scanner;

public class MathString {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2)+4));
	//	System.out.println("svar: " + svar);
		
		Math.max(6, 9);
		
	//	System.out.println(Math.PI);
		
		String mening = "Tomas är en boomer";
		System.out.println(mening);
		
		
		Scanner input = new Scanner(System.in);
		
		String mening2 = input.nextLine();
		
		if (mening.equals("mening2")) {
			System.out.println("samma mening");
		}
		
		
		System.out.println(mening.length());
		System.out.println(mening.toUpperCase());
		System.out.println("Tomas är en boomer".contains("boomer"));
		System.out.println("         B o om e R      ".trim());
		System.out.println("tomas weis".replace('t', 'b').replace('w', 'b') );
		
		int a = 9;
		int b = 6;
		double answer = (double)a / (double)b;
		
		System.out.println(answer);
		
	}

}
