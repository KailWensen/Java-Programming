
import java.util.Scanner;
class Blood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        int weight = in.nextInt();
        if((age > 18) && (weight > 50)){
            System.out.println("Eligible to donate blood"); 
        }
        else{
            System.out.println("Not eligible to donate blood"); 
            
        }
        in.close();
    }
}