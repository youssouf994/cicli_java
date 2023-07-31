/*2. Creare la classe Esercizio2, nal main dichiarare la variabile intera anni e assegnarle un valore da tastiera, usando il costrutto if:
. se anni < 18 stampare "minorenne"
. altrimenti stampare "maggiorenne"
Rifare l'esercizio utilizzando l'operatore ternario invece dell'if/else*/

package esercizi;

import java.util.Scanner;

public class es2 {
	public static void main(String[] args)
	{
		int anni;
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Inserire età dell'utente");
		anni=cin.nextInt();
		cin.close();
		
		if((anni<18)&&(anni>0))
		{
			System.out.println("Minorenne");
		}
		else if(anni>18)
		{
			System.out.println("Maggiorenne");	
		}
	}
}
