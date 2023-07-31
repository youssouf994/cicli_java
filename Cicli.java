package esercizi;

import java.util.Scanner;

public class Cicli {
	
	public static void _whi()
	{
		int i;
		
		i=0;
		while(i<10)
		{
			if(i%2!=0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println(" ");
	}
	
	public static void _dowhi()
	{
		int i;
		i=0;
		
		do
		{
			if(i%2!=0)
			{
				System.out.print(i + " ");
			}
			i++;
		}while(i<10);
		
		System.out.println(" ");
	}
	
	public static void _for()
	{
		int i;
		
		for(i=0;i<10;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.println(" ");
	}
	
	public static void pari_for()
	{
		int i;
		
		for(i=0;i<10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.println(" ");
	}
	
	public static void pari_dowhi()
	{
		int i;
		i=0;
		
		do
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
			i++;
		}while(i<10);
		
		System.out.println(" ");
	}
	
	public static void pari_whi()
	{
		int i;
		
		i=0;
		while(i<10)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println(" ");
	}
	
	public static void tav_pit()
	{
		int x, i;
		
		for(i=1;i<11;i++)
		{
			for(x=1;x<11;x++)
			{
				System.out.print(i*x + "\t");
			}
			
			System.out.println(" ");
		}
	}
	
	public static void dis1()
	{
		int i, x, y;
		
		for(i=1;i<6;i++)
		{
			y=0;
			for(x=1;x<6;x++)
			{
				while(y!=i)
				{
					System.out.print("*");
					y++;
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void dis2()
	{
		int i, j, k;
		final int rig=5;
		
		for(i=0;i<=rig;i++)
		{
			for(j=1;j<=rig-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void dis3()
	{
		int i, j;
		final int rig=5;
		
		for(i=0;i<rig;i++)
		{
			for(j=0;j<rig+1;j++)
			{
				System.out.print("*");
				if(j==i)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner cin = new Scanner (System.in);
		
		int scelta;
		
		do
		{
			System.out.println();
			System.out.print("""
							0. Arresta il programma
							1. Primi 5 num dispari - while
							2. Primi 5 num dispari - do while
							3. Primi 5 num dispari - for
							4. Primi 5 num pari - while
							5. Primi 5 num pari - do while
							6. Primi 5 num pari - for
							7. Tavola pitagorica dei numeri da 0 a 10
							8. Albero punto 8)
							9. Albero punto 9)
							10.Albero punto 10)
							""");
			scelta=cin.nextInt();
			
			
			switch(scelta)
			{
				case 1 -> _whi();
				
				case 2 -> _dowhi();
				
				case 3 -> _for();
				
				case 4 -> pari_whi();
				
				case 5 -> pari_dowhi();
				
				case 6 -> pari_for();
				
				case 7 ->tav_pit();
				
				case 8 -> dis1();
				
				case 9 -> dis2();
				
				case 10 -> dis3();
				
				case 0 -> System.exit(0); 
				//case 0 ->break; COME MAI NON FUNZIONA?
				
				default -> System.out.println("Scelta errata");
			}
			
		}while(scelta!=0);
		
		cin.close();
	}
}
