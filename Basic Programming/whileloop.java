import java.io.*;
import java.util.*;

class whileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the upper limit of the countdown:");
        int n= sc.nextInt();

        while(n>=0)
        {
            System.out.println(n);
            n--;
        }
    }
}