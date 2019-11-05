package v43;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {

		lol();

		System.out.println(max(3, 4));
		
		intN();
		
		System.out.println(KelTillCel(2));
		
		System.out.println(FahTillCel(4));
		
		Age();
		
		trappa();
	}

	/**
	 * Jag skriver HAHAHAHAHAHAH
	 */
	public static void lol() {
		System.out.println("HAHAHAHAH");
	}

	/**
	 * JAg tar och jamför vilket tal som är störst och skickar tillbaka det största
	 * av dem
	 * 
	 * @param a
	 * @param b
	 * @return svar
	 */
	public static int max(int a, int b) {
		int svar;
		if (a >= b) {
			svar = a;
		} else {
			svar = b;
		}
		return svar;
	}
	
	public static void intN() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		count(n);
	}
	
	public static void count(int n) {
		for (int i= 1; i <= n; i++) {
			System.out.println(i);
		}
		
	}
	
	public static double KelTillCel(double kelvin) {
		double celsius = kelvin + 273.15;
		return celsius;
	}
	
	public static double FahTillCel(double fahrenheit) {
		double celsius2 =  32 + 1.8*fahrenheit ;
		return celsius2;
	}

	public static void Age() {
		Scanner input = new Scanner(System.in);
		int age = 0;
	    age = input.nextInt();

		if (age <= 5) {System.out.println("Småbarn får inte göra något.");}
		else if (age >= 6 && age < 13) {System.out.println("Du får spela MINECRAFT!!.");}
		else if (age >= 13 && age < 15) {System.out.println("Du är nu tonåring.");}
		else if (age >= 15 && age < 18) {System.out.println("Du får köra moped nuuu.");}
		else if (age >= 18 && age < 21) {System.out.println("Du får köra bil nuuu.");}
		else if (age >= 21 && age < 65) {System.out.println("Du får nu vuxenstaff :^).");}
		else if (age >= 65 && age < 100) {System.out.println("Du är pensionär.");}
		else if (age >= 100) {System.out.println("R.I.P??");}
	}
	public static void trappa() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in antal trappsteg du vill ha.");
		
		int antalsteg = input.nextInt();
		
		for (int startvarde = 0; startvarde < antalsteg; startvarde++){
			
			for(int mellanrum = 1; mellanrum < antalsteg - startvarde; mellanrum++) {
				System.out.print(" ");
			}
			for(int antalx = 0; startvarde >= antalx; antalx++) {
				System.out.print("x");
			}
		System.out.println("");
		}
		
	}
}
