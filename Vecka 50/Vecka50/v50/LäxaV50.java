import java.util.Scanner;

public class LäxaV50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("*Yuck* you again... i guess you can choose an alternative below..");
		System.out.println("(1) - Continue");
		System.out.println("(2) - New Game");
		System.out.println("(3) - Load Game");
		System.out.println("(4) - Options");
		System.out.println("(5) - Credits");
		System.out.println("(6) - Quit");
		System.out.println();

		choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("You cant continue...");
			break;
		case 2:
			System.out.println("You dont have access to play this game...");
			break;
		case 3:
			System.out.println("Please start a game first");
			break;
		case 4:
			System.out.println("You cant even play the game so why bother changing the options");
			break;
		case 5:
			System.out.println("Made by beter with the guide of bomas beis");
			break;
		case 6:
			System.out.println("Shutting down...");
			break;

		default:
			System.out.println("Bruh we asked for a number between 1 to 6...");
			break;
		}
	}
}


