/*3. Creare la classe Esercizio3, nal main dichiarare due variabili reali x e y ed assegnare loro valori a piacere, usando il costrutto if:
. se x è maggiore di y stampare "x > y"
. altrimenti se x è minore di y stampare "x < y"
. altrimenti stampare "x = y"*/

package esercizi;

public class Es3 {
	public static void main(String[] args)
	{
		int x, y;
		
		x=5;
		y=7;
		
		if(x>y)
		{
			System.out.println("x>y");
		}
		else if(x<y)
		{
			System.out.println("x<y");
		}
		else if(x==y)
		{
				System.out.println("x=y");
		}
	}

}
