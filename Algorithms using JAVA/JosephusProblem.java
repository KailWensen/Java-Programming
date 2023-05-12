import java.util.*;
public class JosephusProblem{
    
    static int winner(int size, int k)
    {
        if(size == 1)
         return 1;
        
        else
            return ((winner(size -1, k) + k -1) % size + 1); 

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size: ");
        size = sc.nextInt();
        int k;
        System.out.println("Enter k: ");
        k = sc.nextInt();

        System.out.println("Winner of Game: ");
        System.out.print(winner(size, k));
        sc.close();
    }
}
