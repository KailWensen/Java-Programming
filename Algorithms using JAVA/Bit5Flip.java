import java.util.*;


public class Bit5Flip 
{
    public static void countMaxOne(int[] arr)
    {
        int maxCount =0;
        int start = 0;
        int k = 1;
        int zeroCount=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {zeroCount++;}
        

            while(zeroCount > k)
            {
                if(arr[start]  == 0)
                {zeroCount--;}
                start++;
            }

            maxCount = Math.max(maxCount, i-start+1);

        }
        System.out.println("The Maximum number of 1's after fliping aat most 1 zero is: " +maxCount);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary sequence:");

        int n = sc.nextInt();
        int c=0;
        

        String temp = Integer.toString(n);

    int[] num = new int[temp.length()];

    for (int i = 0; i < temp.length(); i++){
        num[i] = temp.charAt(i) - '0';
    }

    for (int i = 0; i < temp.length(); i++) {
        System.out.print(num[i]);
    }
       countMaxOne(num);
        sc.close();
        
    }
    
}
