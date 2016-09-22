/**
* Program that prints two designs of stars
* using nested for loops.
* @author Matt Keller
* @version 1.0
*/

public class HomeWorkLoops
{
	public static void main(String[] args)
	{
		
	
	forLoop(4);
	System.out.println("-------------------");
	forLoop2(4);
	
	}


	public static void forLoop(int n)
	{
		for(int i = n; i > 0; i --)
		{
			for(int p = 1; p <= i; p ++)
			{
				System.out.print("*");
			
			}
		System.out.println();
		
		
		}
	
	
	
	}


	public static void forLoop2(int n)
	{
	
		for(int i = 1; i <= n; i ++)
		{
			for(int p = 1; p <= i; p ++)
			{
				System.out.print("*");
			
			}
		System.out.println();
		}
	
	
	
	
	}




}

