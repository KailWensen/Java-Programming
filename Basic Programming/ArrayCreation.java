import java.io.*;
import java.util.Arrays;
import java.util.*;

class ArrayCreation
{
    public static void main(String args[])
    {
        int a[]=new int[] {12,45,78,89,56,23};
        int b[]=new int[] {12,45,78,89,56,23};
        boolean result= Arrays.equals(a, b);//using predefined arrays class functions.
        System.out.println(result);

        int x[]=new int[] {12,45,78,89,56,23};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));//converting the whole object to string so that for loop wont be required for printing.

        String bikes[]={"Honda","KTM", "Royal Enfield", "Ducati", "Kawasaki","Jawa"};
        String Cars[]={"Honda", "TATA", "VolksWagon", "Ford","Hyundai"};
        //since string is also a predefined class like Arrays and Double, and not a primitive data type in java,
        //we need not use the 'new' keyword while defining arrays in string.
        boolean r= Arrays.equals(bikes, Cars);
        System.out.println(r);
    }
}