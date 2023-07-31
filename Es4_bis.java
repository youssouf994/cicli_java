/*4. Creare la classe Esercizio4, nal main dichiarare la variabile intera voto e assegnarle un valore da tastiera
Usando il costrutto if:
. se voto è <18 OPPURE > 30 visualizzare "voto non valido"
. altrimenti se voto è <=20 visualizzare  "giudizio sufficiente"
. altrimenti se voto è compreso tra 21 e 25 (inclusi) visualizzare "giudizio buono"
. altrimenti visualizzare "giudizio ottimo!" 
Rifare l'esercizio con il costrutto switch*/

package esercizi;

import  java.util.Scanner;

public class Es4_bis {
	
	public static void main(String[] args)
	{
		int voto;
		Scanner cin =new Scanner(System.in);
		
		System.out.println("Inserire il voto");
		voto=cin.nextInt();
		cin.close();
		
		switch(voto)
		{
			case 18, 19, 20 -> System.out.println("Giudizio sufficente");
			
			case 21, 22, 23, 24, 25 -> System.out.println("Giudizio buono");
			
			case 26, 27, 28, 29, 30 -> System.out.println("Giudizio ottimo");
			
			default -> System.out.println("Voto non valido");
		}
		
		
	}

}
