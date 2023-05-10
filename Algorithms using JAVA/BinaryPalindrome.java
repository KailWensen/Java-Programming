import java.util.*;

import javax.xml.validation.Schema;


public class BinaryPalindrome 
{
     
    public static void palindrome(String n)
    {
        int i;
        String r="";
        int j=0;
        int length=n.length();
        for(i=length-1; i>=0; --i)
        {
            r=r+n.charAt(i);
        }
        System.out.println("The original number'sbinary form is: "+n);
        System.out.println("The Reversed binary form for the number is:"+ r);
        j=r.compareToIgnoreCase(n);
        System.out.println(j);
        if(j==0)
        System.out.println("The number is a binary palindrome");
        else 
        System.out.println("The number is not a binary palindrome");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number you want to check for binary palindrome");
        int a = sc.nextInt();
        
        String a1=Integer.toBinaryString(a); 
        palindrome(a1);
    }
}
