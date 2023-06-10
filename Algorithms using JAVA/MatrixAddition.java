import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Declaring Matrix
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        // Input Matrix
        System.out.println("Input Matrix A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
            }
        } 
        System.out.println("Input Matrix B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = in.nextInt();
            }
        } 
        System.out.println("Sum of Matrix A and B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        } 
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        } 
        in.close();
        
        
        
        
        
        
    }
}
