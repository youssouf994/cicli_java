/*2. Creare la classe Esercizio2, nal main dichiarare la variabile intera anni e assegnarle un valore da tastiera, usando il costrutto if:
. se anni < 18 stampare "minorenne"
. altrimenti stampare "maggiorenne"
Rifare l'esercizio utilizzando l'operatore ternario invece dell'if/else*/

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
