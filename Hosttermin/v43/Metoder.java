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

		System.out.println("skriv in tv� olika tal");

		x = input.nextInt();
		z = input.nextInt();

		System.out.println(minstaTal(x, z));

	}

	/**
	 * Den j�mf�r 2 heltal och utv�rderar vilket som �r minst. Samt skickar tillbaka
	 * ett hot
	 * 
	 * @param x
	 * @param z
	 * @return String hej
	 */

	public static String minstaTal(int x, int z) { // Om man ska skicka tillbaka en string s� m�ste det vara "static
													// String" och inte "static Void" (samma sak g�ller �ven int och
													// double)

		if (x <= z) {
			System.out.println("WOWOWOWO minsta talet �r: " + x);
		} else {
			System.out.println("WOWOWOWO minsta talet �r: " + z);
		}

		String hej = "Kys faggot programmet �r f�rdigt";
		return hej;
	}

}
