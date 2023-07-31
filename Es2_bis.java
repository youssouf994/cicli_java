package esercizi;

import java.util.Scanner;

public class Es2_bis {
	public static void main(String[] args)
	{
		int anni;
		String ris;
		
		Scanner cin = new Scanner(System.in);
		cin.close();
		
		System.out.println("Inserire età dell'utente");
		anni=cin.nextInt();
		
		ris=anni<18?"Minorenne":"Maggiorenne";
		
		System.out.println(ris);
		
	}
}
