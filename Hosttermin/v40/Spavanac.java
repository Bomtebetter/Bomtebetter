package v40;

import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
        int minute = input.nextInt();

        minute = minute - 45;

        if(minute < 0) {
            minute = minute + 60;
            hour = hour - 1;
        }    if(hour < 0) {
            hour = hour + 24;
        }


        System.out.println(hour + " " + minute);
    }
}


