import java.util.*;

public class LeadersInArray 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int [size];

        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the "+ i +" element of the array:");
            a[i]=sc.nextInt();
        }
        Leaders(a);
        sc.close();
    }

    public static void Leaders (int[] a)
    {
        int size = a.length;
        
        int max_from_right =  a[size-1];
        System.out.print(max_from_right + " ");
       
        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < a[i])
            {           
            max_from_right = a[i];
            System.out.print(max_from_right + " ");
            }
        }    

       
    }
    
}
