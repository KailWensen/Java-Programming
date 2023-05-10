import java.util.Scanner;
public class IntToBin {
    // public static int bin(int n){
    //     int bin = 0,i=n;
    //     while(i>0){
    //         int rem = i%2;
    //         bin = bin * 10 +  rem;
    //         i = i/2;
    //     }
    //     return bin;
    // }

    public static void palindrome(String res){
     
        for(int i=0; i<res.length(); i++){
            if(res.charAt(i) != res.charAt(res.length()-1-i)){
                System.out.println("Not a palindrome");
                return;
            }
            else 
            System.out.println(" a palindrome");
            return;
                
        }
        
        }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String res = Integer.toBinaryString(n);
        // String res = Integer.toString(bin(n));
        System.out.println(res);
        palindrome(res);
        in.close();

        
    }
}
