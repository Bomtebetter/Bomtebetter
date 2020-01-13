package v50;

import java.util.Scanner;

public class Vecka50GenomganDel2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int index;
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = i+1;
			
		}
		System.out.println("Write an index numbaaaaah: ");
		index = input.nextInt();
		
		try {
			System.out.println(numbers[index]);
		} catch (Exception e) {
			System.out.println("N-ords unge det finns inte en 11:e i denna array");
		}
		
		
	}

}
