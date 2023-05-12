import java.util.*;

public class LexicographicallyPalindrome 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        int len = s.length();
        char[] str = new char[len];

        for(int i = 0; i<s.length(); i++)
        {
            str[i]=s.charAt(i);
        }

        System.out.println(str);
        
        Arrays.sort(str);
        System.out.println("Lexicographically order is:"+str);

        freqCount(s);


    }

    public static int freqCount(str)
    {
        for (int i = 0; i < len; i++)
        {
            
           
        }
    }
    
}
