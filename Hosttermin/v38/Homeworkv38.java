package v38;

import java.util.Scanner;

public class Homeworkv38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		double helTal1 = 0;
		double helTal2 = 0;
		double helTal3 = 0;  // initierar så att det finns tal
		double helTal4 = 0;
		double helTal5 = 0;
		double stor = 0;
		double liten = 0;
		double medel = 0;
		
		
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Skriv 5 olika nummer så räknar jag ut säger jag det största, minsta och medelvärdet på dem!");
		
		helTal1 = input.nextDouble();
		helTal2 = input.nextDouble();
		helTal3 = input.nextDouble();  // mina 5 tal som jag skriver
		helTal4 = input.nextDouble();
		helTal5 = input.nextDouble();
		
		if(helTal1 >= helTal2 && helTal1 >= helTal3 && helTal1 >= helTal4 && helTal1 >= helTal5 ){
			stor = helTal1;
			}
		else if (helTal2 >= helTal1 && helTal2 >= helTal3 && helTal2 >= helTal4 && helTal2 >= helTal5){   //allt detta ger mig det Heltalet som är störst som en variabel
			stor = helTal2;
			}
		else if (helTal3 >= helTal2 && helTal3 >= helTal1 && helTal1 >= helTal4 && helTal3 >= helTal5){
			stor = helTal3;
			}
		else if (helTal4 >= helTal2 && helTal4 >= helTal3 && helTal4 >= helTal1 && helTal4 >= helTal5){
			stor = helTal4;
			}
		else {stor = helTal5;}
		
		
		
		if(helTal1 <= helTal2 && helTal1 <= helTal3 && helTal1 <= helTal4 && helTal1 <= helTal5 ){
			liten = helTal1;
			}
		else if (helTal2 <= helTal1 && helTal2 <= helTal3 && helTal2 <= helTal4 && helTal2 <= helTal5){   //allt detta ger mig det Heltalet som är minst som en variabel
			liten = helTal2;
			}
		else if (helTal3 <= helTal2 && helTal3 <= helTal1 && helTal1 <= helTal4 && helTal3 <= helTal5){
			liten = helTal3;
			}
		else if (helTal4 <= helTal2 && helTal4 <= helTal3 && helTal4 <= helTal1 && helTal4 <= helTal5){
			liten = helTal4;
			}
		else {liten = helTal5;}
		
		int litenInt = (int) liten;
		int storInt = (int) stor;
		
		medel = (helTal1 + helTal2 + helTal3 + helTal4 + helTal5)/5; //Ger mig medelvärdet
		
		
		System.out.println("Största talet är:" + "\t" +  storInt);
		System.out.println("Minsta talet är:" + "\t" + litenInt); //skriver ut allt
		System.out.println("Medelvärdet är:" + "\t" +  "\t" + medel);
				
			
		
	}

}
