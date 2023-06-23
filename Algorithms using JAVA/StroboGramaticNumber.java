import java.util.Scanner;

public class StroboGramaticNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int t=n;
        int D=0; int R = 0;
        

        while(t>0)
        {
            D= t%10; 
            R= R*10;
            if(D==1 || D==8 || D==0 || D==6 || D==9)
            {
                if(D==6)
                D=9;

                else if (D==9)
                D=6;
            }

            R=R+D;
            t=t/10;
        }
        // System.out.println(R);
        if(R==n)
        {
            System.out.println(n+ " is a Strobogramatic Number");
        }
        else
        {
            System.out.println(n+ " is not a StroboGramtic Number");

        }

        sc.close();

    }
}
