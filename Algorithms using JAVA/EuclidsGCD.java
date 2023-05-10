import java.util.*;

public class EuclidsGCD 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=sc.nextInt();
        System.out.println("Enter the second Number");
        int b=sc.nextInt();

        while(b>0)
        {   
            int temp=b;
            int q=a/b;
            int r=a%b;
            a=b;
            b=r;
        }

        System.out.println("The GCD is found to be: "+ a);
    }
    
}
