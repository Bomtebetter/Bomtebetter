package v43;

import java.util.Scanner;

public class Metoder {

	public static void main(String[] args) {

		twoNumbers();
	}

	/**
	 * Skriver 2 heltal och skickar de vidare
	 */
	public static void twoNumbers() {

		int x;
		int z;
		Scanner input = new Scanner(System.in);

		System.out.println("skriv in två olika tal");

		x = input.nextInt();
		z = input.nextInt();

		System.out.println(minstaTal(x, z));

	}

	/**
	 * Den jämför 2 heltal och utvärderar vilket som är minst. Samt skickar tillbaka
	 * ett hot
	 * 
	 * @param x
	 * @param z
	 * @return String hej
	 */

	public static String minstaTal(int x, int z) { // Om man ska skicka tillbaka en string så måste det vara "static
													// String" och inte "static Void" (samma sak gäller även int och
													// double)

		if (x <= z) {
			System.out.println("WOWOWOWO minsta talet är: " + x);
		} else {
			System.out.println("WOWOWOWO minsta talet är: " + z);
		}

		String hej = "Kys faggot programmet är färdigt";
		return hej;
	}

}
