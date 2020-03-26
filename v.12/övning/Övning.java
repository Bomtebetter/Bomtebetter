package övning;

import java.util.ArrayList;
import java.util.Collections;

public class Övning {

	public static void main(String[] args) {

		ArrayList<String> listaNamn = new ArrayList<String>();
		String[] namn = { "Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle",
				"Gustafsson Emil", "Hasic Edvin", "Helenius Anton", "Jenslöv Max", "Jonsson Svante", "Kamo Vivian",
				"Khanzade Vakil Kandi Pedram", "Leisten David", "Lindqvist Lucas", "Lindström Linus",
				"Markström Stenhammar Zachris", "Nelin Jacob", "Niklasson Theodor", "Nilsson Fredrik", "Norberg Max",
				"Ohlsson Andreas", "Parsa Filip", "Richardsson Filippa", "Roman David", "Romland Linus",
				"Sandström Ludvig", "Simonsen Johan", "Simonsen Markus", "Tammpere Patrik", "Thilén Philip",
				"Utbult David", "Vins Andreas" };

		// Lägg in följande namn i arrayListen "namn"
		// ["Billskog Gabriel" , "Bratland Petter" , "Dahlqvist Ida" , "Erlandsson
		// Malte" , "Favoryt Kalle" , "Gustafsson Emil" , "Hasic Edvin" , "Helenius
		// Anton" , "Jenslöv Max" , "Jonsson Svante" , "Kamo Vivian" , "Khanzade Vakil
		// Kandi Pedram" , "Leisten David" , "Lindqvist Lucas" , "Lindström Linus" ,
		// "Markström Stenhammar Zachris" , "Nelin Jacob" , "Niklasson Theodor" ,
		// "Nilsson Fredrik" , "Norberg Max" , "Ohlsson Andreas" , "Parsa Filip" ,
		// "Richardsson Filippa" , "Roman David" , "Romland Linus" , "Sandström Ludvig"
		// , "Simonsen Johan" , "Simonsen Markus" , "Tammpere Patrik" , "Thilén Philip"
		// , "Utbult David" , "Vins Andreas"]
		for (int i = 0; i < namn.length; i++) {
			listaNamn.add(namn[i]);

		}
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}

		System.out.println();
		System.out.println("Byter på plats 5 och 10");
		// Byt plats på 5:e och 10:e namnet och skriv ut listan
		Collections.swap(listaNamn, 4, 9);
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}
		Collections.swap(listaNamn, 4, 9);

		System.out.println();
		System.out.println("Lägger in ett extra namn på 1:a plats");
		// Lägg in en dublett av valfritt namn från listan på första platsen och skriv
		// ut listan
		listaNamn.add(0, "Bratland Petter");
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}
		listaNamn.remove(0);

		// Ta bort alla namn som börjar på bokstaven L och skriv ut listan
		System.out.println();
		System.out.println("Tar bort alla vars deras efternamn börjar på L");

		// Flytta ditt namn till första platsen och skriv ut listan
		System.out.println();
		System.out.println("Flyttar mitt namn längst fram");
		

		// Sortera namnlistan omvänd från Ö till A
		System.out.println();
		System.out.println("Sorterar efternamn från Ö till A");
		Collections.sort(listaNamn);
		Collections.reverse(listaNamn);
		for (int j = 0; j < listaNamn.size(); j++) {
			System.out.println(listaNamn.get(j));
		}
	}
}
