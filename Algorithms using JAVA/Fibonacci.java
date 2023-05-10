import java.util.Scanner;
public class Fibonacci  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for(int i=0;i<=n;i++){
            System.out.print(f3+" ");
            f1 = f2;
            f2 = f3;
            f3 = f2 + f1;
        }
        in.close();
    }
}
