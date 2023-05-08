import java.io.*;
import java.util.Scanner; //Importing scanner class to accept input from the user.

class ScannerClassInput
{
	public static void main(String args[])
	{
	Scanner inp=new Scanner(System.in); //declaring Scanner Initialisation.

	System.out.print("Enter Your Name: ");
	String Name=inp.next();
	System.out.println("The name you entered is: "+ Name);
	//Enter Only 1 word else use string array to enter multiple words or a sentence.

	System.out.print("Enter your Age: ");
	int Age=inp.nextInt();
	System.out.println("The age you entered is: "+ Age);

	inp.close();//closing the scanner class to free all the used up space in the RAM.
	}
} 	