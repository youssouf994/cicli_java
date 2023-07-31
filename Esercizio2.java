/*FORMULARIO NON COMPLETO-AREA RETTANGOLO/AREA CERCHIO*/

package esercizi;

import java.util.Scanner;//libreria per l'input

public class Esercizio2 {//classe principale
	
	final double pi=3.14159265358979;//costante con il pi greco
	
	public double area(double r)//metodo per calcolare l'area non statico in modo
	{							//da poter ritornare un valore 
		double ris;
		
		ris=r*r;
		ris =ris* pi;
		
		return ris;
	}
	
	public double area_rett(double b, double h)
	{
		double ris;
		
		ris=b*h;
		
		return ris;
	}
	
	public static void main(String[] args)//metodo main
	{
		double raggio, risultato;
		double area, base, altezza;
		int scelta;
		
		Scanner cin = new Scanner(System.in);//istanzio il buffer input
		
		/*alloco spazio in memoria per i metodi della classe Esercizio2 e new
		 * restituisce l'indirizzo di posizionamento in ram dei metodi
		 */
		Esercizio2 formule= new Esercizio2();
		do
		{
			System.out.print("""
					-SCELTA OPERAZIONI-
					1.Area cerchio
					2.Area rettangolo
					9.Interrompi
					""" );
			
			scelta=cin.nextInt();
			
			switch(scelta)
			{
				case 1:
					
					System.out.println("CALCOLO AREA DI UN CERCHIO");
					System.out.println(" ");
					
					
					System.out.print("Inserire il raggio del cerchio: ");
					raggio=cin.nextDouble();
					
					risultato=formule.area(raggio);//richiamo il metodo area dalla nuova istanza della classe es.2
					System.out.println("L'area del cerchio è pari a: "+risultato);
					System.out.println(" ");
					break;
					
				case 2:
					
					System.out.println("calcolo area del rettangolo");
					
					System.out.print("Inserire base ");
					base=cin.nextDouble();
					System.out.print("Inserire altezza ");
					altezza=cin.nextDouble();
					
					area=formule.area_rett(base, altezza);
					
					System.out.println("l'area del rettangolo è: " + area);
					System.out.println(" ");
					break;
					
				case 9:
					System.exit(0);
					cin.close();
					
				default:
					System.out.println("Inserimento errato");
			}

		}while(scelta!=9);
				
		
	}

}
