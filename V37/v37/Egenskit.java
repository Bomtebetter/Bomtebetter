package v37;

public class Egenskit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String namn = input.nextline();
		
		System.out.println("Hur gammal �r du?");
		String �lder = input.nextline();
		
		System.out.println("Vad �r din hemadress?");
		String adress = input.nextline();
		
		System.out.println("Vilket �r ditt postnummer?");
		String postnummer = input.nextline();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextline();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String telefonnummer = input.nextline();
		
		System.out.println("Information");
		System.out.println("Namn:" + namn + "\n" + "�lder:" + �lder + "\n" + "Adress:" + adress + "\n"
			+	"Postnummer:" + postnummer + "\n" + "Stad:" + stad + "\n" + "Telefonnummer" + telefonnummer);
		
		
		

	}

}
