package v40;

public class monday {

	public static void main(String[] args) {
		
		// % == modulus
		int tal1 = 21;
		int tal2 = 42;
		int tal3 = 69;
		int tal4 = 420;
		
		
		System.out.println(tal1%3); // testar ifal tal1 är delbart med 3 om den är det blir svaret 0 annars visar den resten
		System.out.println(tal2%4); // testar ifal tal2 är delbart med 4 om den är det blir svaret 0 annars visar den resten
		System.out.println(tal3%5); // testar ifal tal3 är delbart med 5 om den är det blir svaret 0 annars visar den resten
		System.out.println(tal4%8); // testar ifal tal4 är delbart med 8 om den är det blir svaret 0 annars visar den resten
		
		int sum = 0;
		
		System.out.println("-------------------------------");
		for(int i = 0; i < 101 ; i++)	{
			if(i % 3 == 0)	{
				System.out.println("Talet " + i + " är delbart med tre");
				sum += i;
			}
		}
		System.out.println("The total sum of all intagers divisable by three is:" + sum);
		
		int turn = 0;
		while (true) {
			turn++;
			if (turn % 3 == 0)	{
				System.out.println("Bachris tur");
			}
			else if (turn % 3 == 1)	{
				System.out.println("Babrielles tur");
			}
			else if (turn % 3 == 2)	{
				System.out.println("Betters tur");
			}
			
			if	(turn == 100)	{
				break;
			}
		}
		
	}

}
