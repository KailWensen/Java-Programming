import java.io.*;

class BufferedReaderInput
{
public static void main(String args[])
{

InputStreamReader ir= new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(ir);

try
{
	
System.out.println("Enter Your First Name: ");		
String fname= br.readLine();
	
System.out.println("Enter Your Second  Name:");
String sname= br.readLine();


System.out.println("Enter Your Birthyear: ");
int byear= Integer.parseInt(br.readLine());

System.out.println("Enter current year: ");
int cyear= Integer.parseInt(br.readLine());


int Age= cyear-byear;
System.out.println("Hello,"+ fname +" "+ sname +". You are "+Age+" years old");
}
catch(IOException err)
{ System.out.println("Error Reading Line");}
catch(NumberFormatException err)
{System.out.println("Error reading Numbers");}

}
}