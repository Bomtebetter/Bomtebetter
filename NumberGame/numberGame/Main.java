package numberGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean start = true;
		String diffPicker;
		int hiddenNumber;
		String guess;

		do {
			intro();
			diffPicker = difficultyChoice();
			int choose = (int) Long.parseLong(diffPicker); // s�tter antalet gissningar man har max
			int sad = (int) Long.parseLong(diffPicker); // initierar sad som h�ller koll p� hur m�nga gissningar som man har kvar
			hiddenNumber = randomGenerator();
			for (int i = 0; i < choose;) {
				guess = input.nextLine(); // Tar in gissning fr�n konsollen.
				if (guess.matches("^\\w{0,3}$")) { // g�r s� att den bara tar emot gissningar som �r 3 tecken l�nga.
					if (guess.matches("^[0-9]+$")) { // kollar via regex ifall .nextLine �r inskrivet ett tal | + g�r s� den kan l�sa flera tal
						int gissning = (int) Long.parseLong(guess);// Tar och g�r om gissningen f�rst till en Long och sedan en int
						if (gissning <= 100) {
							System.out.println("You guessed number: " + gissning);
							sad--;
							i++;
							if (gissning == hiddenNumber) { // j�mf�r gissningen med det hemliga numret
								System.out.println("You won with " + sad + " guesses remaining!");
								System.out.println("Do you want to play again? Write 1 to play again. Write something else to exit");
								playAgain(start);
							} else if (i == choose) { // j�mf�r gissningen med det hemliga numret
								System.out.println("\n" + "You lost! The number was " + hiddenNumber + "!");
								System.out.println("Do you want to play again? Write 1 to play again. Write something else to exit");
								playAgain(start);
							} else if (gissning > hiddenNumber) { // j�mf�r gissningen med det hemliga numret
								System.out.println("The hidden number is smaller than you guessed!");
								System.out.println("You have " + sad + " guesses remaining");
							} else if (gissning < hiddenNumber) {// j�mf�r gissningen med det hemliga numret
								System.out.println("The hidden number is bigger than you guessed!");
								System.out.println("You have " + sad + " guesses remaining");
							}
						} else if (gissning > 100) {
							System.out.println("The integer needs in the interval of 1-100");
						}
					} else if (guess.contains(" ") && guess.contains("-")) {
						System.out.println("Please write a positive integer with no spaces");
					} else if (guess.contains(" ")) {
						System.out.println("Please write an integer with no spaces");
					} else if (guess.contains("-")) {
						System.out.println("Please write a positive integer");
					} else {
						System.out.println("Please write an integer");
					}
				} else {
					System.out.println("Please write betweeen 1-100");
				}
			}
		} while (start == true);
	}

	/**
	 * En metod f�r att slippa att ha massa rader med text i mainmetoden
	 */
	private static void intro() {
		System.out.println("Welcome to guess the number!");
		System.out.println("Your goal is to guess the number generated between 1 and 100.");
		System.out.println("Pick a difficulty! Write 1 to get normal, 2 for hard, lastly 3 for extreme.");
		System.out.println("(1) Normal 15 guesses");
		System.out.println("(2) Hard 5 guesses");
		System.out.println("(3) Extreme 3 guesses");
	}

	/**
	 * Tar och skapar ett slump genererat tal mellan 1-100 och sedan returnar det
	 * 
	 * @return hiddenNumber
	 */
	private static int randomGenerator() {
		Random ranNum = new Random();
		int hiddenNumber = ranNum.nextInt(100) + 1;
		return hiddenNumber;
	}

	/**
	 * Tar in diffpicker som �r ett tal som spelaren matar in i konsollen och j�mf�r
	 * med 1 och tv� Sedan ger den en sv�righetsgrad beroende p� vad som matades in.
	 * 
	 * @param diffPicker
	 * @return Chosen
	 */
	private static String difficultyChoice() {
		Scanner input = new Scanner(System.in);
		String difficulty = "1";
		String diffPicker = input.nextLine();
		if (diffPicker.equalsIgnoreCase("1")) {
			difficulty = "15";
			System.out.println("You went with normal difficulty");
		} else if (diffPicker.equalsIgnoreCase("2")) {
			difficulty = "5";
			System.out.println("You went with hard difficulty");
		} else if (diffPicker.equalsIgnoreCase("3")) {
			difficulty = "3";
			System.out.println("You went with Extreme difficulty");
		} else {
			difficulty = "1";
			System.out.println("Since you didnt follow my instructions you'll only get 1 guesses");
		}
		return difficulty;
	}

	/**
	 * Tar in start som �r en boolean som best�mmer ifall spelet ska k�ras. Den tar
	 * ocks� in pAgain som �r ett tal som matas in i konsollen. Det tar och j�mf�r
	 * pAgain med f�rbest�mmda tal som anv�nds f�r ifall man vill k�ra igen. ifall
	 * det inte st�mmer igen med det taletet som �r best�mt s� skickar den tillbaka
	 * boolean som false vilket leder till att den st�nger av programmet.
	 * 
	 * @param start
	 * @param pAgain
	 * @return start
	 */
	private static boolean playAgain(boolean start) {
		Scanner input = new Scanner(System.in);
		String pAgain = input.nextLine();
		if (pAgain.equalsIgnoreCase("1")) {
			start = true;
		} else {
			start = false;
			System.out.println("Shutting down...");
			System.exit(0);
		}
		return start;
	}
}
