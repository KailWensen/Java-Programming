// Write  an  application  that  displays  a  box,  an  oval,  an  arrow  and  a  diamond  using asterisks(*).


import java.io.*;
import java.util.*;

class box
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("This is a program to create Shapes of entered sizes. ~Created by Aviral Srivastva 20BCG10108");
		System.out.println("Enter the size for Square");
		int size= sc.nextInt();

		
		
	
		for(int i=0; i<size; i++)
		{
            // first and last rows
            if(i == 0 || i == size-1)
			{
                for(int j=0; j<size; j++)
				{
                    System.out.print("*");
                }
            }
			else
			{
                System.out.print("*");
                for(int j=0; j<size-2; j++)
				{
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
		}

		System.out.println("Enter the Radius For the oval/Circle");
		int radius=sc.nextInt();

		double dist;
 
		
		for (int i = 0; i <= 2 * radius; i++)
		{
			for (int j = 0; j <= 2 * radius; j++) 
			{
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
				if (dist > radius - 0.5 && dist < radius + 0.5)
				System.out.print("*");
				else
				System.out.print(" ");
			}
	 
			System.out.print("\n");
		}

		System.out.println("Printing an arrow using only '*':");

		for (int i = 1; i <= 5; i++) 
		{
			if (i != 5)
				System.out.printf("%5s", "");
		
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			if (i == 4) 
			{
				for (int f = 0; f < 5; f++) 
				{
					System.out.print("*");
				}
			}
		}
		for (int i = 1; i <= 5; i++) 
		{
			
			System.out.printf("%5s", "");
			for (int j = 4; j >= i; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
}