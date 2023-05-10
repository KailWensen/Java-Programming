import java.util.Scanner;
public class EulersTotientFunction {
    public static int gcd(int a,int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(gcd(i,n)==1){
                count++;
            }
        }
        System.out.println("The number of coprime numbers is "+count);
        in.close();
    }
}
