import java.util.*;



public class KaratsubaAlgorithm 
{
    public static long mult(long x, long y)
    {
        if(x<10 && y<10)
        {
            return x*y;
        }
    
    
    int num1length = numLength(x);
    int num2length = numLength(y);

    long  maxLength = (long) Math.max(num1length, num2length);

    long halfMaxLength = (long) (maxLength/2)+(maxLength%2);

    long maxLengthTen = (long) Math.pow(10, halfMaxLength);

    long a = x/maxLengthTen;
    long b = x%maxLengthTen;
    long c = y/maxLengthTen;
    long d = y%maxLengthTen;

    long z0= mult(a, c);
    long z1= mult(a+b, c+d);
    long z2= mult(b, d);

    long ans = (z0 * (long) Math.pow(10, halfMaxLength*2) + ((z1-z0-z2)* (long) Math.pow(10, halfMaxLength)+ z2));

    return ans;

    }

    public static int numLength(long n)
    {
        int nolen = 0;
        while(n>0)
        {
            nolen++;
            n=n/10;
        }

        return nolen;
    }

    public static void main(String args[])
    {
        long n1 =1234* 5678;

        long n2 = mult(1234, 5678);

        System.out.println("Expected product:"+ n1);
        System.out.println("Calculated product:"+ n2);
    }

}
