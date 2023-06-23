import java.util.*;

public class WeightOfString 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter the second String: ");
        String s2 = sc.nextLine();

        System.out.println("Enter the Value of K:");
        int k = sc.nextInt();

        int l1 = s1.length();
        String s22 = s2.substring(0, l1);
        int[] sum =new int[s2.length()];
        
        int rows = l1;
        int e=0;
        int add = 0;
        for(int z=0; z<=s1.length(); z++)
        {
            for(int i = z; i <= s1.length() ;  i++)
            {
                for(int j = z; j<=i; j++)
                {
                    System.out.print(s2.charAt(j));
                    add = add+j;
                    sum[e]=add;
                }
                e++;
                add=0;
                
                System.out.println();
            }
        }
        for(int i=0; i<=sum.length; i++)
        System.out.println(sum[i]);
    }
}
