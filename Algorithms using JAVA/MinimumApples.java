import java.util.Scanner;

public class MinimumApples {
    public void MA(int m,int k, int n, int e, int w, int s) {
        if(m <= s*k) 
            System.out.println(m);
        else if(m <= s*k+e+w) 
            System.out.println(s*k + (m-s*k)*k);
        else 
            System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,e,w,s=0;

        int m,k=0;

        // System.out.println("Enter the number of apples");
        m = in.nextInt();
        k = in.nextInt();
        n = in.nextInt();
        e = in.nextInt();
        w = in.nextInt();
        s = in.nextInt();
        
        // System.out.print("Minimum number of apples : ");
        
        // DriverCode
        MinimumApples x = new MinimumApples();
        x.MA(m,k,n,e,w,s);
        in.close();

    }
}
