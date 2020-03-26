package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> listaNamn = new ArrayList<String>();
		listaNamn.add("Bomas Beis"); // index 0
		listaNamn.add("Beter"); // index 1
		listaNamn.add(1, "Benis"); // index 1, beter blir flyttad 1 steg åt höger
		
		System.out.println(listaNamn);
		
		for (int i = 0; i < listaNamn.size(); i++) { // skriver ut innehållet i Arraylist mha .get & .size
			System.out.println(listaNamn.get(i));
		}
		
		listaNamn.remove(0);
		
		for (int i = 0; i < listaNamn.size(); i++) { // skriver ut innehållet i Arraylist mha .get & .size
			System.out.println(listaNamn.get(i));
		}
		
		input.close();
	}
}
