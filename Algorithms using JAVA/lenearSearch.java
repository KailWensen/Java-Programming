import java.util.Scanner;

class lenearSearch {
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i< size-1; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the element to search:");
        int a = sc.nextInt();

        for ( int i = 0; i < size - 1; i++)
        {
            if (arr[i] == a) 
            {
                System.out.println("Element found at index:" + i);
            } else 
            {
                System.out.println("Element not found");
            }
        }
    }
}