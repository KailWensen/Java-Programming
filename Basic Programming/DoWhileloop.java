import java.io.*;
import java.util.*;

class DoWhileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the upper limit of the countdown:");
        int n= sc.nextInt();

        do
        {
            System.out.println(n);
            n--;
        }
        while(n>=0);
    }
}