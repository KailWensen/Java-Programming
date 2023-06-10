import java.util.*;

public class NibbleSwap 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to swap:");
        int n=sc.nextInt();

        String a=Integer.toBinaryString(n);

        System.out.println(a);

        int al=a.length();
        String af="";

        if(al!=8)
        {
            int d = 7-al;
            for(int i=0; i<=d; i++)
            {af=af+"0";}

            af=af+a;
        }

        System.out.println(af);
        
        int l1=af.length()/2;
        int nibble[]=new int[8];
        for(int i=0; i<=l1; i++)
        {
            for(int j=0; j<=3; j++)
            {
                nibble[j]=af.charAt(i);
                break;
            }
        }
        for(int i=0; i<=7; i++)
        {
            System.out.println(nibble[i]);
        }


        for(int i=l1+1; i>=a.length(); i--)
        {
            for(int j=4; j<=7;)
            {
                nibble[j]=i;
                break;
            }
        }

        for(int i=0; i<=7; i++)
        {
            System.out.println(nibble[i]);
        }

        String s1="";
        for(int i=0; i<=nibble.length; i++)
        {
            s1=s1+nibble[i];
        }

        int ns=Integer.parseInt(s1);

        System.out.println(ns);
        sc.close();

    }
    
}
