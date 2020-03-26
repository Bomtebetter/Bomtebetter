package �vning;

import java.util.ArrayList;
import java.util.Collections;

public class �vning {

	public static void main(String[] args) {

		ArrayList<String> listaNamn = new ArrayList<String>();
		String[] namn = { "Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle",
				"Gustafsson Emil", "Hasic Edvin", "Helenius Anton", "Jensl�v Max", "Jonsson Svante", "Kamo Vivian",
				"Khanzade Vakil Kandi Pedram", "Leisten David", "Lindqvist Lucas", "Lindstr�m Linus",
				"Markstr�m Stenhammar Zachris", "Nelin Jacob", "Niklasson Theodor", "Nilsson Fredrik", "Norberg Max",
				"Ohlsson Andreas", "Parsa Filip", "Richardsson Filippa", "Roman David", "Romland Linus",
				"Sandstr�m Ludvig", "Simonsen Johan", "Simonsen Markus", "Tammpere Patrik", "Thil�n Philip",
				"Utbult David", "Vins Andreas" };

		// L�gg in f�ljande namn i arrayListen "namn"
		// ["Billskog Gabriel" , "Bratland Petter" , "Dahlqvist Ida" , "Erlandsson
		// Malte" , "Favoryt Kalle" , "Gustafsson Emil" , "Hasic Edvin" , "Helenius
		// Anton" , "Jensl�v Max" , "Jonsson Svante" , "Kamo Vivian" , "Khanzade Vakil
		// Kandi Pedram" , "Leisten David" , "Lindqvist Lucas" , "Lindstr�m Linus" ,
		// "Markstr�m Stenhammar Zachris" , "Nelin Jacob" , "Niklasson Theodor" ,
		// "Nilsson Fredrik" , "Norberg Max" , "Ohlsson Andreas" , "Parsa Filip" ,
		// "Richardsson Filippa" , "Roman David" , "Romland Linus" , "Sandstr�m Ludvig"
		// , "Simonsen Johan" , "Simonsen Markus" , "Tammpere Patrik" , "Thil�n Philip"
		// , "Utbult David" , "Vins Andreas"]
		for (int i = 0; i < namn.length; i++) {
			listaNamn.add(namn[i]);

		}
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}

		System.out.println();
		System.out.println("Byter p� plats 5 och 10");
		// Byt plats p� 5:e och 10:e namnet och skriv ut listan
		Collections.swap(listaNamn, 4, 9);
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}
		Collections.swap(listaNamn, 4, 9);

		System.out.println();
		System.out.println("L�gger in ett extra namn p� 1:a plats");
		// L�gg in en dublett av valfritt namn fr�n listan p� f�rsta platsen och skriv
		// ut listan
		listaNamn.add(0, "Bratland Petter");
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}
		listaNamn.remove(0);

		// Ta bort alla namn som b�rjar p� bokstaven L och skriv ut listan
		System.out.println();
		System.out.println("Tar bort alla vars deras efternamn b�rjar p� L");

		// Flytta ditt namn till f�rsta platsen och skriv ut listan
		System.out.println();
		System.out.println("Flyttar mitt namn l�ngst fram");
		

		// Sortera namnlistan omv�nd fr�n � till A
		System.out.println();
		System.out.println("Sorterar efternamn fr�n � till A");
		Collections.sort(listaNamn);
		Collections.reverse(listaNamn);
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}
	}
}
