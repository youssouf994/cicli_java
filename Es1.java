/*1. Creare la classe Esercizio1, nel main dichiarare due variabili booleane di nome b1 e b2 ed assegnare loro valori a piacere, usando il costrutto if e 
gli operatori logici:
. se sono entrambe vere (true) stampare "tutto apposto" 
. altrimenti "qualcosa non quadra"*/

package esercizi;

public class Es1 {
	public static void main(String[] args)
	{
		 boolean b1, b2;
		 
		 b1=true;
		 b2=false;
		 
		 if((b1==true)&&(b2==true))
		 {
			 System.out.println("Tutto a posto");
		 }
		 else
		 {
			 System.out.println("Qualcosa non quadra");
		 }
		 
	}

}
