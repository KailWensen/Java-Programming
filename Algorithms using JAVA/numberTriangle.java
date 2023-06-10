import java.util.Scanner;

public class numberTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        System.out.println("\nDownward Triangle");
        for (int i = n; i >0; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        
        System.out.println("\nDownward 13579 Triangle");
        for (int i = n; i >0; i--) {
            int x= 1;
            for (int j = 1; j <= i ; j++) {
                System.out.print(x+ " ");
                x+=2;
                
            }
            System.out.println();
        }
        in.close();
    }
}
