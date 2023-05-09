import java.io.*;
import java.util.*;

interface welcome1
{
    String welcome(String s1, String s2);
}

public class WelcomeUsingLambdaFI
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username");
        String n3=sc.next();
        String n2="Welcome to this program ";

        welcome1 w= (m,n)->m+n;
        System.out.println(w.welcome(n2, n3));
    }


}