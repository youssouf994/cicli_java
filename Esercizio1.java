/*AREA RETTANGOLO*/

package esercizi;

import java.util.Scanner;


public class Esercizio1 
{
	public double area_rett(double b, double h)
	{
		double ris;
		
		ris=b*h;
		
		return ris;
	}
	
	public static void main(String[] args)
	{
		double base, altezza, area;
		
		Scanner cin= new Scanner(System.in);
		Esercizio1 istanza= new Esercizio1();
		
		System.out.println("calcolo area del rettangolo");
		
		System.out.print("Inserire base ");
		base=cin.nextDouble();
		System.out.print("Inserire altezza ");
		altezza=cin.nextDouble();
		
		area=istanza.area_rett(base, altezza);
		
		System.out.println("l'area del rettangolo è: " + area);
	}
}
