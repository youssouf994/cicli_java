package esercizi;

import  java.util.Scanner;

public class Es4 {
	
	public static void main(String[] args)
	{
		int voto;
		Scanner cin =new Scanner(System.in);
		
		System.out.println("Inserire il voto");
		voto=cin.nextInt();
		cin.close();
		
		if((voto<18)||(voto>30))
		{
			System.out.println("Voto non valido");
			
		}
		else if (voto<=20)
		{
			System.out.println("Giudizio sufficente");
		}
		
		else if((voto>=21)&&(voto<=25))
		{
			System.out.println("Giudizio buono");
		}
		else
		{
			System.out.println("Giudizio ottimo");
		}
	}

}
