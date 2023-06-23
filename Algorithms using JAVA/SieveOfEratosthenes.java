import java.util.Scanner;

public class SieveOfEratosthenes {
    void ABC(int n) {
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i] = true;
        }
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j] = false; 
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 50
        
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        sieve.ABC(n);

        in.close();
        // True means prime
        // False means not prime

        
    }
}
