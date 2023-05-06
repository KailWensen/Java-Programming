import  java.io.*;
import java.util.*;

class Area
{
public static void main(String args[])
{	
	Scanner sc= new Scanner (System.in);
	double Area=0.0;

	System.out.println("1. Area of the Circle.");
	System.out.println("2. Area of the triangle.");
	System.out.println("3. Area of the Rectangle.");
	System.out.println("4. Area of the Square.");
	
	System.out.println("Enter your choice: ");
	int ch= sc.nextInt();
	
	
	switch(ch)
	{
		case 1:
		System.out.println("Enter the Radius of the circle:");
		double r= sc.nextDouble();
		Area= 3.14*r*r;
		System.out.println("The Area of the circle is :"+ Area);
		break;
	
		case 2:
		System.out.println("Enter the height and base of the triangle:");
		double h= sc.nextDouble();
		double br= sc.nextDouble();
		Area= (br*h)/2;
		System.out.println("The Area of the Triangle is :"+ Area);
		break;
		

		case 3:
		System.out.println("Enter the breadth and length of the rectangle:");
		double l= sc.nextDouble();
		double b= sc.nextDouble();
		Area= l*b;
		System.out.println("The Area of the Rectangle is :"+ Area);
		break;
		
		case 4:
		System.out.println("Enter the Side of the square:");
		double s= sc.nextDouble();
		Area= s*s;
		System.out.println("The Area of the Square is :"+ Area);
		break;
		
		default:
		System.out.println("The entered Choice is invalid"); 
		sc.close();

	}
}
}