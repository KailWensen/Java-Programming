import java.io.*;
import java.util.*;

class forloop
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper limit of the countdown:");
        int n=sc.nextInt();
        for(int i=n; i>=0; i--)
        {
            System.out.println(i);
        }

    }
}