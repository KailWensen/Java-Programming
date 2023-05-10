import java.util.Scanner;
import java.lang.Math;
public class equationsGP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        float x = in.nextInt();
        System.out.println("Enter y");
        float y = in.nextInt();
        float sum=0;
        for(int i=1;i<=y;i++){
            sum+=(1/Math.pow(x, i));
        }
        System.out.println(sum);
    
        in.close();
    }
}
