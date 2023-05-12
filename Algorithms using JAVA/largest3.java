import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = 0;
        if(a>b){
            if(b>c) max=a;
            else max=b;
        }
        else{
            if (b>c) max = b;
            else max = c;
        }
        // System.out.println();
        //
        // if(a>b && a>c) System.out.println(a);

        // else if(b > c) System.out.println(b);

        // else System.out.println(c);
        System.out.println(max);
        in.close();
    }
    
} 