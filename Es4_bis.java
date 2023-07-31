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
