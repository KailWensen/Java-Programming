import java.util.Scanner;
class countDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        do{
            count++;
            n/=10;
        }while(n>0);
        System.out.println(count); 
        in.close();
    }
}