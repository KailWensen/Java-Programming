import java.lang.*;
import java.util.*;
 
class ExtendedEuclid {
    public static int gcdExtended(int a, int b, int x,int y)
    {
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }
 
        int x1 = 1, y1 = 1; 
        int gcd = gcdExtended(b % a, a, x1, y1);
        x = y1 - (b / a) * x1;
        y = x1;
 
        return gcd;
    }
 
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        int x = 1, y = 1;
        System.out.println("Enter the numbers for Extended Euclid Algorithm - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcdExtended(a, b, x, y);
        System.out.print("gcd of " + a + " and " + b + " is = " + gcd);
    }
}