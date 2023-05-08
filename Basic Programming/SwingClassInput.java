import javax.swing.*;

class SwingClassInput
{
public static void main(String args[])
{
	int sum, a, b;
	String s1=JOptionPane.showInputDialog("Enter the first number: ");
	a=Integer.parseInt(s1);

	String s2=JOptionPane.showInputDialog("Enter the Second number: ");
	b= Integer.parseInt(s2);
	sum=a+b;
	System.out.println("The sum of the enetered two numbers is: " + sum);
}
}